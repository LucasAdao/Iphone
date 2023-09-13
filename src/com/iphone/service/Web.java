package com.iphone.service;

public interface Web {
	default void pesquisar() {
		System.out.println("Navegando na internet");
	}
	
}
