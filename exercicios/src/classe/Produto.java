package classe;

public class Produto {
	
	// essas são as informações parâmentros.
	String nome;
	double preco;
	static  double desconto = 0.25;
	
	/*Void é uma palavra-chave usda para indicar que um método não retorna nenhum valor.
	 *  Quando um método é declado com void como tipo de retorno, isso significa que o método executa uma tarefa, mas não
	 *  produz nenhum resultado que precise ser retornado.
	 */  
	
Produto(){ 
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial; 
		preco = precoInicial; 
		
	}
	
	
	
	double precoComDesconto() { // adicionei um parâmentro. 
		return preco * (1 - desconto );
	}
	double precoComDesconto(double descontoDoGerente) { // adicionei um parâmentro. 
		return preco * (1 - desconto + descontoDoGerente);
	}

}

