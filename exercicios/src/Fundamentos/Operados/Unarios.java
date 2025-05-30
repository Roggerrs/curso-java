package Fundamentos.Operados;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 pos fixado
		a--; // a = a - 1 
		
		++b; // b = b +1; pre fixado
		--b; // b = b - 1;
		
		System.out.println(a); 
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // misturando o operador pos e pre fixado e com comparação ==. 	
		System.out.println(a == b); 
		System.out.println(a);
		System.out.println(b); 
		
		
	}

}
