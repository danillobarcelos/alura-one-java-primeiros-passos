package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		
		// conta.saca(20);
		boolean conseguiuSacar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuSacar); //retorna true ou false
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		System.out.println(conta2.saldo);
		
		conta2.transfere(300, conta);
		
		System.out.println("Saldo da conta2: " + conta2.saldo);
		System.out.println("Saldo da conta1: " + conta.saldo);
		
	}
}
