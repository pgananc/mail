package com.pichincha.mail.controller;

import com.pichincha.mail.dto.MailDTO;

public class MailController {

	public String sendMail(MailDTO mailDto) {
		return "Hello " + mailDto.getTo() + " your message will be send";
	}

}
