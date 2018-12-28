package com.uday.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author uday
 *
 */
@Controller
public class HomeController
{
	
	@RequestMapping({"/","/home"})
	public String home(Model model)
	{
		return "userhome";
	}

	//work in progress
}