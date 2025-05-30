package lambdas;


@FunctionalInterface // não pode criar Dois métodos, porque ela não fica funcional. 
public interface Calculo {
	
	  double executar(double a, double b);
	// 	  double executar(double a, double b); NÃO Pode
	
	  default String legal() {
		  return"legal";
	  }

	  static String muitoLegal() {
			return "muito legal";
	  }
}
