package com.sp.learner.code.api.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sp.learner.code.model.UserModel;

@RestController
public class BasicController {

	ArrayList<UserModel> users = new ArrayList<>();
	
	@GetMapping
	public ResponseEntity<Map> index()
	{
		Map m = new HashMap<String,String>();
		m.put("Name", "Ganesha");
		return new ResponseEntity<Map>(m, HttpStatus.OK);
	}
	
	@GetMapping(path = "throwexception")
	public String throwException()
	{
		int i = 5/0;
		System.out.println(i);
		return "OK";
	}
	
	@GetMapping(path="/users")
	public ResponseEntity<ArrayList> getAllUsers()
	{
		if(users.isEmpty())
		{
			return new ResponseEntity<ArrayList>(new ArrayList(), HttpStatus.NOT_FOUND);
		}
		else
		{
			return new ResponseEntity<ArrayList>(users, HttpStatus.OK);
		}
		
	}
	
	@PostMapping(path="/push/user", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserModel> pushUser(@Valid @RequestBody UserModel user)
	{
		System.out.println(user.getUsername());
		System.out.println(user.getUserid());
		
		users.add(user);
		return new ResponseEntity<UserModel>(user, HttpStatus.OK);
	}
	
	@PostMapping(path = "formparam")
	public String getFormParam(@RequestParam("fieldid") String fieldid )
	{
		return fieldid;
	}
	
	@PostMapping(path = "pathparam")
	public String getPathParam(@PathVariable ("fieldid") String fieldid )
	{
		return fieldid;
	}
	
}
