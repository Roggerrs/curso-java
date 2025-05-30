package Fundamentos.Operados;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (v ou f)
		// Trabalho na quinta (v ou f)
		// ALT + SHIT + A selecionar o texto.
		                  
		boolean trabalho1 = false; 
		boolean trabalho2 = false; 
		                  
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete; 
		
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("comprou TV 32\"? " + comprouTv32);
		System.out.println("comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);

	
		
	}

}
