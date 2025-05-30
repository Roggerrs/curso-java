package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // silenciar as advertencias. 
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// conversão automática.
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // cha em caracter

		System.out.println("Tamanho é " + conjunto.size()); // tamanho do conjunto.
		
		conjunto.add("teste");
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size());
		
		/*
		 * No Java, o conceito de "size" geralmente se refere ao tamanho ou á quantidade de elementos em uma coleção, array ou estrutura de dados. 
		 * Abaixo estão alguns exemplos de como o "size" é utilizado em diferentes contextos no Java:^
		 * 1. Arrays: Para  obter o tamanho de um array, usa-se a propriedade 
		 * length.
		 * in[] arr = {1,2,3,4};
		 * int tamanho = arr.lenght; // tamanho será 4
		 * 
		 * 2. ArrayList e outras coleções: Para coleções como ArrayList, HashSet, LinkedList, etc., O método size() é usado para obter o número de elementos.
		 * ArrayList<String> Lista = new
		 * ArrayList<>();
		 * lista.add("A");
		 * lista.add("B");
		 * int tamanho = lista.siza(); // tamanho será 2
		 * 
		 * 3. Strings: Para obter o número de caracteres em um String, utiliza-se o método lenght().
		 * String texto = "Hello";
		 * int tamanho = texto.lenght(); // tamanho será 5
		 * 
		 * Esses são os principais contextos em que o conceito de size é relevante no Java. Ele é essencial para manipulação de dados e 
		 * gerenciamente de coleções dentro de programas Java.
		 */ 
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		/**
		 *   No Java, o conceito de "remove" está relacionado á remoção de elementos de coleções, estruturas de dados, ou mesmo de string.
		 * Abaixo estão alguns exemplos de como "remove" é utilizado em diferentes contexto:
		 * 1. ArrayList e outras coleções: O método remove é usado para remover elementos de coleções como ArrayList, linkedList, HashSet, etc.
		 * Remover por índice:
		 * 
		 * ArraysList<String> Lista =new ArrayList<>();
		 * lista.add("A");
		 * lista.add("B");
		 * lista.remove("0"); //Remove e olemento no índice 0 ("A")
		 * 
		 * Remover por objetos:
		 * 
		 * ArraysList<String> lista = new ArraysList<>();
		 * lista.add("A");
		 * lista.add("B");
		 * lista.remove("A"); // Remove o elemento "A"
		 * 
		 * 2. Mapas (Map): Em estruturas de dados como HashMap, TreeMap, etc., o método remove é utilizado para remover entradas com 
		 * base na chave
		 * 
		 * HashMap<Integer, String> mapa = new HashMap<>();
		 * mapa.put(1, "One");
		 * mapa.put(2, "two");
		 * mapa.remove(1); // Remove a entrada com a chave 1
		 * 
		 * 3. String: Embora não haja um método direto para remover caracteres de uma String (já que as strings em Java são imutáveis),
		 * pode-se criar uma nova String excluindo certos caracteres usando métodos como substring, replace, ou replaceAll.
		 * 
		 * Usando replace:
		 * 
		 * String texto = "Hello Wold";
		 * String novoTexto = texto.replace("World", ""); // novoTexto será "Hello"
		 * 
		 * Usando substring:
		 * 
		 * String texto = "Hello";
		 * String novoTexto = texto.substring(0, 2) + 
		 * texto.substring(3); // novoTexto será "Helo" (removendo o caractere na posição 2)
		 * 
		 * Esses são exemplos de como o conceito de "remove" é aplicado no Java para manipular e modificar coleções de dados e string. 
		 */
		
		System.out.println("Tamanho é " + conjunto.size()); 
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		/**
		 * No Java, o método contains é utilizado para verificar se um determinado elemento ou sequência de caracteres está presente em uma
		 * coleção ou string. Abaixo estão alguns exemplos de como contains é utitlizado em diferentes contextos:
		 * 
		 * 1. Listas e outras coleções: E, colecões como ArraysList, HashSet, LinkedList, etc., o método contains verifica se um 
		 * determinado objeto está presente na coleção
		 * 
		 * ArrayList<String> lista= new 
		 * ArraysList<>();
		 * lista.add("A");
		 * lista.add("B");
		 * boolean contemA =
		 * lista.contains("A"); // retorna true
		 * boolean contemC = 
		 * lista.contains("C"); // retorna false
		 * 
		 * 2. Mapa (Map): Embora não exista um método contains direto, há métodos semelhantes como contaisKey e contaisValue para
		 * verificar a presença de chaves ou valores.
		 * 
		 * HashMap<Integer, String> mapa
		 * = new HashMap<>();
		 * mapa.put(1, "One");
		 * mapa.put(2, "Two");
		 * boolean contemChave1 =
		 * mapa.containsKey(1); // retorno true 
		 * boolean contemValorTwo = mapa.containsValue("Two"); // retorna true
		 * 
		 * 3. Strings: O método contains na calsse String verifica se uma sequência de caracteres está presente na string.
		 * 
		 * String texto = "Hello world";
		 * boolean contemHello = 
		 * texto.contains("Hello"); // retorna true
		 * bollean contemJava = 
		 * texto.contains("Java"); // retorna false
		 * 
		 * Esses são os principais contextos em que o método contains é utilizado no Java. Ele é essencial para verificar a presença 
		 * de elementos ou sequências dentro de coleções de dados string.
		 * 
		 * 
		 */
		
		Set nums = new HashSet(); 
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
	 System.out.println(nums);
	 System.out.println(conjunto);
	 
	 conjunto.addAll(nums); // União entre dois conjuntos
	 conjunto.retainAll(nums);
	 System.out.println(conjunto);
	 
	 conjunto.clear(); // limpar
	 System.out.println(conjunto); 

		
		
	}
	

	
}