package com.example.msp.message;

import java.io.Serializable;

public class DisplayMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text;

	public DisplayMessage(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
