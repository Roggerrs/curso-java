package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		/**
		* Calcular média de uma turma, não sei quantos alunos, mas não importa.

		 * Notas validas de 0 a 10, maior  =  ou a 0. Menor ou =  10 são notas validas.

		 * Quando o usuário digitar nota valida, armazenar o valor da nota chamada "total" e sempre uma nova for digitada, adicionar na variável total, somar todas as notas.

		 * Usar outra variável para saber quantas notas validas foram digitadas.

		 * Você terá total, quantidade, notas digitas e no final você mostrará a média.

		 * Quando digita menos 1 significa que vai sair do programa e mostrar média.  
 */
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
        System.out.print("Informe a nota (ou -1 p/ sair): ");		
        nota = entrada.nextDouble();
        
        
        if(nota <= 10 && nota >=0) {
        	 total += nota;
             quantidadeDeNotas++;
        } else if (nota != -1) {
        	System.out.println("Nota inválida!!! ;D");
        }
        
        
		}
		
		
// calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
	

        
        entrada.close();
	}

}
