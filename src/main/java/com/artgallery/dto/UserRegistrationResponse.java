package com.artgallery.dto;

import com.artgallery.model.User;

public class UserRegistrationResponse extends CommanApiResponse {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
