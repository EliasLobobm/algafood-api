package com.algaworks.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador{

	public NotificadorEmail() {
		System.out.println("NotificadorEmail");
	}
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando o cliente %s atrav�s do email %s: %s \n",
				cliente.getNome(),cliente.getEmail(),mensagem);
	}
}
