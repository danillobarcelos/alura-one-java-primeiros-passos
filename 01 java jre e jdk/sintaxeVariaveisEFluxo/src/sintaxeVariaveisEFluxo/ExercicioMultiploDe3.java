package sintaxeVariaveisEFluxo;

public class ExercicioMultiploDe3 {
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%3 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for(int j = 3; j <= 100; j +=3) {
			System.out.print(j);
			System.out.print(" ");
		}
	}
}
