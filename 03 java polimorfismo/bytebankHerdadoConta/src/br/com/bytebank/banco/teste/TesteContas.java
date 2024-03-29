package br.com.bytebank.banco.teste; 

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
		System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
	}

}
