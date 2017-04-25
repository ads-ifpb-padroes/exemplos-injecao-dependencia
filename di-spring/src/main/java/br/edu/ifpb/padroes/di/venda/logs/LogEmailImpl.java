package br.edu.ifpb.padroes.di.venda.logs;

import javax.inject.Named;

@Named("email")
public class LogEmailImpl implements Log {

	public void logar(String mensagem) {
		System.out.println("Enviando email");
	}

}
