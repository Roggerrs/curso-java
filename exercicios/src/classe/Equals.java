package classe;



public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario ();
		u1.nome = "Pedro Silva";
		u1.email = "Pedro.silva@email.com";
		
		Usuario u2 = new Usuario ();
		u2.nome = "Pedro Silva";
		u2.email = "Pedro.silva@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); // == e o equals tras o mesmo resultado. 
		System.out.println(u2.equals(u1));
		
		
		// System.out.println(u2.equals(new Date()));
		
		//System.out.println(u1 == u1);
		//System.out.println(u2 == u2); Os dois resultado verdadeiro. 

	}

}
