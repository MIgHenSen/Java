package Entidades;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	
//Construtor
	public Pessoa() {
		idade = idade;
		nome = nome;
	}
	
//Metodos - Gets e Sets
	public abstract String toString(String nome, int idade);

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