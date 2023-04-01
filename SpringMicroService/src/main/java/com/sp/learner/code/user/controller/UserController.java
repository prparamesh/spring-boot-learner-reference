package com.sp.learner.code.user.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.learner.code.user.ReqModel.UserRequestModel;

@RequestMapping("/user")
@RestController
public class UserController {

	@GetMapping
	public String index()
	{
		return "Jai Sri Ram";
	}
	
	@PostMapping(path = "/save", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE} )
	public UserRequestModel SaveUserData(@RequestBody UserRequestModel object)
	{
		return object;
	}
	
}
