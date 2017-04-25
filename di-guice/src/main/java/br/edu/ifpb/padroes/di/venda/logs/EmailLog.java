package br.edu.ifpb.padroes.di.venda.logs;

import javax.inject.Named;

@Named
public class EmailLog implements Log {
	
	public void logar(String mensagem) {
		System.out.println(mensagem);
	}

}
