package com.example.msp;

import com.example.msp.domain.user.dto.UsersDto;

public class TestServiceUtil {

	public static UsersDto newUsersDto() {
		
		UsersDto userDto = new UsersDto();
		
		userDto.setContent("Java OOP In One Place");
		userDto.setUserName("C.Ronaldo");
		userDto.setEmail("cronaldo@gmail.com");
		userDto.setGender("Male");
		userDto.setAge(29);
		
		return userDto;
	}
}
