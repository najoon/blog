package com.tandu.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value = "/main")
public class IntroductionsController {
	
	
	@RequestMapping(value="/introductions", method=RequestMethod.GET)
	public String introducuion() {

		return "introductions";
	}

}
