package com.example.msp;

import com.example.msp.database.entity.Users;

public class TestMapperUtil {

	public static Users newUsers() {
		
		Users user = new Users();
		
		user.setContent("Java OOP In One Place");
		user.setUserName("C.Ronaldo");
		user.setEmail("cronaldo@gmail.com");
		user.setGender("Male");
		user.setAge(29);
		
		return user;
	}
}
