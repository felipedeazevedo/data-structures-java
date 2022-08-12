package com.felipe.estruturadados.vetor.exercicios;

import com.felipe.estruturadados.vetor.Lista;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(3);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("D"));
	}

}
