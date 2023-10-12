package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
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
	
//Metodos - Sets
	public String toString(int identificacao, String nome, String cargo, int idade) {
		return "Identificação: " +identificacao+ "; Nome: " +nome+ "; Cargo: " +cargo+ "; Idade: " +idade;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String setCargo(String cargo) {
		return this.cargo = cargo;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
}