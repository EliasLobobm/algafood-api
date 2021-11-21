package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.service.AtivacaoClienteService;
@Controller
public class MeuPrimeiroController {
	private AtivacaoClienteService ativacaoClienteService;
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("Lobo");
	}


	@RequestMapping("/hello")
	@ResponseBody
	public String Hello() {
		Cliente lobo = new Cliente("Elias", "eliaslobo@gmail.com", "249988-5566");
		
		ativacaoClienteService.ativar(lobo);
		
		return "Elias Lobobão";
	}

}
