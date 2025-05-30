package controle;

import javax.swing.JOptionPane;

public class IfElse {
public static void main(String[] args) {
	
	String valor = JOptionPane.showInputDialog("Informe o número");
	
	int numero = Integer.parseInt(valor); 
	
	if(numero % 2 == 0)
	{
	System.err.println("Número par!");
		
	}
	if(numero % 2 == 1)
	{
	System.out.println("Número ímpar!");
	}
		
	if(numero % 2 == 0)
	{
		System.out.println("Número par");
	}
	
	/**
	 * else é uma palavra-chave usada em conjunto com if para fornecer uma alternativa caso a condição do if não seja atendida.
	 *  Isso significa que, se a condição do if não seja atendida. Isso significa que, se a condição do if for
	 *  avaliada como falsa, o bloco de código dentro do else será executado. Isso é útil para criar lógica condicional em programa Java.
	 */
	
	else 
	{
	
		System.out.println("Numero ímpar!");
	}
	
}
}

