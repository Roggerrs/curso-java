package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		// if(verdadeiro ou falso..) sentença; ou {} Vai definir se vai executar ou não uma sentença de código. 
		// while (true ou false) sentaça; ou {} Se for verdadeiro ele vai ficar repetindo uma sentença ou  bloco de código .
		// for(iniciação da variavel; expressão; modificação da variável) sentença; ou {}
		// do sentença; ou {} while (expressão aqui dentro); 
		
		Scanner entrada = new Scanner(System.in);
		 
		String texto = "por favor";
		
		do {
			System.out.println("Você precisa falar "
		+ "\nas palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();		
		} while(!texto.equalsIgnoreCase("por favor")); 
		
				System.out.println("Obrigado!");
		entrada.close();
		
	}

}
