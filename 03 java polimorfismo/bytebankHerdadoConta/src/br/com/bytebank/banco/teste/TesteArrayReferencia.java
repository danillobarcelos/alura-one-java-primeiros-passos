package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc0 = new ContaCorrente(123, 963);
		ContaPoupanca cc1 = new ContaPoupanca(258, 785);
		
		contas[0] = cc0;
		contas[1] = cc1; 
		
		Conta ref = contas[0];
		
		System.out.println(cc0.getNumero());
		System.out.println(contas[0].getNumero());
		System.out.println(ref.getNumero());
	}
}
