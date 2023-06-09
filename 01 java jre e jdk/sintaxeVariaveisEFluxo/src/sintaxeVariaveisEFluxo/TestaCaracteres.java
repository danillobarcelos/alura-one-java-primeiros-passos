package sintaxeVariaveisEFluxo;

public class TestaCaracteres {
	public static void main(String[]args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor++;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "Alura curso online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020; //não precisa de fazer casting como no char
		System.out.println(palavra);
	}
}
