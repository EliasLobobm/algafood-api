package com.algaworks.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("NotificadorEmai" + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "O Cliente est� ativado");
	}
}
