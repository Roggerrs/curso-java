package classe.Investimento;

public class Banco {
	
	public static void main(String[] args) {
		
		Dinheiro p1 = new Dinheiro("Janeiro", 100);
		Dinheiro p2 = new Dinheiro("Fevereiro", 200);
		
		Investidor i = new Investidor("Carlos ", 50_000.00);
		
		System.out.println(i.saldo());
		i.pagamento(p1);
		
		System.out.println(i.saldo());
		i.pagamento(p2);
		
		System.out.println(i.saldo());
		
		
		
		
	}

}
