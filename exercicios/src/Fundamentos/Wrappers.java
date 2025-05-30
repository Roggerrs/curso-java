package Fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner (System.in);
		
		// Byte
		Byte b = 100;
		Short s = 1000;
		Integer i =  10000; // Integer = int. Integer.parseInt () é um método estático da classe Integer 
		//que converte uma string da classe Integer que converte uma string em um valor do tipo inteiro.  
		//Integer.parseInt(entrada.next());
		Long l = 10000L; // L precisa colocar no final do valor para se tornar Long.
		//long minúsculo se torna uma classe primitiva. 
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); 
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f= 123.10F;
		System.out.println(f);
		
		Double d = 645156.5677;
		System.out.println(d); 
		
		Boolean bo = Boolean.parseBoolean("true"); 
		System.out.println(bo);
		//System.out.println(bo. toUpperCase()); Não tem essa possibilidade
		System.out.println(bo.toString(). toUpperCase()); 
		
		Character c = '#'; // char
		System.out.println(c + "...");
		
		
		//entrada.close();	
		
		       
	}
}
