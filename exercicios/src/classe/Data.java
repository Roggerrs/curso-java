package classe;

// Criar 3 atributos, dia, mês e ano.

public class Data {
	
	int mes;
	int dia;
	int ano;
	
	final int x;
	
	//int x; // isso irá começar com valor 0, por conta do valor IP
	
	Data() {
	
	this (1, 1, 1970); 
	
	//Objetos valor null
	//String s = null; essa variável não aponta nenum local de memória. 
	
	
	/**
	 * byte, short, int, long -> 0
	 * float, double -> 0.0
	 * bolean -> false
	 * char -> 'u00' 
	 */
	 
	}
	
	Data(int dia, int  mes, int ano) {
		this.x = 0;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	
		
	}
	
	
	String ObterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}

}
