package br.edu.ifpb.padroes.di.venda.logs;

import javax.inject.Named;

@Named("console")
public class LogConsoleImpl implements Log {
	
	public void logar(String mensagem) {
		System.out.println(mensagem);
	}

}
