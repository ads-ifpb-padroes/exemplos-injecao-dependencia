package br.edu.ifpb.padroes.di.venda;

import javax.inject.Inject;
import javax.inject.Named;


import br.edu.ifpb.padroes.di.venda.logs.Log;
import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class Venda {
	
	@Inject
	@Qualifier("console")
	private Log log;
	
	public Venda() {
	}
	
	public void fecharVenda() {
		log.logar("Venda fechada com sucesso");
	}

}
