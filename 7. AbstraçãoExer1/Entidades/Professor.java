package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Professor extends Pessoa{
	private int identificacao;
	
//Construtor
	public Professor() {
		identificacao = identificacao;
	}

//Metodos - Sets
	@Override
	public String toString(String nome, int idade) {
		return "Nome: " +nome+ "Idade: " +idade+ "Identifica��o: " +identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
}