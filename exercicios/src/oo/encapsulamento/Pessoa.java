package oo.encapsulamento;

public class Pessoa {

	
	private String nome;
	private int idade;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		seNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
		
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
		
		
	}
	
	// Getter método
	public int getIdade() {
		return idade;
	}
	// Criar os set botão direito Source - Generate Getters and Setters.
	public String getNome() {
		return nome;
	}
	
	public void seNome(String nome) {
		this.nome = nome;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome()
		+ " e tenho " + getIdade() + "anos.";
	}
}
