package com.example.msp.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msp.database.entity.Users;
import com.example.msp.domain.user.dao.UserUpdateConfirmDao;
import com.example.msp.domain.user.dto.UsersDto;

@Service
public class UserUpdateConfirmServiceImpl implements UserUpdateConfirmService {
	
	@Autowired
	UserUpdateConfirmDao userUpdateDao;

	@Override
	public boolean updateUser(UsersDto userDto) throws Exception {

		userUpdateDao.updateUser(setDtoModelToEntityModel(userDto));

		return true;
	}
	
	public Users setDtoModelToEntityModel(UsersDto userDto) {
		Users user = new Users();
		
		user.setId(userDto.getId());
		user.setContent(userDto.getContent());
		user.setUserName(userDto.getUserName());
		user.setEmail(userDto.getEmail());
		user.setGender(userDto.getGender());
		user.setAge(userDto.getAge());
		
		return user;
	}

}
