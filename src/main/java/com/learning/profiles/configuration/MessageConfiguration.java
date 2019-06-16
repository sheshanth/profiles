package com.learning.profiles.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MessageConfiguration {

	@Value("${app-message}")
	private String message;

	public MessageConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageConfiguration(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageConfiguration [message=" + message + "]";
	}

}
