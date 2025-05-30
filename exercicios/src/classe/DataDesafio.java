package classe;

public class DataDesafio {
	
	int dia;
	int mes;
	int ano;
	
	DataDesafio() {
		//dia= 1;
		//mes = 1;
		//ano = 1970;	
		this (1, 1, 1970);  //chamei como função o this. Chamei como metodo que é um construtor.
	}	
	DataDesafio(int dia, int mes, int ano) {
	//this(); não pode vai dar loop 
		this.dia = dia;
		this.mes = mes;
		this.ano = ano; 	
	}

	String obterDataFormatada() {
	final String formato = "%d/%d/%d"; 
	return String.format(formato, this.dia, mes, ano);
		// this (1, 1, 1970);Isso ka não posso fazer porque não é um constutor.   
		
		
/** Geralmente se refere ao método String.format(), que é usado para criar string formatadas com base em um 
 * padrão especificado e uma lista de argumentos.
 *  Isso permite que você insira valores em string de forma mais dinâmica e organizada. 
*/
	}
	
void imprimirDataFormatada() { //void ausência de retorno. Não preciso retornar nada. 
	System.out.println(this.obterDataFormatada()); 
}



}

// Esse tipo método não irá funcionar  desktop, aplicação web, mobile, porque ele vai funcionar em uma aplicação interminal.  
// 