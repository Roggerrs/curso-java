package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	// Domingo ->1
	// Quarta-> 4
	//Terça -> 3
	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Dia da Semana");
	
	double dia = entrada.nextDouble();
	
	if(dia > 5 || dia < 0)
	{
		System.out.println("Dia Invalido");
	} else if (dia == 1) {
		System.out.println("Domingo");
		System.out.println("Folga");
	} else if (dia == 3) {
		System.out.println("Terça");
	} else if (dia == 4) {
		System.out.println("Quarta");
	} else {
	System.out.println("Bom Trabalho");
	}
	entrada.close();
}
}
