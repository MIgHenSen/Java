package Principal;
import java.util.Scanner;
import Entidades.ListaTarefas;
import Entidades.Tarefa;

public class Main {
	public static void menu(Scanner lerdados, int opcao, ListaTarefas tarefas) {
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
		Scanner lerdados = new Scanner(System.in);
		ListaTarefas tarefas = new ListaTarefas();
		int opcao;
		
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
