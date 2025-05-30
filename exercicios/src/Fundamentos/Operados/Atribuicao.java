package Fundamentos.Operados;

public class Atribuicao {
public static void main(String[] args) {
	
	int a = 3;
	int b = a;
	int c = a + b;
	
	c += b; //c = c + b; aditiva
	c -= a; // c = c - a; subtrativa
	c *= b; // c = c * b; multiplicativa
	c /= a; // c = c / a; divisível. Se você não quer número quebrado, valores inteiros a.
	//c %= 2; // c = c % 2; resultado: 0 ou 1 Módulo. Eu quero saber se é 0 par ou 1 ímpar. 
	 
	
	
    System.out.println(c);
    
    c %= 2; // c = c % 2; 0 ou 1
    System.out.println(c);
    
    
    
    
    

;

	
}
}
