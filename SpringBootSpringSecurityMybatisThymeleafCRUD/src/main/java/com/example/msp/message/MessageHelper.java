package com.example.msp.message;

import org.springframework.web.servlet.ModelAndView;

public interface MessageHelper {
	
	void setErrorMessage(ModelAndView mav, String messageId);

	void setInfoMessage(ModelAndView mav, String messageId);

	void setCompleteMessage(ModelAndView mav, String messageId);
}