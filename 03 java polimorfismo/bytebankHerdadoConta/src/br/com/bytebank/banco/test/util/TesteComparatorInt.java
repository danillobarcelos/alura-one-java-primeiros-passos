package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteComparatorInt {
	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(123, 321);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(123, 654);
		cc2.deposita(444.0);
		
		Conta cc3 = new ContaCorrente(123, 789);
		cc3.deposita(111.0);
		
		Conta cc4 = new ContaPoupanca(123, 456);
		cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		NumeroDeContaComparator comparator = new NumeroDeContaComparator();
		
		lista.sort(comparator);
		
		System.out.println("--------------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}

class NumeroDeContaComparator implements Comparator<Conta>{

		@Override
		public int compare(Conta c1, Conta c2) {
			
			return Integer.compare(c1.getNumero(), c2.getNumero());
			
//			return c1.getNumero() - c2.getAgencia();
//			if (c1.getNumero() < c2.getNumero()) {
//				return -1;
//			}
//			
//			if(c1.getNumero() > c2.getNumero()) {
//				return 1;
//			}
//			
//			return 0;
		}
		
	}
