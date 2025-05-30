package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //.length: quantidade de caracteres pertece a essa string, 
		//e não tem nenhuma associação com metodo primitido, com  apenas o valor.
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		/**long.toString(i);
		 * Double.toString(d);
		 * Short.toString(s);
		 * Pode acontecer com outros tipos.
		 */
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		/**
		 * toString é um método em Java que está presente em todas as classes, pois é definido na classe Object, da
		 * qual todas as outras classes herdam.
		 * Ele converte um objeto em uma representação de string. Por padrão, o método toString retorna uma representação da
		 * classe do objeto, seguida pelo "@" e o hashCode do objeto em hexadecimal. No entranto, muitas classes substituem esse método para 
		 * fornecer uma representação mais significativa do objeto em forma de string. Isso é útil para imprimir informações sobre o 
		 * objeto ou para facilitar a depuração. 
		 */

		
		
	}

}
