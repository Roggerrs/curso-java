package classe;

public class DataTesteDesafio {
	
	public static void main(String[] args) {
		
		
		DataDesafio d1 = new DataDesafio();
		d1.ano = 2021;
		
		var d2 = new DataDesafio(31, 12, 2020);
	
		
		
		
		String dataFormatada1 = d1.obterDataFormatada(); 
		
		System.out.println(dataFormatada1);
		System.out.printf(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();

		
		
	}

}
