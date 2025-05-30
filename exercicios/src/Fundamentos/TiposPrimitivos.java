package Fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// informações do funcionario
		
		// 4 Tipo numéricos inteiros
		
		
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // underline  para facilitar a leitura. 
		// O sufixo L é utilizado para indicar que um valor literal é do tipo long. 
		
		// 2 Tipo numéricos com ponto funtuante
		
		// tipo numérico reais
		float salario = 11_445.44F; // Tipo double. Colocar um literal dentro de um float, usar a letra F.
		double vendasAcumuladas = 2_991_797_103.01; 
		
		// tipo booleano
		
		boolean estaDeFerias = true; // false
		
		// tipo caractere
		
		char status = 'A'; // ativo. Pode colcoar um símbolo (?), pode colocar um numero, não pode colocar duas letras. Pode colocar /0010.
		
		// Dias de empresa 
	  System.out.println(anosDeEmpresa * 365);
	  
	  // Número de viagens
	  System.out.println(numeroDeVoos / 2);

	  // pontos por real
	  System.out.println(pontosAcumulados / vendasAcumuladas); 
	  
	  System.out.println( id + ": ganha -> " + salario);
	  System.out.println("Férias?" + estaDeFerias); 
	  System.out.println("Status:" + status);
	 
	  
	  
	}

}
