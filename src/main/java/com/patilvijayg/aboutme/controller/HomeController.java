package com.patilvijayg.aboutme.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.patilvijayg.aboutme.domain.EmailObject;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("emailObject", new EmailObject());
		return "home";
	}
}
