package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(159, 743);
		Conta cc2 = new ContaCorrente(236, 503);
		
		lista.add(cc1);
		lista.add(cc2);
	
		Conta cc3 = new ContaCorrente(236, 503);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta c : lista) {
			System.out.println(c);
		}
	}
}
