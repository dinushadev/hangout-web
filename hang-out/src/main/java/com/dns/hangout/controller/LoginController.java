package com.dns.hangout.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dns.hangout.domain.User;
import com.dns.hangout.dto.LoginDto;
import com.dns.hangout.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//userService.addNewUser(null);
		return "home";
	}
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody User loginpage(@RequestBody LoginDto logindto, Model model) {
	
		logger.info("login:::: "+logindto);
		User user=new User();
		user.setuName("dns");
		user.setPassword("11");
		user.setUserId(2l);
		return user;
	}
	
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody User signIn(@RequestBody LoginDto logindto, Model model) {
	
		logger.info("Register:::: "+logindto);
		User user=new User();
		user.setuName(logindto.getuName());
		user.setPassword(logindto.getPassword());
		user.setfName("New User");
		user.setUserId(5l);
		return user;
	}
	
}
