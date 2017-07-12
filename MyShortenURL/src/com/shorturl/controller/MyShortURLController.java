package com.shorturl.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyShortURLController {
	
	/*@Autowired
	ShortURLService urlService;
	
	 @RequestMapping(value = "/home", method = RequestMethod.POST)
	  public ModelAndView load(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") ShortURLForm form) {
	    ModelAndView mav = null;
	    ShortURLForm newForm = urlService.getShortURL(form);
	    if (null != newForm) {
	    mav = new ModelAndView("home");
//	    mav.addObject("firstname", user.getFirstname());
	    } else {
	    mav = new ModelAndView("login");
	    mav.addObject("message", "Username or Password is wrong!!");
	    }
	    return mav;
	  }

	 
	 @RequestMapping(value = "/shrturl/*", method = RequestMethod.POST)
	  public void originalURLRenderer(HttpServletRequest request, HttpServletResponse response) {
		 
		 
	  }
	 */
}
