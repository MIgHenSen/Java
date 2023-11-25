package entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Pessoa {
	protected String nome;
	protected int idade;
	
/* Construtor */
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
	
// Sets
	public int setIdade(int idade) {
		return this.idade = idade;
	}
		
	public String setNome(String nome) {
		return this.nome = nome;
	}
}
