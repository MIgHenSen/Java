package Entidades;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.ArrayList;

/* Um ArrayList e uma claase generica para colecoes, podendo guardar
 * colecoes de quaisquer tipo de dados */
public class ListaTarefas {
	private ArrayList<Tarefa> listaTarefas;
	
//Construtor
	public ListaTarefas() {
		listaTarefas = new ArrayList<>();
	}
	
//Metodos
	public void adicionarTarefa(Tarefa tarefa) {
		/* add e o metodo de ArrayList que adiciona 
		 * objetos a colecao */ 
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
			/* remove e o metodo de ArrayList que deleta 
			 * objetos da colecao */
			Tarefa tarefa = listaTarefas.remove(indice);
			System.out.println("Tarefa" + tarefa.getNome() + "removida!");
		} else {
			System.out.println("Índice Inválido");
		}
	}
	
	public void listaTarefas() {
		/* isEmpty e um metodo de ArrayList que verifica se a 
		 * lista esta vazia */
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