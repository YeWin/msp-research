package com.example.msp.domain.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import com.example.msp.domain.user.dto.UsersListDto;
import com.example.msp.domain.user.service.UserListService;

@Controller
@RequestScope
public class UserListController {

	@Autowired
	private UserListService userListService;

	@GetMapping(value = "/user/list")
	public @ResponseBody ModelAndView userInsert() throws Exception {

		ModelAndView mav = new ModelAndView("/user/userList");

		List<UsersListDto> userList = userListService.getUsersList();
		
		mav.addObject("userList", userList);		 

		return mav;
	}
}
