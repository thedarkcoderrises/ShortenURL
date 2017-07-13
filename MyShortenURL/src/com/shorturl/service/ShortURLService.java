package com.shorturl.service;

import java.util.List;

import com.shorturl.form.ShortURLForm;
import com.shorturl.form.UrlForm;

public interface ShortURLService {

	ShortURLForm getShortURL(String key);
	
	List<ShortURLForm> getShortURLLst();
	
	ShortURLForm createShortURL(UrlForm urlForm);

}
