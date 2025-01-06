package com.example.moattravel.service;

import org.springframework.stereotype.Service;

import com.example.moattravel.entity.User;
import com.example.moattravel.entity.VerificationToken;
import com.example.moattravel.repository.VerificationTokenRepository;

@Service
public class VerificationTokenService {
	private final VerificationTokenRepository verificationTokenRepository;

	public VerificationTokenService(VerificationTokenRepository verificationRepository) {
		this.verificationTokenRepository = verificationRepository;
	}

	public void create(User user, String token) {
		VerificationToken verificationToken = new VerificationToken();

		verificationToken.setUser(user);
		verificationToken.setToken(token);

		verificationTokenRepository.save(verificationToken);

	}

	public VerificationToken getVerificationToken(String token) {
		return verificationTokenRepository.findByToken(token);
	}
}
