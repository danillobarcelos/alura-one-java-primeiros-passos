package bytebankHerdado;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do EDITOR DE VIDEO");
		return super.getBonificacao() + 100;
	}
}
