package classe;

public class AreaCirc {
//Variáveis estáticas
	double raio;
	final static double PI = 3.1415; // double pi = 3.14; Eu posso  inciar a variável na sua propriá. O resultado será o mesmo. 
	//Observação: Na linha 10, e 11 terá que ser apagado. 
	
	 AreaCirc(double  raioInicial) {
		 raio = raioInicial; 
		 
  //  pi = 3.14;
//	raio = raioInicial;
	
	 }
	 //Método estáticos:
	 double area () {
	 return PI* Math.pow(raio, 2) ; // pow pertence diretamente a classe.
	 }
	 static double area(double raio) {
		 return PI * Math.pow(raio,2);
	
	}
	/**
	 * Static em Java é uma palavra-chave que pode ser aplicada a membros de uma classe, incluindo variáveis e métodos. Quando um membro é declarado como "Static",
	 * siginifica que ele pertence á classe em vez de instâncias individuais dessa classe. Aqui está o que isso significa para diferentes tipos de membros:
	 */
	 
	 /**
	  * 1. Variáveis estáticas (ou campos estáticos): Uma variável estática é compartilhada por todas as instâncias (objetos) da classe.
	  * Isso significa que, independentemente de quantas instâncias da classe são criadas, apenas uma cópia da variável estática é mantida em memória.
	  * 
	  * Exemplo: public class Exemplo {
	  *   static int contador = 0;
	  *   }
	  *   
	  *   Método estáticos: Um método estático pode ser invocado sem criar uma instância da classe. Ele opera apenas em varáveis estáticas ou outros membros
	  *   estáticos da classe, pois não tem acesso ao contexto de uma instância específica.
	  *   
	  *   Exemplo: public Matematica {
	  *   public static int somar(int a, int b) {
	  *          return a + b;
	  *        }
	  *     }
	  *   O uso de membros estáticos é comum em situações em que os dados ou comportamentos são compartilhados entre todas as instâncias de uma classe
	  *   ou quando não é necessário p contexto de uma instância específica para realizar uma operação.
	  */ 
}


