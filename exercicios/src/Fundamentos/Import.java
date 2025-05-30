package Fundamentos;

/** import fica fora do main e a classes para interagir ficar nos imports. 
 * CTRL SHIFT + O ele vai organizar os imports. 
 */

import java.util.Date;

public class Import {
	public static void main(String[] args) {
		
		java.lang.String b = "Boa tarde!"; 
		/**
		 *  'Lang' não existe nativamente na API Java padrão. No entando, 
		 *  pode ser uma classe personalziada definada por um programador, na manipulaçao de String, conversão de tipo de dados.
		 */
		System.out.println(b);
		
		String s = "Bom dia!";
		System.out.println(s);
		 
		Date d = new Date();
		 System.out.println(d); //Vai dar erro tem que importar o date import java.util.Date;
		
	//	JButton botao = new JButton(); // JButton CRTL espaço: Ele ja importa o JButton.
		
	}

}
