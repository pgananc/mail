package com.pichincha.mail.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mail.dto.MailDTO;

@RestController
@RequestMapping("/mail")
public class MailController {

	@PostMapping("send")
	public String sendMail(@Valid @RequestBody MailDTO mailDto) {
		return "Hello " + mailDto.getTo() + " your message will be send";
	}

}
