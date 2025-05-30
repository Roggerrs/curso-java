package Fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		/**
		 *  (°F - 32) x 5/9 = °C
		 *  Na programação e outras linguagens 5/9 Cinco divido por 9 vai ser zero. Resultado vai ser número inteiro
		5.0/9.0 Número como ponto flutuante, resultado com casa decimais.
		 */
		
		final double FATOR = 5.0 / 9.0;
	   final int AJUSTE = 32; 
	   
	    double fahrenheit = 86;
	    double celsius = (fahrenheit - AJUSTE) * FATOR;
	    System.out.println( "O resultado é " + celsius + "°C."); // alt para cima e para baixo para posiciona-lo. Duplicar no windows CTRL + ALT seta para baixo.

	   fahrenheit = 0; 
	   celsius = (fahrenheit - AJUSTE) * FATOR;
	    System.out.println( "O resultado é " + celsius + "°C."); // alt para cima e para baixo para posiciona-lo. Duplicar no windows CTRL + ALT seta para baixo.
		
	}

}
