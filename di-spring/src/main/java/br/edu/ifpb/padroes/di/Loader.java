package br.edu.ifpb.padroes.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.edu.ifpb.padroes.di.venda.Venda;

@Configuration
@ComponentScan(basePackages = "br.edu.ifpb")
public class Loader {
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(Loader.class);
		Venda venda = context.getBean(Venda.class);
		venda.fecharVenda();
	}

}
