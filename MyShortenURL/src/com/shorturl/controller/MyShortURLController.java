package com.shorturl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shorturl.form.ShortURLForm;
import com.shorturl.form.UrlForm;
import com.shorturl.service.ShortURLService;

@Controller
public class MyShortURLController {
	
	@Autowired
	ShortURLService urlService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	  public ModelAndView load(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("home");
	    mav.addObject("url", new UrlForm());
	    return mav;
	  }
	
	 @RequestMapping(value = "/createTiny", method = RequestMethod.POST)
	  public ModelAndView createShortURL(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("url") UrlForm urlform) {
	    ModelAndView mav = null;
	    mav = new ModelAndView("home");
//	    mav.addObject("labeltinyurl","/tinyURL/1");
//	    mav.addObject("tinyurl","/tinyURL/1");
	    List<ShortURLForm> urlformLst = urlService.getShortURLLst();
	    mav.addObject("tinyurlst",urlformLst);
	    return mav;
	  }
}
