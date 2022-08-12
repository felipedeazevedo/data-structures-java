package com.felipe.estruturadados.vetor.teste;

import com.felipe.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234", "teste@");
		Contato c2 = new Contato("Contato 2", "12345", "teste2@");
		Contato c3 = new Contato("Contato 3", "123456", "teste3@");
		
		Contato c4 = new Contato("Contato 1", "1234", "teste@");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}

}
