package bytebankHerdadoConta;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.20;
		return super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
