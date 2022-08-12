package com.felipe.estruturadados.vetor.teste;

import com.felipe.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento 01"); // posicao 0
		vetor.adiciona("Elemento 02"); // posicao 1
		vetor.adiciona("Elemento 03"); // posicao 2
		
		System.out.println(vetor.busca(2));
	}

}
