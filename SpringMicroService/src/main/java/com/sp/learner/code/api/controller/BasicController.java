package com.sp.learner.code.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@GetMapping
	public ResponseEntity<Map> index()
	{
		Map m = new HashMap<String,String>();
		m.put("Name", "Ganesha");
		return new ResponseEntity<Map>(m, HttpStatus.OK);
	}
	
	@GetMapping(path="/getallusers")
	public ResponseEntity<UserModel> getAllUsers()
	{
		UserModel u = new UserModel();
		u.setUserid(1);
		u.setUsername("Ganesha");
		
		return new ResponseEntity<UserModel>(u, HttpStatus.OK);
	}
	

	
}
