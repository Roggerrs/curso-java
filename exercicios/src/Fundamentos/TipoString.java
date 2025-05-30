package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4)); // .chartAt escolher as palavras por numeração.
		
		String s = "Boa tarde"; // String é um valor imutável.
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa tarde")); //Ele retorna verdadeiro se a String começar com o prefixo especificado (Boa tarde) e falso caso contrário. 
		System.out.println(s.toLowerCase() .startsWith("boa tarde"));
		System.out.println(s.toUpperCase() .endsWith("TARDE")); //terminar verdadeiro ou falso;
		System.out.println(s.length()); //Quantos caráter tem uma String.
		System.out.println(s.toLowerCase().equals("boa tarde")); //toLowerCase transformar a string em minúscula. 
		System.out.println(s.equalsIgnoreCase("boa tarde")); // nesta caso ele não vai se importa com letra maiúscula, ou minúscula.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome:" + nome + "\nSobrenome:" 
	    + sobrenome + "\nidade: " + idade + "\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase); // Eu posso criar mais uma string como a concatenação de várias outras string, valores inteiros.
		/**
		 * System.out.println("Nome:" + nome + "\nSobrenome:" 
		 * + sobrenome + "\nidade: " + idade + "\nSalario: " + salario + "\n\n"); 
		 */
		
	/**
		 * %s método printf() ou fomat() da classe String. Indica que o valor da varável Pedro será inserido na string no local onde %s está presente.
		 * %d método printf() ou fomat() da classe String. Ela indica que um argumento inteiro (presentado como um número valor numérico 1, -5, 100)
		 *  deve ser substituído no local onde %d é encontrado na string de formato.
		 *  %f método printf() ou fomat() da classe String.Quando usado em uma string de formato, 
		 *  %f indica que um valor de ponto flutuante (tipo de dado numérico usado para representar números reais.) deve ser substituído no local onde %f é encontrado na string de formato. 
	 */
		System.out.printf("O senhor  %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario); // .2f é para colocar duas casa decimais. 
		
		String frase = String.format("\nO senhor  %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario); // faz a mesma coisa no exemplo acima.
		System.out.println(frase); 
		/**
		 *  format ele funciona de forma semelhante ao método printf() permitindo que você insira valores formatados em uma string.
		 *  Usando %s, %d, %f String.format() é usado para criar uma string formatada com o nome e a idade de uma pessoa.
		 */
		System.out.println("Frase qualquer".contains("qual")); // exercício verdadeiro, ou falso.  
		System.out.println("Frase qualquer".indexOf ("qual")); // A partir do 6 começa a palavra qual.
		System.out.println("Frase qualquer".substring(6)); // começar a partir do caráter 6, resulta na string qualquer
		System.out.println("Frase qualquer".substring(6,8 )); // 8 não entra no resultado final, entra o 7 resultado é qu.
		
	}

}
