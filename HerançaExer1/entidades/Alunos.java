package entidades;

public class Alunos extends Pessoa{
	private String nomeCurso;
	
	//Construtores
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
		
	//Gets e Sets
		public String getNomeCurso() {
			return nomeCurso;
		}

		public String setNomeCurso(String nomeCurso) {
			return this.nomeCurso = nomeCurso;
		}
		
	}