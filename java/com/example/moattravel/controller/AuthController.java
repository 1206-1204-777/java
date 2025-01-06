package com.example.moattravel.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.moattravel.entity.User;
import com.example.moattravel.entity.VerificationToken;
import com.example.moattravel.event.SignupEventPublisher;
import com.example.moattravel.form.SignupForm;
import com.example.moattravel.service.UserService;
import com.example.moattravel.service.VerificationTokenService;

@Controller
public class AuthController {
	private final UserService userService;
	public final SignupEventPublisher signupEventPublisher;
	private final VerificationTokenService verificationTokenService;

	public AuthController(UserService userService, SignupEventPublisher signupEventPublisher,
			VerificationTokenService verificationTokenService) {
		this.userService = userService;
		this.signupEventPublisher = signupEventPublisher;
		this.verificationTokenService = verificationTokenService;

	}

	@GetMapping("/login")
	public String login() {
		return "auth/login";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("signupForm", new SignupForm());
		System.out.println("takara");
		return "auth/signup";
	}

	@PostMapping("/signup")
	public String signup(@ModelAttribute @Validated SignupForm signupForm, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, HttpServletRequest httpServletReqest) {
		System.out.println(1);

		if (userService.isEmailRegistered(signupForm.getEmail())) {
			FieldError fieldError = new FieldError(bindingResult.getObjectName(), "email", "すでに登録済のメールアドレスです。");
			bindingResult.addError(fieldError);
		}
		System.out.println(2);

		if (!userService.isSamePassword(signupForm.getPassword(), signupForm.getPasswordConfirmation())) {
			FieldError fieldError = new FieldError(bindingResult.getObjectName(), "password", "パスワードが一致しません");
			bindingResult.addError(fieldError);
		}

		if (bindingResult.hasErrors()) {
			System.out.println(3);
			return "auth/signup";
		}

		User createdUser =userService.create(signupForm);
		String requestUrl = new String(httpServletReqest.getRequestURL());

		signupEventPublisher.publishSignupEvent(createdUser, requestUrl);
		
		//String successMessage = "ご入力頂いたメールアドレスにに認証メールを送信しました。メールに記載されリンクをクリックし、登録を完了してください。";
		redirectAttributes.addFlashAttribute("successMessage", "ご入力頂いたメールアドレスにに認証メールを送信しました。メールに記載されリンクをクリックし、登録を完了してください。");
		return "redirect:/";
	}

	@GetMapping("/signup/verify")
	public String verify(@RequestParam(name = "token") String token, Model model) {
		VerificationToken verificationToken = verificationTokenService.getVerificationToken(token);

		if (verificationToken != null) {
			User user = verificationToken.getUser();
			userService.enabledUser(user);

			String successMessage = "会員登録が完了しました。";
			model.addAttribute("successMessage", successMessage);
			
		} else {
			String errorMessage = "トークンが無効です";
			model.addAttribute("errorMessage", errorMessage);
		}
		return "auth/verify";
	}
}