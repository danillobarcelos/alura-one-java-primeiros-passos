package bytebankEncapsulado;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(156, 1478);
		
		// conta inconsistente em relação a regra de negócio
		//conta.setAgencia(-652);
		//conta.setNumero(-325);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1555, 3698);
		System.out.println(conta2.getAgencia());
	}
}
