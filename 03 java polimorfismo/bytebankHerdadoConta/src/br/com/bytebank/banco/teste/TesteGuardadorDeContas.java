package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
	public static void main(String[] args) {
		
		GuardadorDeContas g = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(159, 753);
		g.adicionarConta(cc1);
		
		Conta cc2 = new ContaCorrente(852, 654);
		g.adicionarConta(cc2);
		
		int tamanho = g.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = g.getReferencia(0);
		System.out.println(ref.getNumero());
		
		ref = g.getReferencia(1);
		System.out.println(ref.getNumero());

	}
}
