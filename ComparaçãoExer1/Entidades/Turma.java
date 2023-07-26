package Entidades;

public class Turma {
	private String professor;
	private String disciplina;
	
//Construtor
	public Turma() {
		professor = professor;
		disciplina = disciplina;
	}
	
//Metodos - Gets/Sets
	public String toString(String disciplina, String professor) {
		return "Disciplina: " +disciplina+ "; Professor: " + professor;
	}

	public String getProfessor() {
		return professor;
	}

	public String setProfessor(String professor) {
		return this.professor = professor;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public String setDisciplina(String disciplina) {
		return this.disciplina = disciplina;
	}
}