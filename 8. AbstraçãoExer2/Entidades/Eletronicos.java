package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Eletronicos extends Itens{
	private float precoFinal;
	
//Construtor
	public Eletronicos() {
		precoFinal = precoFinal;
	}
	
//Metodos
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
