package entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Alunos extends Pessoa{
	private String nomeCurso;
	
	/* Construtor que obriga informacoes para referenciar objeto */
		public Alunos(String nome, int idade, String nomeCurso) {
			super(nome, idade);
			this.nomeCurso = nomeCurso;
		}

	//Metodos
		public String getDados() {
			System.out.println("Nome: "+nome);
			System.out.println("Idade: "+idade);
			System.out.println("Cursos: "+nomeCurso);
			return "Acao concluida";
		}
		
	// Sets
		public String setNomeCurso(String nomeCurso) {
			return this.nomeCurso = nomeCurso;
		}
		
	}