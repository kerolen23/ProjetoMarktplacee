package com.kerolenrodrigues.projeto.services;

import org.springframework.mail.SimpleMailMessage;

import com.kerolenrodrigues.projeto.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
