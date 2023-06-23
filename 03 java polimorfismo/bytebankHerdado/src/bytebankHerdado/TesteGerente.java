package bytebankHerdado;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Marco");
		g1.setCpf("111.222.333-44");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(12345);
		boolean autenticacao = g1.autentica(12345);
		
		System.out.println(autenticacao);
		
		System.out.println(g1.getBonificacao());
		

	}

}
