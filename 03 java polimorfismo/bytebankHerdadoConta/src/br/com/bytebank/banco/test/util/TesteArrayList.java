package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(159, 743);
		Conta cc2 = new ContaCorrente(236, 503);
		
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(304, 627);
		Conta cc4 = new ContaCorrente(561, 831);
		
		lista.add(cc3);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------");
		
		for(Conta c : lista) {
			System.out.println(c);
		}
	}

}
