package bytebankHerdado;

public class ControleBonificacao {
	
	private double soma;
	
//	public void registro(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma += boni;
//	}
	
	public void registro(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
//	public void registro(EditorVideo ev) {
//		double boni = ev.getBonificacao();
//		this.soma += boni;
//	}
	
	public double getSoma() {
		return soma;
	}
}
