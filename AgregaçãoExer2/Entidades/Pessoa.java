package Entidades;

public class Pessoa {
	private String nome;
	private int idade;
	private int identificacao;
	Endereço endereco;
	
//Construtor
	public Pessoa() {
		nome = nome;
		idade = idade;
		identificacao = identificacao;
		endereco = endereco;
	}
	
//Metodos - Gets/Sets
	public String toString(String nome, int idade, int identificacao, Endereço endereco) {
		return "Nome: " +nome+ "Idade: " +idade+ "Identificacao: " +identificacao+ "Endereco: " +endereco;
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

	public int getIdentificacao() {
		return identificacao;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}

	public Endereço getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}
}