package com.example.msp.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msp.database.entity.Users;
import com.example.msp.domain.user.dao.UserInsertDao;
import com.example.msp.domain.user.dto.UsersDto;

@Service
public class UserInsertServiceImpl implements UserInsertService {
	
	@Autowired
	UserInsertDao userInsertDao;

	@Override
	public boolean insertUser(UsersDto userDto) throws Exception {		

		userInsertDao.insertUser(setDtoModelToEntityModel(userDto));
		
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
