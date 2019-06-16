package com.learning.profiles.beans;

public class MessageBean {

	private String message;

	public MessageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageBean(String message) {
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
