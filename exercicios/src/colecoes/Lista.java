package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
	
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
	
		System.out.println(lista.get(3).nome); 
		/**
		 *  Em Java, o comando get pode ser usado em diferentes contextos, dependendo do tipo de estrutura de dados 
		 *  ou classe que você está utilizando. O método get é frequentemente usado em coleções como List,Map, 
		 *  e também em outras classes que seuqem a convenção de nomes de métodos "getter".
		 */
		
	System.out.println(">>> " +	lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
	}

}
