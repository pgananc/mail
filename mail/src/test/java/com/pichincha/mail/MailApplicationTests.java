package com.pichincha.mail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.pichincha.mail.controller.MailController;
import com.pichincha.mail.dto.MailDTO;

@SpringBootTest
class MailApplicationTests {

	@Test
	void send_mail() {
		MailDTO mailDto = new MailDTO();
		MailController mailController = new MailController();
		mailController.sendMail(mailDto);
		Assert.isNull(null, mailDto.getTo());

	}

}
