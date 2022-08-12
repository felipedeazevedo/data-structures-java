package com.felipe.estruturadados.vetor.exercicios;

import com.felipe.estruturadados.vetor.Lista;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);
	}

}
