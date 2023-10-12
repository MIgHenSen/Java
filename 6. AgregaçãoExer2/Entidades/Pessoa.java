package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
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

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}
}