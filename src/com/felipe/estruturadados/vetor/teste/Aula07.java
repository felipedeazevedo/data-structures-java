package com.felipe.estruturadados.vetor.teste;

import com.felipe.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B"); 
		vetor.adiciona("C"); 
		vetor.adiciona("E");
		vetor.adiciona("F"); 
		vetor.adiciona("G");
		vetor.adiciona("H"); 
		vetor.adiciona("I"); 
		vetor.adiciona("J");
		vetor.adiciona("K"); 
		vetor.adiciona("L");
		
		System.out.println(vetor);
		
		vetor.adiciona(3, "Z");
		
		System.out.println(vetor);
	}

}
