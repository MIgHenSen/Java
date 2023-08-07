package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	protected int id;
	protected ArrayList<Aluno> alunos;
	
//Construtor
	public Turma() {
		this.id = id;
		this.alunos = new ArrayList<>();
	}
	
//Metodos - Gets/Sets
	//Metodos - ArrayList
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		System.out.println("Aluno adicionado!");
	}
	
	public void removerAluno(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos para remover! \n Adicione novos alunos! \n");
		}else {
			for (Aluno a : this.alunos) {
				if (a.getCpf() == cpf) {
					this.alunos.remove(a);
					System.out.println("Aluno removido com sucesso! \n");
					return;
				}
			}
			System.out.println("Aluno nao encontrado! \n");
		}
	}
	
	public void listarAlunos() {
		if (alunos.isEmpty()) {
			System.out.println("Lista vazia! \n Adicione novos alunos! \n");
		} else {
			System.out.println("___________");
			for (Aluno a : alunos) {
				a.exibirInformacoes();
				System.out.println("___________");
				System.out.println("\n");
			}
		}
	}
	
	public void editarAluno(long cpfProcurar, String nome, long cpf, String codTurma, Disciplina disciplina) {
		if (alunos.isEmpty()) {
			System.out.println("Não há alunos para editar \nAdicione novos alunos!\n");
		} else {
			for (Aluno a : this.alunos) {
				if (a.getCpf() == cpfProcurar) {
					a.setNome(nome);
					a.setCpf(cpf);
					a.setCodTurma(codTurma);
					a.setDisciplina(disciplina);
					System.out.printf("Informacoes do aluno(a) %s editadas com sucesso! \n", a.getNome());
					return;
				}
			}
			System.out.println("Aluno nao encontrado! \n");
		}
	}
	
	public void auxiAdicionarNotas(long cpf, Scanner lerDados) {
		double nota = 0;
		int qtdNotas = 0;
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \nAdicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					System.out.printf("Insira a quantidade de notas que serao adicionadas: ");
					qtdNotas = lerDados.nextInt();

					for (int i = 0; i < qtdNotas; i++) {
						System.out.printf("Insira a nota: ");
						nota = lerDados.nextDouble();
						a.adicionarNota(nota);
					}
					a.exibirInformacoes();
				}
			}
		}
	}
	
	public void auxiRemoverNotas(long cpf, int indice) {
		for (Aluno a : alunos) {
			if (a.getCpf() == cpf) {
				a.removerNota(indice);
			}
		}
	}
	
	public void auxiListarNotas(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \nAdicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					a.listarNotas();
				}
			}
		}
	}
	
	public void auxiCalcMedia(long cpf) {
		if (alunos.isEmpty()) {
			System.out.println("Nao ha alunos na lista! \n Adicione novos alunos!");
		} else {
			for (Aluno a : alunos) {
				if (a.getCpf() == cpf) {
					a.calcularMedia();
				}
			}
		}
	}
	
	//Metodos comuns - Gets/Sets
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}