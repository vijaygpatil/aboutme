package com.patilvijayg.aboutme.controller;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmtpMailSender {
	
	public void send(String to, String subject, String body) {
		
//		MimeMessage message = javaMailSender.createMimeMessage();
//		MimeMessageHelper helper;
//
//		helper = new MimeMessageHelper(message, true); // true indicates
//													   // multipart message
//		helper.setSubject(subject);
//		helper.setTo(to);
//		helper.setText(body, true); // true indicates html
//		// continue using helper object for more functionalities like adding attachments, etc.
//
//		javaMailSender.send(message);
		
		
	}

}
