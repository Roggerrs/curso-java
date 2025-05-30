package arrays;


import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Quantas notas: ");
		
		int qtdeNotas = entrada.nextInt();
		
		double [] notas = new double [qtdeNotas];
		
		
		System.out.println(notas[9]);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + i + 1 + ": ");
			notas [i] = entrada.nextDouble();
			
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("Á média é " + media + "!");
entrada.close(); 
		//System.out.println(Arrays.toString(notas));
		
		
		
		
		entrada.close();
	}

}
