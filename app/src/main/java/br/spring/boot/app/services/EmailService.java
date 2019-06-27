package br.spring.boot.app.services;

import org.springframework.mail.SimpleMailMessage;

import br.spring.boot.app.domain.Cliente;
import br.spring.boot.app.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
