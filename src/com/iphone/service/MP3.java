package com.iphone.service;

public interface MP3 {
	default void avançarM() {
		System.out.println("Avança música");
	}
	default void voltarM() {
		System.out.println("Volta música");
	}
	default void play() {
		System.out.println("Começa a tocar");
	
	}
	default void pause() {
		System.out.println("Pausa a lista de reprodução");
	}
	default void aumentarS() {
		System.out.println("Aumenta o som");
	}
	default void diminuirS() {
		System.out.println("Diminui o som");
	}
}
