package com.panghai.entjee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	/**
	 *  maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
	 * @param name
	 * @param model
	 * @return
	 */
//	@RequestMapping("")
//	public String index() {
//		return "/index";
//	}
	
	@RequestMapping("/login")
	public String login() {
		//if user is not loggin, then return login page, otherwise main page.
		return "login";
	}
}
