package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		// Esse Break não é recomendável fazer.
		//renomeie os laços. 
		externo: 
			for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				if(i == 1) {
					//break externo;
					continue externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			 
			System.out.println();
		}
		
		System.out.println("Fim!");
	}

}
