package bytebank;

public class CriaConta {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;

		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);

		System.out.println(primeiraConta);
		System.out.println(segundaConta);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
	}
}
