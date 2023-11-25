package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Tarefa {
	private String nome;
	private String descricao;
	private boolean concluida;
	
/* Construtor */
	public Tarefa(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		concluida = concluida;
	}
	
//Metodos - Gets/Sets
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isConcluida() {
		return concluida;
	}
	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
}
