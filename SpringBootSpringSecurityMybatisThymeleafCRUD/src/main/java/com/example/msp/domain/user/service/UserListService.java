package com.example.msp.domain.user.service;

import java.util.List;

import com.example.msp.domain.user.dto.UsersListDto;

public interface UserListService {

	List<UsersListDto> getUsersList() throws Exception;
}
