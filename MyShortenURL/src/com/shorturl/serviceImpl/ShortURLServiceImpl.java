package com.shorturl.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.shorturl.form.ShortURLForm;
import com.shorturl.service.ShortURLService;

@Service
public class ShortURLServiceImpl  implements ShortURLService{

	public static final Map<String,String> urlMap= new HashMap<>(); 
	static{
		urlMap.put("1", "www.google.com");
		urlMap.put("2", "www.gmail.com");
		urlMap.put("3", "www.facebook.com");
		urlMap.put("4", "www.yahoo.com");
		
	}
	
	
	@Override
	public ShortURLForm getShortURL(String key) {
		ShortURLForm suf = new ShortURLForm();
		suf.setOriginalURL(urlMap.get(key));
		return suf;
	}


	@Override
	public List<ShortURLForm> getShortURLLst() {
		List<ShortURLForm> lst = new ArrayList<>();
		
		ShortURLForm suf=null;
		for (String key : urlMap.keySet()) {
			suf =new ShortURLForm();
			suf.setShortURL("/tinyURL/"+key);
			lst.add(suf);
		}
		return lst;
	}

}
