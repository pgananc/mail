package com.pichincha.mail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.pichincha.mail.controller.MailController;
import com.pichincha.mail.dto.MailDTO;

@SpringBootTest
class MailApplicationTests {
	MailDTO mailDto = new MailDTO();

	@Test
	void send_mail() {
		MailDTO mailDto = new MailDTO();
		MailController mailController = new MailController();
		mailController.sendMail(mailDto);
		Assert.isNull(mailDto.getTo(), "To null");
	}

	@Test
	void send_mail_data() {
		MailDTO mailDto = new MailDTO();
		mailDto.setMessage("This is a test");
		mailDto.setTo("Juan Perez");
		mailDto.setFrom("Rita Asturia");
		mailDto.setTimeToLifeSec(45);

		MailController mailController = new MailController();

		Assert.notNull(mailController.sendMail(mailDto), "Send not null");
	}

}
