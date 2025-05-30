package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2" .equals(s1));
		
		Scanner entrada = new Scanner(System.in); 
		
		String s2 = entrada.nextLine(); // next tira os espaços em brancos também
		System.err.println("2" == s2.trim()); 
		System.err.println("2" .equals(s2.trim())); //trim tirar os espaços em brancos. 
	
		entrada.close();
		
	}

}
