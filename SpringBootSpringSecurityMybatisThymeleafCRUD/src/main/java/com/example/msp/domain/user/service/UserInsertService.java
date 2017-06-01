package com.example.msp.domain.user.service;

import com.example.msp.domain.user.dto.UsersDto;

public interface UserInsertService {

	boolean insertUser(UsersDto userDto) throws Exception;
}
