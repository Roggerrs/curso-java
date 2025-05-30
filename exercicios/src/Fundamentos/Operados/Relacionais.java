package Fundamentos.Operados;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		//System.out.println(a == b); Os operadores são binarios
		// Não é inteligente fazer essa operação acima.
		
		System.out.println(a == b); //Igual
		System.out.println(3 > 4); // Maior 
		System.out.println(3 >= 4); // Maior igual
		System.out.println(3 < 4); // Menor
		System.out.println(30 <= 7); // Menor igual
		System.out.println(30 !=  4); // Diferente.

		double nota= 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia; 
		
		
		System.out.println("Tem desconto?" +  temDesconto);
		
		



		
		
		
		
		
	}

}
