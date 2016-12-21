package com.panghai.entjee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	/**
	 *  maps all HTTP operations by default. Use @RequestMapping(method=GET) to narrow this mapping.
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World!") String name, Model model){
		model.addAttribute("name", name);
		
		//return view pages, auto add suffix ".html"
		return "hello";
	}
	
	@RequestMapping("/say/{name}")
	public String say(@PathVariable("name") String name, Model model){
		model.addAttribute("name", name);
		return "hello";
	}
}
