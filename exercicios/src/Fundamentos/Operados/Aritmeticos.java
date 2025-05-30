package Fundamentos.Operados;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // valor inteiro
		System.out.println(a / (double) b); // valor quebrado. Precisar maior que o float.
		System.out.println(a / (float) b); // Precisão menor.
		
		
		System.out.println(a % b);// valor de modulo
        System.out.println(8 % 3);
        
        System.out.println(x + y - a * b); 
		
	}

}
