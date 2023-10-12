package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
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
	
//Metodos - Sets
	public String toString(String nome, String siglaIdent, int numColab, Colaborador colab) {
		return "Nome: " +nome+ "; Sigla de Identidade: " +siglaIdent+ "Número de Colaboradores: " +numColab+ "Colaboradores: " +colab;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String setSiglaIdent(String siglaIdent) {
		return this.siglaIdent = siglaIdent;
	}

	public int setNumColab(int numColab) {
		return this.numColab = numColab;
	}

	public void setColab(Colaborador colab) {
		this.colab = colab;
	}
}