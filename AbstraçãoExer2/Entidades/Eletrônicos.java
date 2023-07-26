package Entidades;

public class Eletrônicos extends Itens{
	private float precoFinal;
	
//Construtor
	public Eletrônicos() {
		precoFinal = precoFinal;
	}
	
//Metodos - Gets/Sets
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identificação: " +identificacao+ "; Nome: " +nome+ "; Preço: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+8)/100))+preco;
		return "Preco a pagar: "+precoFinal;
	}
}