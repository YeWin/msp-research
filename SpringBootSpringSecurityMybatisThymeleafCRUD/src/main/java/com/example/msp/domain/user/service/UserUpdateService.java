package com.example.msp.domain.user.service;

import com.example.msp.domain.user.dto.UsersDto;

public interface UserUpdateService {

	UsersDto getUserById(Integer id)throws Exception;
}
