package Entidades;

public class Produto {
	 private String nome;
	 private double preco;
	 private int quantidade;
	 
//Construtor
	 public Produto(String nome, double preco, int quantidade) {
		 this.nome = nome;
		 this.preco = preco;
		 this.quantidade = quantidade;
	 }
	 
//Metodos - Gets/Sets
	 public String toString() {
		 return "Nome: " + nome + "; Preço: " + preco + "; Quantidade: " + quantidade;
	 }
	 
	 public void decrementarQuantidade() {
			quantidade = quantidade -1;
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}