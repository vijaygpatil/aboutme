package com.patilvijayg.aboutme.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.patilvijayg.aboutme.domain.EmailObject;

@Controller
public class RootController {

	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public String doSendEmail(@ModelAttribute("emailObject") EmailObject emailObject, Model model) {

		String recipientName = emailObject.getName();
		String recipientAddress = emailObject.getEmail();
		String phone = emailObject.getPhone();
		String message = emailObject.getMessage();

		try {
			smtpMailSender.send("patilvijayg@gmail.com", recipientName + ":" + recipientAddress + ":" + phone, message);
			model.addAttribute("success");
			return "redirect:/?success=true#page-contact";
		} catch (MessagingException e) {
			model.addAttribute("error");
			return "redirect:/?error=true#page-contact";
		}
	}
}
