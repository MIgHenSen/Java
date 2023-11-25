package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Produto {
	 private String nome;
	 private double preco;
	 private int quantidade;
	 
/* Construtor */
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
