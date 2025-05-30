package Fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a =  1.468855511515; // implícitaa
		System.out.println(a);
		
		float b = (float) 1.468855511515; // Explícita (CAST) Pode adicionar F, exemplo: 1.0F
		/** float é um tipo de dado em Java que representa números de ponto flutuante de presição simples. 
		 * Ele é usado para armazenar valores decimais, mas é menos preciso do que o tipo double.
		 */
		System.out.println(b); 
		
		int c = 127; // maximo
		byte d = (byte) c; //  byte d = c; esta errado. Explícita (CAST)
		System.out.println(d); 
		
		double e = 1.999999; // ele truncou o valor.
		int f = (int) e; // Explícita (CAST)
		System.out.println(f); 
		/**Significado de Truncar em Java refere-se ao processo de remover a parte decimal de um número, 
		 * deixando apenas de um número, deixando apenas a parte inteira. Isso geralmente é feito usando método como Math.floor () 
		 * para arredodndar para baixo ou Math.ceil() para arredondar para cima. Por exemplo, ao truncar onúmero 3.75, o resultado seria 3.
		 */
		
		
	}
	

}
