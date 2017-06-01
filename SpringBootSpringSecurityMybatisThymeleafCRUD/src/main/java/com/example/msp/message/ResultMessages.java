package com.example.msp.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultMessages implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<DisplayMessage> alertList = new ArrayList<DisplayMessage>();

	private List<DisplayMessage> infoList = new ArrayList<DisplayMessage>();

	private List<DisplayMessage> completeList = new ArrayList<DisplayMessage>();

	public void addError(DisplayMessage error) {
		alertList.add(error);
	}

	public void addInfo(DisplayMessage info) {
		infoList.add(info);
	}

	public void addComplete(DisplayMessage complete) {
		completeList.add(complete);
	}

	public List<DisplayMessage> getErrorList() {
		return alertList;
	}

	public void setErrorList(List<DisplayMessage> errorList) {
		this.alertList = errorList;
	}

	public List<DisplayMessage> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<DisplayMessage> infoList) {
		this.infoList = infoList;
	}

	public List<DisplayMessage> getCompleteList() {
		return completeList;
	}

	public void setCompleteList(List<DisplayMessage> completeList) {
		this.completeList = completeList;
	}
}
