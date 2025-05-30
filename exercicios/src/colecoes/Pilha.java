package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop()); vai dar erro também
//		System.out.println(livros.remove()); vai dar erro
		
//		livros.size(); // tamanho
//		livros.clear(); // limpar
//		livros.contains(); 
		
//		livros.isEmpty(); Se estiver vazia vai dar verdadeiro, ao contrario false. 
		// livros. para explorar os métodos. 
	}
	
}
