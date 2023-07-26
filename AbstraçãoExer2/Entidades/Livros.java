package Entidades;

public class Livros extends Itens{
	private String autor;
	private String editora;
	private float precoFinal;
	
//Construtor
	public Livros() {
		autor = autor;
		editora = editora;
	}
	
//Metodos - Gets/Sets
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identificação: " +identificacao+ "; Nome: " +nome+ "; Preço: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+2)/100))+preco;
		return "Preco a pagar: "+precoFinal;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}