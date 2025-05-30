package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		  // segredo
		   // facoDentroDeCasa
		   // formaDeFalar 
		   // todosSabem
			
	//	Ana mae = new Ana();  acessar por herança não precisa criar a 'Ana', porque o pedro herda de Ana.
		
		// System.out.println(mae.facoDentroDeCasa);
			System.out.println(formaDeFalar); // acesso diretamente porque estou por herança
			System.out.println(todosSabem);
			System.out.println(new Ana());
		//	System.out.println(new Ana().formaDeFalar);  Não vai conseguir acessar. atributo ao um objeto, tem que ser herança; 
			// System.out.println(facoDentroCasa);

			
		//	System.out.println(mae.segredo);

	}
}
