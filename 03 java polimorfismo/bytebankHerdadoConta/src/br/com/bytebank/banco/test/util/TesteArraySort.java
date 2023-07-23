package br.com.bytebank.banco.test.util;

import java.util.Arrays;

public class TesteArraySort {

	public static void main(String[] args) {
		int[] numeros = {58, 36, 10, 4, 78, 105, 67, 55, 85};
		
		for (int i : numeros) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		Arrays.sort(numeros);
		
		for (int i : numeros) {
			System.out.print(i + " ");
		}
	}
}
