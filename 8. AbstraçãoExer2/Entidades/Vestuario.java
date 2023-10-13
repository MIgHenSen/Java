package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Vestuario extends Itens{
	private String descricao;
	private String tamanho;
	private float precoFinal;
	
//Construtor
	public Vestuario() {
		descricao = descricao;
		tamanho = tamanho;
	}
	
//Metodos
	@Override
	public String tostring(int identificacao, String nome, int preco, float imposto) {
		return "Identifica��o: " +identificacao+ "; Nome: " +nome+ "; Pre�o: " +preco+ "; Imposto: " +imposto;
	}

	@Override
	public String getPreco(int preco, float imposto) {
		precoFinal = (preco*((imposto+7)/100))+preco;
		return "Pre�o a pagar: " +precoFinal;
	}
}