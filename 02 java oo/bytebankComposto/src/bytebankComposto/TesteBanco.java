package bytebankComposto;

public class TesteBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulo silveira";
		paulo.cpf = "222.111.000-33";
		paulo.profissao = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		
	}
}
