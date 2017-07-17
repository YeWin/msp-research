package com.example.msp.domain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.msp.domain.user.dto.UsersDto;
import com.example.msp.domain.user.service.UserDeleteService;
import com.example.msp.domain.user.service.UserInsertService;
import com.example.msp.domain.user.service.UserUpdateConfirmService;
import com.example.msp.domain.user.service.UserUpdateService;
import com.example.msp.message.MessageHelper;

@Controller
public class UserEditController {

	@Autowired
	private UserInsertService userInsertService;

	@Autowired
	private UserDeleteService userDeleteService;

	@Autowired
	private UserUpdateService userUpdateService;

	@Autowired
	private UserUpdateConfirmService userUpdateConfirmService;

	@Autowired
	private MessageHelper messageHelper;

	@GetMapping(value = "/user")
	public ModelAndView admin() {

		ModelAndView mav = new ModelAndView("/user/userInput");
		mav.addObject("usersDto", new UsersDto());
		return mav;
	}

	@PostMapping(value = "/user/insert")
	public @ResponseBody ModelAndView userInsert(
			@Validated @ModelAttribute("usersDto") UsersDto userDto,
			BindingResult bindingResult) throws Exception {

		ModelAndView mav = new ModelAndView("/user/userInsertComplete");
		mav.addObject(userDto);

		if (bindingResult.hasErrors()) {
			mav.setViewName("/user/userInput");
			return mav;
		}

		userInsertService.insertUser(userDto);

		messageHelper.setCompleteMessage(mav, "MSP0001");

		return mav;
	}

	@GetMapping(value = "/user/delete/{userId}")
	public String userDelete(@PathVariable("userId") Integer userId)
			throws Exception {

		userDeleteService.userDelete(userId);

		String redirectPage = "redirect:/user/list/";

		return redirectPage;
	}

	@GetMapping(value = "/user/update")
	public ModelAndView userUpdate(@ModelAttribute("id") Integer userId)
			throws Exception {

		ModelAndView mav = new ModelAndView("/user/userUpdate");

		UsersDto userDto = userUpdateService.getUserById(userId);

		mav.addObject(userDto);

		return mav;
	}

	@PostMapping(value = "/user/update/confirm")
	public ModelAndView userUpdateConfirm(
			@Validated @ModelAttribute("usersDto") UsersDto userDto,
			BindingResult bindingResult) throws Exception {

		ModelAndView mav = new ModelAndView("/user/userUpdateComplete");
		mav.addObject(userDto);

		if (bindingResult.hasErrors()) {
			mav.setViewName("/user/userUpdate");
			return mav;
		}

		userUpdateConfirmService.updateUser(userDto);

		messageHelper.setCompleteMessage(mav, "MSP0001");

		return mav;
	}
}
