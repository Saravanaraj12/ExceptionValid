package com.projectUser;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@Autowired
	UserService us;
	@PostMapping("/add")
	public String add(@Valid@RequestBody UserDetails u) {
	return us.add(u);
	
	}

}
