/**
 * Controlador de servicio
 */
package com.pichincha.mail.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.exception.ModeloNotFoundException;
import com.pichincha.mail.dto.MailDTO;

/**
 * s
 * @author pabi1
 *
 */
@RestController
@RequestMapping("/mail")
public class MailController {

	@PostMapping("send")
	public ResponseEntity<String> sendMail(@Valid @RequestBody MailDTO mailDto) {
		if (mailDto.getTo() == null || mailDto.getTo().isEmpty()) {
			throw new ModeloNotFoundException("Data not found " + mailDto);
		}
		String message = "Hello " + mailDto.getTo() + " your message will be send";
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
