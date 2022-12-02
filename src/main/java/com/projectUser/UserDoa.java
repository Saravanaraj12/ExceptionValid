package com.projectUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDoa {
@Autowired
UserRepo ur;
	public String add(UserDetails u) {
		// TODO Auto-generated method stub
		ur.save(u);
		return "data Saved Successfully";
	}

}
