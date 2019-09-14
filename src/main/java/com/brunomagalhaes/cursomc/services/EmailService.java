package com.brunomagalhaes.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.brunomagalhaes.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
