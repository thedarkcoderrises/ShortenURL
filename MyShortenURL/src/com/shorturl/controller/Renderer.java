package com.shorturl.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Renderer {


	  @RequestMapping(value="/shrtURL/*", method = RequestMethod.GET)
	  void handleFoo(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  response.sendRedirect("http://www.google.com");
	  }
	
}
