package Entidades;

public class Departamento {
	private String nome;
	private String siglaIdent;
	private int numColab;
	Colaborador colab;
	
//Construtor
	public Departamento() {
		nome = nome;
		siglaIdent = siglaIdent;
		numColab = numColab;
		colab = colab;
	}
	
//Metodos - Gets/Sets
	public String toString(String nome, String siglaIdent, int numColab, Colaborador colab) {
		return "Nome: " +nome+ "; Sigla de Identidade: " +siglaIdent+ "Número de Colaboradores: " +numColab+ "Colaboradores: " +colab;
	}

	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getSiglaIdent() {
		return siglaIdent;
	}

	public String setSiglaIdent(String siglaIdent) {
		return this.siglaIdent = siglaIdent;
	}

	public int getNumColab() {
		return numColab;
	}

	public int setNumColab(int numColab) {
		return this.numColab = numColab;
	}

	public Colaborador getColab() {
		return colab;
	}

	public void setColab(Colaborador colab) {
		this.colab = colab;
	}
}