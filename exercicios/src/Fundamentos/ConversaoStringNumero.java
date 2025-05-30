package Fundamentos;

//import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
public static void main(String[] args) {
	
	String valor1 = JOptionPane.showInputDialog( 
			"Digite o primeiro número:"); 
	String valor2 = JOptionPane.showInputDialog(
			"Digite o segundo número:");
	/*JOptionPane.showInputDialog é um método em Java que exibe uma caixa de diálogo que solicita ao usuário que insira um valor inserido pelo usuário
	 *  ou null se o usuário cancelar a entrada.
	 *  É útil para interações simples com o usuário em programas de interface gráfica. 
	 */
	
	System.out.println(valor1 + valor2); // Aqui estou fazendo uma concatenação.
	
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	/**
	 * Double.parseDouble é um método em Java que converte uma string em um valor do tipo primitivo double.
	 * Ele analisa a string fornecida como argumento e retorna o valor double correspondente.
	 * Se a string não puder ser analisada como um número válido, uma exceção NumberFormatException será lançada. Este método é útil 
	 * quando você precisa converte string que representam números em valores numéricos reais para realizar cálculos ou outras 
	 * operações matemáticas.
	 */
	
	double soma = numero1 + numero2;
	System.out.println("Soma é " + soma);
	System.out.println("Média é " + soma / 2);
 
	//BigDecimal: precissão 
}
}
