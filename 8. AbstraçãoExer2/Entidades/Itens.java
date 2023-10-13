package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public abstract class Itens {
	private int identificacao;
	private String nome;
	private int preco;
	private float imposto;
	
//Construtor
	public Itens() {
		identificacao = identificacao;
		nome = nome;
		preco = preco;
		imposto = imposto;
	}
	
//Metodos - Sets
	public abstract String tostring(int identificacao, String nome, int preco, float imposto);
	public abstract String getPreco(int preco, float imposto);

	public int setIdentificacao(int identificacao) {
		return this.identificacao = identificacao;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public int setPreco(int preco) {
		return this.preco = preco;
	}

	public float setImposto(float imposto) {
		return this.imposto = imposto;
	}
}