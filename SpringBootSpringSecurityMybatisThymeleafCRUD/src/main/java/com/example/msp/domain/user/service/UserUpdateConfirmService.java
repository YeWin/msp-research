package com.example.msp.domain.user.service;

import com.example.msp.domain.user.dto.UsersDto;

public interface UserUpdateConfirmService {

	boolean updateUser(UsersDto userDto) throws Exception;
}
