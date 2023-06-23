package bytebankHerdado;

public class TesteReferencia {

	public static void main(String[] args) {
//		Funcionario g1 = new Gerente();
//		
//		g1.setNome("Marcos");
//		String nome = g1.getNome();
//		
//		System.out.println(nome);

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		
//		Funcionario f1 = new Funcionario();
//		f1.setSalario(2000);
//		controle.registro(f1);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		controle.registro(ev);
		
		Designer d1 = new Designer();
		d1.setSalario(2000);
		controle.registro(d1);
		
		System.out.println(controle.getSoma());
	}

}
