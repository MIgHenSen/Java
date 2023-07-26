package Entidades;

public class Aluno extends Pessoa{
	private int identificacao;
	
//Construtor
	public Aluno() {
		identificacao = identificacao;
	}

//Metodos - Gets e Sets
	@Override
	public String toString(String nome, int idade) {
		return "Nome: " +nome+ "; Idade: " +idade+ "; Identificação: " +identificacao;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}
}