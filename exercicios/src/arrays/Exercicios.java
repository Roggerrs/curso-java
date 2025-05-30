package arrays;

import java.util.Arrays;


public class Exercicios {
	
	public static void main(String[] args) {
		
		double[]   notasAlunoA = new double [4];  // double  notasAlunoA[]  / double []notasAlunoA / double []  notasAlunoA
		// double[] [] notasAlunoA = notasAlunoA [3] [3]; Arrays 3 por 3. 
		System.out.println(Arrays.toString(notasAlunoA)); 
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		 System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		 //System.out.println(notasAlunoA[10]); // aqui ele esta fora vai gerar um erro.
		 
		
		double totalAlunoA = 0; // Para mudar todas as variáveis total: botão direito Refactor - Rename. 
		for(int i = 0; i < notasAlunoA.length;  i++) {
			totalAlunoA += notasAlunoA[i];
			
			/**
			 * Length: Comprimento de um array: Em java, os arrays possuem um campo chamado length que retorna o número de elementos no array.
			 * Por exemplo: int [] numero = {1,2,3,4,5};
			 * System.out.println(numero.lenght); // Saída:5
			 * 
			 * Comprimento de uma String: A classe String possui um método lenth() que retorna o número de caracteres na string. Por exemplo:
			 * String texto = "Hello, world!";
			 * System.out println(texto.lenght()); // Saída: 13
			 * Em resumo, lenght é um campo quando se trata de arrays e um método quando se trata de objetos da classe String.
			 */
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		final double notaArmazenada = 5.9; // final para ser uma constante. 
		double [] notasAlunoB = { 6.9, 8.9, notaArmazenada, 5.5, 10 }; // menos usado
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length;  i++) {
			totalAlunoB += notasAlunoB[i];
			
		}
      System.out.println(totalAlunoB / notasAlunoB.length);			
		}
	}


