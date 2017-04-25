package br.edu.ifpb.padroes.di.guiceconfig;

import com.google.inject.AbstractModule;

import br.edu.ifpb.padroes.di.venda.logs.Console;
import br.edu.ifpb.padroes.di.venda.logs.ConsoleLog;
import br.edu.ifpb.padroes.di.venda.logs.Email;
import br.edu.ifpb.padroes.di.venda.logs.EmailLog;
import br.edu.ifpb.padroes.di.venda.logs.Log;

public class VendaModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Log.class).annotatedWith(Console.class).
		to(ConsoleLog.class);
		
		bind(Log.class).annotatedWith(Email.class).
		to(EmailLog.class);
	}

}