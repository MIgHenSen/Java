package Entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa{
	private String codTurma;
	private Disciplina disciplina;
	private ArrayList<Double> listaNotas;
	
//Construtor
	public Aluno(String nome, long cpf, String codTurma, Disciplina disciplina) {
		super(nome, cpf);
		this.codTurma = codTurma;
		this.disciplina = disciplina;
		this.listaNotas = new ArrayList<>();
	}

//Metodos - Gets/Sets
	//Metodos ArrayList
	public void adicionarNota(double nota) {
		listaNotas.add(nota);
	}
	
	public void removerNota(int indice) {
		if (listaNotas.isEmpty()) {
			System.out.println("\n Lista vazia! \n");
		}else if ((indice < 0) && (indice >= listaNotas.size())) {
			System.out.println("\n Valor invalido! \n");
		}else {
			listaNotas.remove(indice - 1);
			System.out.printf("\n%dº Nota removida com sucesso! \n", indice);
		}
	}
	
	public void listarNotas() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("Disciplina: " + getDisciplina());

		for (int i = 0; i < listaNotas.size(); i++) {
			System.out.printf("%dº Nota: %.2f \n", i + 1, listaNotas.get(i));
		}
	}
	
	public void calcularMedia() {
		if (listaNotas.isEmpty()) {
			System.out.println("\nLista vazia!\n");
		} else {
			double soma = 0;

			for (Double nota : listaNotas) {
				soma = soma + nota;
			}
			System.out.println("___________");
			System.out.printf("\n Nome: %s\n", this.nome);
			
			System.out.println("Disciplina: " +disciplina);

			System.out.printf("\n Nota Total: %.2f\n", soma);

			System.out.printf("Quantidade de notas: %d\n", listaNotas.size());

			double media = soma / listaNotas.size();

			System.out.printf("Media: %.2f", media);
			if (media >= 6) {
				System.out.println("\n Aluno aprovado! \n");
			} else {
				System.out.println("\n Aluno reprovado! \n");
			}
			System.out.println("___________");
		}
	}
	
	//Metodos comuns + Gets/Sets
	@Override
	public void exibirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Codigo: " + this.codTurma);
		System.out.println("Disciplina: " + this.disciplina);

		for (int i = 0; i < listaNotas.size(); i++) {
			System.out.printf("%dº Nota: %.2f \n", i + 1, listaNotas.get(i));
		}
	}
	
	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	public void setCodTurma(String codTurma) {
		this.codTurma = codTurma;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}