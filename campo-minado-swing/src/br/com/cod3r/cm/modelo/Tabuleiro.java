package br.com.cod3r.cm.modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores = 
			new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registarObservador(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	public void notificarObservadores(boolean resultado) {
		observadores.stream()
		.forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}
	
	
	public void abrir(int linha, int coluna) {
	        campos.parallelStream()
	            .filter(c -> c.getLinha() == linha && c.getColuna() == coluna) // Removi o ponto e vírgula aqui
	            .findFirst()
	            .ifPresent(c -> c.abrir());
	  
	    }
	
	

	public void alternarMarcacao(int linha, int coluna) {
	    campos.parallelStream()
	        .filter(c -> c.getLinha() == linha && c.getColuna() == coluna) // Removi o ponto e vírgula aqui
	        .findFirst()
	        .ifPresent(c -> c.alternarMarcacao());
	}
	
	
	
		
	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
				
			}
		}
	}
	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
			c1.adicionarVizinho(c2);
		}
	  }
	}
	private void sortearMinas() {	
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			minasArmadas = campos.stream().filter(minado).count();
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
		} while(minasArmadas < minas);
	}
		
		public boolean abjetivoAlcancado() {
			return campos.stream().allMatch(c -> c.abojetivoAlcancado());
		 
		
	}
		
		public void reiniciar() {
			campos.stream().forEach(c -> c.reiniciar());
			sortearMinas();
		}
		
		public int getLinhas() {
			return linhas;
		}
		public int getColunas() {
			return colunas;
			
			
			
		}
		@Override
		public void eventoOcorreu(Campo campo, CampoEvento evento) {
			if(evento == CampoEvento.EXPLODIR) {
				mostarMinas();
				notificarObservadores(false);
			} else if (abjetivoAlcancado()) {
				notificarObservadores(true);
			}
		}
			private void mostarMinas() {
				campos.stream()
		         .filter(c -> c.isMinado())
		         .filter(c -> !c.isMarcado()) 
				.forEach(c -> c.setAberto(true));
			
			
		}
		
}
