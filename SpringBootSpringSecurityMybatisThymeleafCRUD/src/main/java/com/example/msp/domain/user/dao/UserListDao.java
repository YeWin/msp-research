package com.example.msp.domain.user.dao;

import java.util.List;

import com.example.msp.domain.user.dto.UsersListDto;

public interface UserListDao {

	List<UsersListDto> getUserList();
}
