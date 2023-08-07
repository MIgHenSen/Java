package Entidades;

public enum Disciplina {
	 FPOO("Fundamentos de Programacao Orientada a Objetos"),
	 REDES("Redes de Computadores"),
	 SO("Sistemas Operacionais"),
	 LM("Linguagem de Marcacao");
	 private String descricao;

//Construtor
	    private Disciplina(String descricao) {
	        this.descricao = descricao;
	    }

//Metodos
	    public String getDescricao() {
	        return descricao;
	    }
}