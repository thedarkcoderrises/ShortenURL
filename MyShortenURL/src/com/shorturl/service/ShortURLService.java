package com.shorturl.service;

import java.util.List;

import com.shorturl.form.ShortURLForm;

public interface ShortURLService {

	ShortURLForm getShortURL(String key);
	
	List<ShortURLForm> getShortURLLst();

}
