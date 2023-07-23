package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 29; // primitivo
		Integer idadeRef = Integer.valueOf(29); // referência
		int valor = idadeRef.intValue(); // unboxing
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // autoboxing
		
	}
}
