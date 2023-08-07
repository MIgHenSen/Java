package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Professor;
import Entidades.Turma;

public class Main {
	public static void adicionarNota(Aluno aluno, Scanner lerDados) {
		System.out.printf("Insira a quantidade de notas: ");
		int qtdNotas = lerDados.nextInt();

		for (int i = 0; i < qtdNotas; i++) {
			System.out.printf("Insira a nota: ");
			aluno.adicionarNota(lerDados.nextDouble());
		}
		System.out.println("Notas adicionadas com sucesso!");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner lerDados = new Scanner(System.in);
		Disciplina disciplina = null;
		Turma turma = new Turma();

		int menu = -1;
		long cpf = 0;

			while (menu != 0) {

				System.out.println();
				System.out.println("--- MENU PRINCIPAL ---");
				System.out.println("1 - Adicionar Aluno");
				System.out.println("2 - Remover Aluno");
				System.out.println("3 - Listar alunos da turma");
				System.out.println("4 - Editar informacoes de aluno");
				System.out.println("5 - Adicionar Professor");
				System.out.println("6 - Turma");
				System.out.println("7 - Menu de Notas");
				System.out.println("0 - Sair\n");
				System.out.printf("Selecione uma das opcoes: ");

				menu = lerDados.nextInt();

				switch (menu) {

				case 0:
					System.out.println("Saindo...");
					break;

				case 1:
					lerDados.nextLine();
					System.out.println("--- Adicionar Aluno ---");

					System.out.printf("Insira o nome do aluno: ");
					String nome = lerDados.next();

					System.out.printf("Insira o CPF do aluno: ");
					cpf = lerDados.nextLong();

					System.out.printf("Insira o codigo de turma do aluno: ");
					String codTurma = lerDados.next();

					int menuDisciplinas;

					do {
						System.out.println("1 - FPOO");
						System.out.println("2 - REDES");
						System.out.println("3 - SO");
						System.out.println("4 - LM");
						System.out.printf("Selecione uma das disciplinas: ");
						
						menuDisciplinas = lerDados.nextInt();
						switch (menuDisciplinas) {
						case 1:
							disciplina = Disciplina.FPOO;
							break;

						case 2:
							disciplina = Disciplina.REDES;
							break;

						case 3:
							disciplina = Disciplina.SO;
							break;
							
						case 4:
							disciplina = Disciplina.LM;
							break;
							
						default:
							System.out.println("\nDigite uma opcao valida!\n");
						}
					} while ((menuDisciplinas != 1) && (menuDisciplinas != 2) && (menuDisciplinas != 3) && (menuDisciplinas != 4));
			
					Aluno aluno = new Aluno(nome, cpf, codTurma, disciplina);
					turma.adicionarAluno(aluno);
					adicionarNota(aluno, lerDados);
					aluno.exibirInformacoes();
					break;

				case 2:
					System.out.println("--- Remover aluno ---");
					System.out.printf("Insira o CPF do aluno: ");
					cpf = lerDados.nextLong();
					turma.removerAluno(cpf);

					break;

				case 3:
					System.out.println("--- Lista de alunos ---");
					turma.listarAlunos();

					break;

				case 4:
					System.out.println("--- Editar Informacoes de aluno ---");

					System.out.printf("Insira o CPF do aluno para encontrarmos: ");
					long cpfProcurar = lerDados.nextLong();

					System.out.println("Agora vamos inserir as novas informacoes!");

					System.out.printf("Insira o nome do aluno: ");
					nome = lerDados.next();

					
					System.out.printf("Insira o CPF do aluno: ");
					cpf = lerDados.nextLong();

					System.out.printf("Insira o codigo de turma do aluno: ");
					codTurma = lerDados.next();

					do {
						System.out.println("1 - FPOO");
						System.out.println("2 - REDES");
						System.out.println("3 - SO");
						System.out.println("4 - LM");
						System.out.printf("Selecione uma das disciplinas: ");
						menuDisciplinas = lerDados.nextInt();
						switch (menuDisciplinas) {
						case 1:
							disciplina = Disciplina.FPOO;
							break;

						case 2:
							disciplina = Disciplina.REDES;
							break;

						case 3:
							disciplina = Disciplina.SO;
							break;

						case 4:
							disciplina = Disciplina.LM;
							break;
							
							default:
								System.out.println("\nDigite uma opcao valida!\n");
						}
					} while ((menuDisciplinas != 1) && (menuDisciplinas != 2) && (menuDisciplinas != 3)
							&& (menuDisciplinas != 4));

					turma.editarAluno(cpfProcurar, nome, cpf, codTurma, disciplina);
					break;

				case 5:
					System.out.println("--- Professor ---");
					System.out.printf("Insira o nome do Professor: ");
					nome = lerDados.next();

					System.out.printf("Insira o CPF do Professor: ");
					cpf = lerDados.nextLong();

					System.out.printf("Insira a especialidade do Professor: ");
					String especialidade = lerDados.next();

					System.out.printf("Insira o periodo do Professor: ");
					String periodo = lerDados.next();
					System.out.println();

					do {
						System.out.println("1 - FPOO");
						System.out.println("2 - REDES");
						System.out.println("3 - SO");
						System.out.println("4 - LM");
						System.out.printf("Selecione a disciplina desse Professor: ");
						menuDisciplinas = lerDados.nextInt();
						switch (menuDisciplinas) {
						case 1:
							disciplina = Disciplina.FPOO;
							break;

						case 2:
							disciplina = Disciplina.REDES;
							break;

						case 3:
							disciplina = Disciplina.SO;
							break;

						case 4:
							disciplina = Disciplina.LM;
							break;
							
							default:
								System.out.println("\nDigite uma opcao valida!\n");
						}
					} while ((menuDisciplinas != 1) && (menuDisciplinas != 2) && (menuDisciplinas != 3)
							&& (menuDisciplinas != 4));
					
					Professor professor = new Professor(nome, cpf, especialidade, periodo, disciplina);
					professor.exibirInformacoes();

					break;

				case 6:
					System.out.println("--- Turma ---");
					System.out.printf("Insira o id da Turma: ");
					int id = lerDados.nextInt();

					turma.setId(id);

					System.out.println("Turma: ");
					System.out.println("ID: " + turma.getId());
					break;

				case 7:

					int menuNotas = 0;

					do {
						System.out.println();
						System.out.println("--- MENU DE NOTAS ---");
						System.out.println("1 - Adicionar nota");
						System.out.println("2 - Remover nota");
						System.out.println("3 - Lista de notas");
						System.out.println("4 - Calcular Media");
						System.out.println("5 - Voltar para o menu principal\n");
						System.out.printf("Selecione uma das opcoes: ");

						menuNotas = lerDados.nextInt();

						switch (menuNotas) {
						case 1:
							System.out.printf("Insira o CPF do aluno para encontrarmos: ");
							cpf = lerDados.nextLong();

							turma.auxiAdicionarNotas(cpf, lerDados);
							break;

						case 2:
							System.out.println("--- Remover Nota ---");
							System.out.printf("Insira o CPF do aluno para encontrarmos: ");
							cpf = lerDados.nextLong();

							turma.auxiListarNotas(cpf);

							System.out.printf("Insira o indice da nota a ser retirada: ");
							int indice = lerDados.nextInt();

							turma.auxiRemoverNotas(cpf, indice);
							break;

						case 3:
							System.out.println("--- Lista de Notas ---");
							System.out.printf("Insira o CPF do aluno para encontrarmos: ");
							cpf = lerDados.nextLong();

							turma.auxiListarNotas(cpf);
							break;

						case 4:
							System.out.println("--- Calcular Media ---");
							System.out.printf("Insira o CPF do aluno para encontrarmos: ");
							cpf = lerDados.nextLong();

							turma.auxiCalcMedia(cpf);
							break;

						case 5:
							System.out.println("Voltando...");
							break;
						}

					} while (menuNotas != 5);
				}
			}
	}
}