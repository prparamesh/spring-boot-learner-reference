package com.sp.learner.code.user.ReqModel;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRequestModel implements Serializable{

	@NotNull(message="First name cannot be null")
	@Size(min=2, message="First name cannot be less than two characters")
	private String firstName;
	@NotNull(message="Last name cannot be null")
	@Size(min=2, message="Last name cannot be less than two characters")
	private String lastName;
	@Email
	private String email;
	
}
