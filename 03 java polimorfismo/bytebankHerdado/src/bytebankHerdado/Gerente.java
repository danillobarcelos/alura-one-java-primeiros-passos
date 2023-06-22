package bytebankHerdado;

public class Gerente extends Funcionario{

	private int senha;
	
	public boolean autenticacao(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do GERENTE");
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
