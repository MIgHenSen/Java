package Entidades;

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
	
//Metodos - Gets/Sets
	public abstract String tostring(int identificacao, String nome, int preco, float imposto);
	public abstract String getPreco(int preco, float imposto);

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

	public int getPreco() {
		return preco;
	}

	public int setPreco(int preco) {
		return this.preco = preco;
	}

	public float getImposto() {
		return imposto;
	}

	public float setImposto(float imposto) {
		return this.imposto = imposto;
	}
}