package classe.Investimento;

public class Investidor {
	
	String investidor;
	double compostos;
	
	Investidor(String investidor, double compostos) {
		this.investidor = investidor;
		this.compostos = compostos;
		
	}
	
	void pagamento (Dinheiro moeda) {
		if (moeda != null) {
			this.investidor += moeda.compostos;
		}

	}
	
	String saldo() {
		return " Saldo atualizado " + investidor + " Rentabilidade "  + compostos + "R$. ";
	}
	
	}


