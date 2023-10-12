package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public abstract class Pessoa {
	protected String nome;
	protected int idade;
	
//Construtor
	public Pessoa() {
		idade = idade;
		nome = nome;
	}
	
//Metodos - Sets
	public abstract String toString(String nome, int idade);

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
}