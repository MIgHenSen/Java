package Entidades;

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
	//Metodos
		public String toString(String pais, String estado, String cidade, String bairro, String nomeRua, int numCasa, int CEP) {
			return "País: " +pais+ "Estado: " +estado+ "Cidade: " +cidade+ "Bairro: " +bairro+ "Rua :" +nomeRua+ "Numero da casa: " +numCasa+ "CEP: " +cep;
		}

		public String getPais() {
			return pais;
		}

		public String setPais(String pais) {
			return this.pais = pais;
		}

		public String getEstado() {
			return estado;
		}

		public String setEstado(String estado) {
			return this.estado = estado;
		}

		public String getCidade() {
			return cidade;
		}

		public String setCidade(String cidade) {
			return this.cidade = cidade;
		}

		public String getBairro() {
			return bairro;
		}

		public String setBairro(String bairro) {
			return this.bairro = bairro;
		}

		public String getNomeRua() {
			return nomeRua;
		}

		public String setNomeRua(String nomeRua) {
			return this.nomeRua = nomeRua;
		}

		public int getNumCasa() {
			return numCasa;
		}

		public int setNumCasa(int numCasa) {
			return this.numCasa = numCasa;
		}

		public int getCep() {
			return cep;
		}

		public int setCep(int cep) {
			return this.cep = cep;
		}
}