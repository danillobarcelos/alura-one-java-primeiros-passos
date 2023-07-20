package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		
		nome.replace("A", "a");
		
		System.out.println(nome); //retorna Alura
		
		String novoNome = nome.replace("A", "a");
		
		System.out.println(novoNome); // retorna alura
		
		char c = nome.charAt(3);
		System.out.println(c);
		
		int pos = nome.indexOf("u");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		String vazio = "";
		
		
		System.out.println(nome.isEmpty());
		System.out.println(vazio.isEmpty());
		
		System.out.println("--------------------------");
		
		String teste = "           teste Trim";
		String testeTrim = teste.trim();
		
		System.out.println(teste.length());
		System.out.println(teste);
		System.out.println(testeTrim.length());
		System.out.println(testeTrim);
		
		System.out.println(testeTrim.contains("este"));
		
		System.out.println("--------");
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}

}
