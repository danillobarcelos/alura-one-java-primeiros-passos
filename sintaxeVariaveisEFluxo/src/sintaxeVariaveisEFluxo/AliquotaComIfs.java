package sintaxeVariaveisEFluxo;

public class AliquotaComIfs {
	public static void main(String[] args) {
		double salario = 3300.00;
		double ir;
		
		if (salario >= 1900.00 && salario <= 2800.00) {
			ir = 7.5;
			System.out.println("O seu IR é de " + ir + "% e "
					+ "pode deduzir na declaração o valor de R$142");
		} else if (salario > 2800.00 && salario <= 3751.00) {
			ir = 15;
			System.out.println("O seu IR é de " + ir + "% e "
					+ "pode deduzir na declaração o valor de R$350");
		} else if (salario > 3751.00 && salario <= 4664.00) {
			ir = 22.5;
			System.out.println("O seu IR é de " + ir + "% e "
					+ "pode deduzir na declaração o valor de R$636");
		}
	}

}
