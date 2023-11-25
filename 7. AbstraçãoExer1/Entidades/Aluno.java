package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Aluno extends Pessoa{
	private int identificacao;
	
//Construtor
	public Aluno() {
		identificacao = identificacao;
	}

//Metodos - Sets
	@Override
	public String toString(String nome, int idade) {
		return "Nome: " +nome+ "; Idade: " +idade+ "; Identifica��o: " +identificacao;
	}

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}
}
