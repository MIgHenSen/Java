package Entidades;
import java.util.ArrayList;

public class ListaTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
//Construtor
	public ListaTarefas() {
		listaTarefas = new ArrayList<>();
	}
	
//Metodos
	public void adicionarTarefa(Tarefa tarefa) {
		listaTarefas.add(tarefa);
	}
	
	public void tarefaConcluida(int indice) {
		if ((indice >= 0) && (indice < listaTarefas.size())) {
			Tarefa tarefa = listaTarefas.get(indice);
			tarefa.setConcluida(true);
			System.out.println("Tarefa" + tarefa.getNome() + "concluída!");
		} else {
			System.out.println("Índice Inválido!!!");
		}
	}
	
	public void removerTarefa(int indice) {
		if ((indice >= 0) && (indice < listaTarefas.size() )) {
			Tarefa tarefa = listaTarefas.remove(indice);
			System.out.println("Tarefa" + tarefa.getNome() + "removida!");
		} else {
			System.out.println("Índice Inválido");
		}
	}
	
	public void listaTarefas() {
		if (listaTarefas.isEmpty()) {
			System.out.println("Não há tarefas!");
		} else {
			for (int i = 0; i < listaTarefas.size(); i++) {
				Tarefa tarefa = listaTarefas.get(i);
				System.out.println((i+1) + "." + tarefa.getNome() + "-" + tarefa.getDescricao() + "- Concluída:" + tarefa.isConcluida());
			}
		}
	}
}
