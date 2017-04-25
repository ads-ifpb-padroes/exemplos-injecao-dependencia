package br.edu.ifpb.padroes.di.venda.logs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

}
