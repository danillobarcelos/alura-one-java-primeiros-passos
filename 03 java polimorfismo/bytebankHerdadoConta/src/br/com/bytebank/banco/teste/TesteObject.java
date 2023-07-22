package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		System.out.println("X");
		System.out.println(2);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(357, 854);
		Object cp = new ContaPoupanca(932, 507);
		Object cliente = new Cliente();
		
		System.out.println(cp.toString());
		System.out.println(cc);
		
	}

}
