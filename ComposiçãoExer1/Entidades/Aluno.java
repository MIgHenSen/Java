package Entidades;

public class Aluno {
	private String nome;
	private int idade;
	
//Construtor
	public Aluno() {
		idade = idade;
		nome = nome;
	}
	
//Metodos - Gets/Sets
	public String toString(String nome, int idade) {
		return "Nome: " +nome+ "; Idade: " +idade;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
}