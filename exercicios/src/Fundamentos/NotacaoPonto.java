package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		// double a = 2.3; // Quando fica em negrito, são palavras reservadas do java tipos primitivos
		String s = "Bom dia X"; 
		s = s.replace("X", "Senhora"); 
		s = s.toUpperCase(); //transformar em letra maiúscula 
		s = s.concat("!!!"); // O método concat é usado para concatenar duas strings, ou seja, para juntar duas string em uma única. 
	
		//s.replace("X", "Senhora"); Não altera o resultado
		
		// s = s.replace("X", "Senhora"); A palavra Senhora vai ficar com letra minúscula, por conta da ordem toUpperCase. 
		System.out.println(s); 

		
	String x = "Leo" .toUpperCase();
		System.out.println(x); 
		// System.out.println("Leo" .toUpperCase()); Resultado LEO com letra maiúscula.
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!"); 
		System.out.println(y); 
		
		// Tipos primitivos não tem o operador "."
		
		
	}
}
