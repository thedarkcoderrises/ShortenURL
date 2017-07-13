package com.shorturl.form;

import java.util.List;

public class UrlForm {

	String originalURL;
	
	List<ShortURLForm> shrtFormLst;

	public String getOriginalURL() {
		return originalURL;
	}

	public void setOriginalURL(String originalURL) {
		this.originalURL = originalURL;
	}

	public List<ShortURLForm> getShrtFormLst() {
		return shrtFormLst;
	}

	public void setShrtFormLst(List<ShortURLForm> shrtFormLst) {
		this.shrtFormLst = shrtFormLst;
	}

	
	
}
