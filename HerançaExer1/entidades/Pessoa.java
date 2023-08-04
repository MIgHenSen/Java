package entidades;

public class Pessoa {
	protected String nome;
	protected int idade;
	
//Construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
//Metodos		
	public String getDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		return "Acao concluida";
	}
	
//Gets e Sets
	public int setIdade(int idade) {
		return this.idade = idade;
	}
		
	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}