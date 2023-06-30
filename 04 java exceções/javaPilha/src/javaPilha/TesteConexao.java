package javaPilha;

public class TesteConexao {

	public static void main(String[] args) throws Exception {

//		Conexao co = null;
//		try {
//			co = new Conexao();
//			co.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conexão!");
//		} finally {
//			co.close();
//		}
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão!");
		}
	}

}
