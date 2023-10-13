package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.Scanner;
import Entidades.ListaTarefas;
import Entidades.Tarefa;

public class Main {
	/* Assim como metodos sao criados em outras classes e apenas chamados
	 * na main atraves dos objetod, pode-se fazer o mesmo na main, separar 
	 * algumas partes do codigo principal e apenas chama-lo mais tarde */
	public static void menu(Scanner lerdados, int opcao, ListaTarefas tarefas) {
		/* Switch/case é uma estrutura de condição que define o código a ser 
		 * executado com base em uma comparação de valores*/
		switch(opcao) {
		case 1:
			System.out.println("Nome da tarefa:");
			String nome = lerdados.nextLine();
			System.out.println("Descrição da tarefa:");
			String descricao = lerdados.nextLine();
			Tarefa tarefa = new Tarefa(nome, descricao);
			tarefas.adicionarTarefa(tarefa);
			System.out.println("Tarefa adicionada com sucesso!");
			break;
		case 2:
			System.out.println("---Tarefas---");
			tarefas.listaTarefas();
			System.out.println();
			break;
		case 3:
			System.out.println("Digite o indice da tarefa a ser concluída:");
			int indiceConcluida = lerdados.nextInt();
			lerdados.nextLine();
			tarefas.tarefaConcluida(indiceConcluida-1);
			break;
		case 4:
			System.out.println("Digite o indice da tarefa a ser removida:");
			int indiceRemover = lerdados.nextInt();
			lerdados.nextLine();
			tarefas.removerTarefa(indiceRemover-1);
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção Inválida!!!");	
		}
	}
	
	public static void main(String[] args) {
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		ListaTarefas tarefas = new ListaTarefas();
		// Variavel auxiliar
		int opcao;
		
		// Do/while, uma clausula de repeticao
		do {
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Listar tarefas");
			System.out.println("3 - Marcar tarefa como concluída");
			System.out.println("4 - Remover tarefa");
			System.out.println("0 - Sair");
			
			opcao = lerdados.nextInt();
			lerdados.nextLine();
			menu(lerdados, opcao, tarefas);
		} while(opcao != 0);
	}
}