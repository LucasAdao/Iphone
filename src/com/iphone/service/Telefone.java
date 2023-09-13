package com.iphone.service;

public interface Telefone {
	default void atender() {
		System.out.println("Atende");
	}
	default void desligar() {
		System.out.println("Desliga");
	}
	default void digitar() {
		System.out.println("tu tu tu tu tu");
	}
	default void ligar() {
		System.out.println("Ligando");
	}
}
