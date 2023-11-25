package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Endereço {
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String nomeRua;
	private int numCasa;
	private int cep;
	
//Construtor
	public Endereço() {
		pais = pais;
		estado = estado;
		cidade = cidade;
		bairro = bairro;
		nomeRua = nomeRua;
		numCasa = numCasa;
		cep = cep;
	}
	
//Metodos - Gets/Sets
	public String toString(String pais, String estado, String cidade, String bairro, String nomeRua, int numCasa, int CEP) {
		return "País: " +pais+ "Estado: " +estado+ "Cidade: " +cidade
				+ "Bairro: " +bairro+ "Rua :" +nomeRua+ "Numero da casa: " +numCasa+ "CEP: " +cep;
	}

	public String setPais(String pais) {
		return this.pais = pais;
	}

	public String setEstado(String estado) {
		return this.estado = estado;
	}

	public String setCidade(String cidade) {
		return this.cidade = cidade;
	}

	public String setBairro(String bairro) {
		return this.bairro = bairro;
	}

	public String setNomeRua(String nomeRua) {
		return this.nomeRua = nomeRua;
	}

	public int setNumCasa(int numCasa) {
		return this.numCasa = numCasa;
	}

	public int setCep(int cep) {
		return this.cep = cep;
	}
}
