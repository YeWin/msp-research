package com.example.msp.domain.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import com.example.msp.domain.user.dto.UsersDto;
import com.example.msp.domain.user.service.UserInsertService;
import com.example.msp.message.MessageHelper;

@Controller
@RequestScope
public class UserInsertController {

	@Autowired
	private UserInsertService userInsertService;

	@Autowired
	private MessageHelper messageHelper;

	@Autowired
	private MessageSource messageSource;

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
}
