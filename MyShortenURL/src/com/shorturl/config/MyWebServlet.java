package com.shorturl.config;

import javax.servlet.annotation.WebServlet;

import org.springframework.web.servlet.DispatcherServlet;

@WebServlet(name="spring-mvc", urlPatterns = {"/"}, asyncSupported = true, loadOnStartup=1)
public class MyWebServlet extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1688963297314734345L;

	public MyWebServlet(){
		super();
	}
	
}
