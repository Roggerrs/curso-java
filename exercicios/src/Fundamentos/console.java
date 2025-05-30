package Fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n" , 
				1, 2, 3, 4, 5, 6);
		
		System.out.printf("salário: %.1f\n", 1234.5678);
		System.out.printf("Nome: %s\n", "João");
		
		//Scanner entrada = new Scanner(System.in); // Scanner: monitorar oque você vai digitar. 
		/**
		 * New: Palavra reservada do java. O operador new é usado para instanciar um novo objeto de uma classe.
		 * Exemplo: MinhaClasse objeto = new
		 * MinhaClasse();
		 * Neste caso, estamos criando uma nova instância  de classe "MinhaClasse" usando o operador new. 
		 * Isso aloca memória para o objeto e chama o construtor da classe para inicializá-lo. 
		 */
		
		//int a = 3;
		Scanner entrada = new Scanner (System.in); 
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.print("Digite o seu nome o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome + " " + sobrenome);
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.\n",
				nome, sobrenome,idade);
		
		entrada.close(); // Tem que fechar o scanner. 
		
		
		
		
		
	
	}
	
	
}
