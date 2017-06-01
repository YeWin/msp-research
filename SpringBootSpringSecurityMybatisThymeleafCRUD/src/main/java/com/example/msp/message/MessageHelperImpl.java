package com.example.msp.message;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MessageHelperImpl implements MessageHelper {
	
	@Autowired
	private MessageSource messageSource;

	@Override
	public void setErrorMessage(ModelAndView mav, String messageId) {
		ResultMessages resultMessages = new ResultMessages();
		Locale locale = LocaleContextHolder.getLocale();
		resultMessages.addError(new DisplayMessage(messageSource.getMessage(
				messageId, null, locale)));
		mav.addObject("resultMessages", resultMessages);
	}

	@Override
	public void setInfoMessage(ModelAndView mav, String messageId) {
		ResultMessages resultMessages = new ResultMessages();
		Locale locale = LocaleContextHolder.getLocale();
		resultMessages.addInfo(new DisplayMessage(messageSource.getMessage(
				messageId, null, locale)));
		mav.addObject("resultMessages", resultMessages);
	}

	@Override
	public void setCompleteMessage(ModelAndView mav, String messageId) {
		ResultMessages resultMessages = new ResultMessages();
		Locale locale = LocaleContextHolder.getLocale();
		resultMessages.addComplete(new DisplayMessage(messageSource.getMessage(
				messageId, null, locale)));
		mav.addObject("resultMessages", resultMessages);
	}

}