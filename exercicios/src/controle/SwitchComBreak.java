package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		String conceito = "";
		System.out.println("informe a nota:");
		
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10:
			conceito = "A";
			break;
		case 9:
			conceito = "A";
			break;
		case 8: case 7: { // eu posso aplicar um bloco de código, mas não é obrigatorio. 
			conceito = "B";
			break;
		}
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3: // Eu posso colcoar esses cases neste modelo.
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
			default:
				conceito = "não informado!"; 
		}
		System.out.println("Conceito é " + conceito);
		
		entrada.close();
	}

}
