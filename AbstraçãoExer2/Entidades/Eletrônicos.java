package Entidades;

public class Eletr�nicos extends Itens{
	private float precoFinal;
	
//Construtor
	public Eletr�nicos() {
		precoFinal = precoFinal;
	}
	
//Metodos - Gets/Sets
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identifica��o: " +identificacao+ "; Nome: " +nome+ "; Pre�o: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+8)/100))+preco;
		return "Preco a pagar: "+precoFinal;
	}
}