package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
		
		//this.cursos = new ArrayList<Curso>(); isso não pode.
		
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.aluno.add(this);
	}
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.contentEquals(nome)) {
				return curso;
			}
		}
	return null;	
	}
		public String toString() {
			return nome;
		
	}
	
}
