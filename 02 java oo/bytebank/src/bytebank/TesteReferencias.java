package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
	}

}
