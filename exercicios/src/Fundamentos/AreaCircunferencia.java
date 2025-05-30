package Fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		/** 
		 * Definição de Variável: Tipo, nome, valor.
		 * Double: valor real. Radio: nome davariável. Igual: Símbolo de atribuição. Valor de atribuição a variável Ray
		 * Pi é uma constancia, não uma constancia.
		 * Int: é um tipo de dado primitimo, que representa números inteiros. -1, 0, 3. Tamanho de 32 bits. 
		 * double raio = 4.1; 
		 * 
		double pi = 3.56165156;  
		double area = pi * raio * raio;
		System.out.println(area);
		ou
		System.out.println(pi * raio * raio);
		
		 * PI é escrito em maiúscula para indicar que é uma constante.
		 * Double ou int também funciona.
		 */
		 
		double raio = 4.1; 
	    final double PI = 3.56165156;  
	    
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2."); // O sinal de mais para fazer a concatenação (juntar as partes).
	}
}
