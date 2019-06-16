package com.learning.profiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.profiles.configuration.MessageConfiguration;

@RestController
public class ProfileService {

	@Autowired
	private MessageConfiguration messageConfiguration;
	
	@GetMapping(value = "/")
	public MessageConfiguration getMessage() {
		System.out.println(process.env);
		return new MessageConfiguration(messageConfiguration.getMessage());
	}
	
}
