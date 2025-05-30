package Fundamentos;

public class inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e incialização.   Eu posso colocar fora do main. 
		System.out.println(a);
		
		a = 12.57; // trabalhando com o mesmo tipo.
		System.out.println(a);
		
		// a = "texto"; essa variável não é permitda no Java porque ela foi definida como numeros inteiros. Amarrada a um tipo
		
		/** var é uma palavra-chave introduzida no Java 10 para simplificar a declação de variáveis locais, 
		permitindo que o tipo da variável seja inferido pelo compilado com base no tipo da expressão á direita.
	    Isso pode tornar o código mais conciso e legível,especialmente em casos onde o tipo da varável é óbvio a partir da inicialização. 
	  */
		
		var b = 4.5; 
		System.out.println(b);
		
		var c = "Texto"; // O tipo de 'texto' é inferido como String
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		 
		// c = 4.5; essa variável não é permitda no Java porque ela foi definida como texto. marrada a um tipo
		
		double d; // variável foi declada
		d = 123.6; // variável foi inicializada
				System.out.println(d); // usada!
				
				/** var e;
				 * e = 123.45;
				 * Acima eu não consigo fazer isso.
				 */
				var e = 123.45;
				System.out.println(e);
				
				/** var f 12; inteiro 
				 * f = 12.01
				 * Uma vez você criando  valor inteiro, você não consegue criar valor como casas decimais 
				 */
		
	}

}
