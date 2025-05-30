package colecoes;


import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		
		// Offer e Add-> adicionam elementos na fila
		
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma execeção
		fila.offer("Carlos"); 
		fila.offer("Daniel"); 
		fila.offer("Rafaela"); 
		fila.offer("Gui"); 
		
		// Peek e Elemento -> obter o próximo elementos da fila (sem remover) 
		
		//Diferença é o comportamento ocorre
		//quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		// fila.size(); obter número de elementos.
		// fila.clear(); limpar fila
		// fila.isEmpty(); para saber se a fila esta ou não fazia
		
		// Poll e Remove -> obter o próximo elemento
		// da fila e remover! 
		
		//Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); // nunca jogar remove com a lista vazia.
	//	System.out.println(fila.remove()); // nunca jogar remove com a lista vazia.
		
		// fila.size(); obter número de elementos (contar tamanho da fila).
		// fila.clear(); limpar fila
		// fila.isEmpty(); para saber se a fila esta ou não fazia
		// fila.contains(...) para saber se o objeto esta contido. 
		
		

	
		/**
		 * poll(): Remove e retorna o elemento na frente da fila, ou retorna na frente da fila, ou
		 * retorna null se a fila estiver vazia.
		 * Implementações comuns: 
		 * LinkedList, PriorityQueue, ArrayDeque.
		 * 
		 * Eses exemplos ilustram como o método poll() pode ser usado para manipular elemento em uma fila
		 * de maneira segura e eficiente. 
		 */
		
	}
	/*
	 * Queue (fila) é uma coleção que segue o princípio FIFO (First-In, First-Out), onde os elementos são inseridos no final da fila e
	 * removidos do início. A interface Queue faz parte do pacote java.util e define método para inserir, acessar e remover da fila.
	 * 
	 *  1. LinkedList: Uma das implementações mais comuns de Queue. LinkedList pode atuar tanto como uma lista quando como uma fila.
	 *  
	 *  2. PriorityQueue: Uma implementação onde os elementos são ordenados com base em sua ordem natural ou por um Comparador fornecido.
	 *  
	 *  MÉTODOS COMUNS DA INTERFAFE QUEUE
	 * 
	 *  1. add(E e): Insere o elemento especificado na fila. Se a fila tiver uma capacidade limitada e estiver cheia. lançará uma exceção
	 *  IllegalsStateException.
	 * 
	 *  2. offer(E e): Insere o elemento especificado na fila. Retorna true se a inserção foi bem-sucedida, false se a fila tiver uma capacidade limitada e estiver cheia.
	 * 
	 *  3. remove(): Remover e retorna o elemento na cabeça da fila. lançará uma execeção NoSuchElementException se a fila estiver vazia.
	 *  
	 *  4. poll(): Remove e retorna o elemento na cabeça da fila. Retorna null se a fila estiver vazia. 
	 *  
	 *  5. element(): Retorna, mas não remove, o elemento na cabeça da fila. Lançará uma exceção NoSuchElementException se a fila estiver vazia.
	 *  
	 *  6. peek(): Retorna, mas não remove, o elemento na cabeça da fila. Retorna null se a fila estiver vazia.
	 *  
	 *  Exemplo de uso de Queue com LinkedList
	 *  
	 *  import java.util.linkedList;
	 *  import java.util.Queue;
	 *  
	 *  public class ExemploQueue {
	 *   public static void
	 *   man(String[] args) {
	 *     Queue<String> fila = new
	 *  LinkedList<>();
	 *       
	 *       // Adicionando elemento á fila
	 *       
	 *       fila.add("Elemento 1");
	 *       fila.add("Elemento 2");
	 *       fila.add("Elemento 3");
	 *       
	 *       // Acessando o elemento na cabeça da fila
	 *       
	 *       System.out.println("Cabeça da fila: " + fila.element());
	 *       
	 *       // Saída: Cabeça da fila: Elemento 1
	 *       
	 *       // Removendo elemento da fila
	 *       
	 *       System.out.println("Removendo: " + fila.remove());
	 *       
	 *       //Saída: Removendo: Elemento na fila 2
	 *       
	 *       // Verificando o próximo elemento na fila
	 *       
	 *       System.out.println("Cabeça da fila: " + fila.peek());
	 *       
	 *       // Saída: Cabela da fila: Elemento 3
	 *       
	 *       EXEMPLO DE USO DE PRIORITYQUEUE
	 *       
	 *       import java.util.PriorityQueue;
	 *       import java;util.Queue;
	 *       
	 *       public class ExemploPriorityQueue
	 *       {
	 *       public static void 
	 *       main(String[] args) {
	 *         Queue<Integer>
	 *         filaPrioridade = new 
	 *         PriorityQueue<>();
	 *         
	 *         // Adicionando elementos á fila
	 *         
	 *         filaPrioridade.offer(30);
	 *         filaPrioridade.offer(10);
	 *         filaPrioridade.offer(20);
	 *         
	 *         // Removendo e acessando elementos da fila
	 *         
	 *         System.out.println("Removendo: " + filaPrioridade.poll());
	 *         //Saídade Removendo: 10 
	 *         
	 *         System.out.println("Removendo: " + filaPrioridade.poll()): 
	 *         //Saída: Removendo: 20
	 *         
	 *         System.out.println("Cabeça da fila: " + filaPrioridade.peek());
	 *         // Saídade: Cabeça da fila: 30
	 *         
	 *         Esses exemplos demonstram como interface Queue pode ser utilidade para gerenciar coleções de elementos 
	 *        em Java, como diferentes implementações oferecendo diversas características e comportamentos.
	 *       
	 */
}

