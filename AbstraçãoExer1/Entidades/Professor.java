package Entidades;

public class Professor extends Pessoa{
	private int identificacao;
	
//Construtor
	public Professor() {
		identificacao = identificacao;
	}

//Metodos - Gets e Sets
	@Override
	public String toString(String nome, int idade) {
		return "Nome: " +nome+ "Idade: " +idade+ "Identificação: " +identificacao;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
}