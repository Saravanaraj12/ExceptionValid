package com.projectUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserDoa ud;
	public String add(UserDetails u) {
		// TODO Auto-generated method stub
		return ud.add(u);
	}

}
