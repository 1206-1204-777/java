package com.example.moattravel.event;

import org.springframework.context.ApplicationEvent;

import com.example.moattravel.entity.User;

import lombok.Getter;

@Getter
public class SignupEvent extends ApplicationEvent {
	private User user;
	private String requestUrl;

	public SignupEvent(Object sorce, User user, String requestUrl) {
		super(sorce);
		this.user = user;
		this.requestUrl = requestUrl;
	}
}
