package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data(): null;
		
		// Data d1 = null;
		//d1.mes = 3; // A variável não aponta para um objeto real, no Java da erro.
		
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.ObterDataFormatada()); 
		}
		
	
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
		
		System.out.println(s2.concat("????")); // Está com problema, porque será nula. 
		}
		//String s2 = null; 
		//System.out.println(s2.concat("????")); // Erro de tempo de execução. RunTime
		
		//String s2;
		//System.out.println(s2.concat("????")); 
		
		/**
		 *  erro de compilação. Transformar um arquivo .java para um arquivo .class você não vai conseguir, porque o compilador
		 *  não está permitindo você converter o Java para um .class, porque tem um erro de compilação (regra da linguagem violada).
		 * Erro:  Tempo de execução.  NullPointerExecepetion: Você tem uma variável Null, você tentar acessar um atributo, comportamento, ou
		 * um método.  
		 */
	}
	

}
