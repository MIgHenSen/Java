package Entidades;

public class Vestu�rio extends Itens{
	private String descricao;
	private String tamanho;
	private float precoFinal;
	
//Construtor
	public Vestu�rio() {
		descricao = descricao;
		tamanho = tamanho;
	}
	
//Metodos - Gets/Sets
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identifica��o: " +identificacao+ "; Nome: " +nome+ "; Pre�o: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+7)/100))+preco;
		return "Pre�o a pagar: " +precoFinal;
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