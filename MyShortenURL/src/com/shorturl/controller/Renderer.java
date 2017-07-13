package com.shorturl.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shorturl.form.ShortURLForm;
import com.shorturl.service.ShortURLService;

@RestController
public class Renderer {

	@Autowired
	ShortURLService urlService;

	  @RequestMapping(value="/tinyURL/*", method = RequestMethod.GET)
	  void handleFoo(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  String uri = request.getRequestURI();
		  String key = ""+uri.charAt(uri.length()-1);
		  ShortURLForm suf= urlService.getShortURL(key);
		  response.sendRedirect("http://"+suf.getOriginalURL());
	  }
	
}
