package com.msp.research.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "EditorController")
@SessionScoped
public class EditorController implements Serializable {

	private static final long serialVersionUID = 20111020L;

	private String content;
	private String color = "result";
	

	public EditorController() {
	}

	public String resultPage() {
		
		return "result?faces-redirect=true";
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
            
