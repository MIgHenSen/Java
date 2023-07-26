package Entidades;

public class Colaborador {
	private int identificacao;
	private String nome;
	private String cargo;
	private int idade;
	
//Construtor
	public Colaborador() {
		identificacao = identificacao;
		nome = nome;
		cargo = cargo;
		idade = idade;
	}
	
//Metodos - Gets/Sets
	public String toString(int identificacao, String nome, String cargo, int idade) {
		return "Identificação: " +identificacao+ "; Nome: " +nome+ "; Cargo: " +cargo+ "; Idade: " +idade;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public String setCargo(String cargo) {
		return this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
}