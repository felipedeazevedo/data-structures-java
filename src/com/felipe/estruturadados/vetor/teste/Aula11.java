package com.felipe.estruturadados.vetor.teste;

import com.felipe.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		/*VetorObjetos vetor = new VetorObjetos(2);
		
		vetor.adiciona(1);
		vetor.adiciona("Elemento do tipo String");
		
		System.out.println(vetor);*/
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato("Contato 01", "12345", "contato@email.com");
		
		vetor.adiciona(c1);
		System.out.println(vetor);
	}

}
