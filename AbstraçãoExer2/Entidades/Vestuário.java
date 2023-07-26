package Entidades;

public class Vestuário extends Itens{
	private String descricao;
	private String tamanho;
	private float precoFinal;
	
//Construtor
	public Vestuário() {
		descricao = descricao;
		tamanho = tamanho;
	}
	
//Metodos - Gets/Sets
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identificação: " +identificacao+ "; Nome: " +nome+ "; Preço: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+7)/100))+preco;
		return "Preço a pagar: " +precoFinal;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}