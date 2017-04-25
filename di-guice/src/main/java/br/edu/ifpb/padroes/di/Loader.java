package br.edu.ifpb.padroes.di;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.edu.ifpb.padroes.di.guiceconfig.VendaModule;
import br.edu.ifpb.padroes.di.venda.Venda;

public class Loader {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new VendaModule());
		Venda venda = injector.getInstance(Venda.class);
		venda.fecharVenda();
	}

}
