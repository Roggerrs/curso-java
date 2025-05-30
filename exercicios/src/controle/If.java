package controle;

import java.util.Scanner;



public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");		
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) //Temos um intervalo. 
			
			/**
			 * Um bloco de códico em Java é uma seção de códico demilitada por chaves ({}) que agrupa declarações e comandos para 
			 * formar uma estrutura lógica. Ele pode definir o corpo de método, classes, loops ou instruções de controle,
			 * como if, else, for, while, e outros.
			 * Os blocos de códico ajudam a organizar e a delimitar o escopos de variáveis e comandos, 
			 * além de melhorar a legibilidade do código.
			 */
		{
	    System.out.println("Aprovado!");
		System.out.println("Parabéns!");
		}
		
		if(media > 4.5 && media <= 7) // Observação: sempre o menor vem antes >
			System.out.println("Recuperação");
		
		boolean criterioReprovacaoAtingindo =
				media < 4.5 && media >= 0; 
		
		if(criterioReprovacaoAtingindo) 
		{
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
