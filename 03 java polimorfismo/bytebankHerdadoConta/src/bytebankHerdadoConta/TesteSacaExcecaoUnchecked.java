package bytebankHerdadoConta;

public class TesteSacaExcecaoUnchecked {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);

		conta.deposita(200);
		conta.saca(190);
		System.out.println(conta.getSaldo());

		try {
			conta.saca(27);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}
}
