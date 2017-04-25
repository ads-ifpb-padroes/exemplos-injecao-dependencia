package br.edu.ifpb.padroes.di.venda;

import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.padroes.di.venda.logs.Console;
import br.edu.ifpb.padroes.di.venda.logs.Email;
import br.edu.ifpb.padroes.di.venda.logs.Log;

@Named
public class Venda {
	
	@Inject
	@Email
	private Log log;
	
	public Venda() {
		
	}
	
	public void fecharVenda() {
		log.logar("Venda fechada com sucesso");
	}

}
