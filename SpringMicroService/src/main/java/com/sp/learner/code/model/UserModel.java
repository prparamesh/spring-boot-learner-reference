package com.sp.learner.code.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data 
public class UserModel {
	//@Email
    @NotNull(message="First name cannot be missing or empty")
    @Size(min=2, message="First name must not be less than 2 characters")
	private String username;
	private long userid;

}
