package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.Scanner;
import entidades.Alunos;
import entidades.Pessoa;

public class Main {
	public static void main(String[] args) {
		// Declaracao de variaveis de tipo string(conjunto de caraceteres)
		String nome = null, nomeCurso = null;
		// Declaracao de variaveis de tipo inteiro
		int idade = 0, escolha = 0;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Pessoa pessoa = new Pessoa(nome, idade);
		// Objeto criado para chamada de metodos
		Alunos aluno = new Alunos(nomeCurso, escolha, nomeCurso);
		
		// Menu de opcoes para o usuario
		System.out.println("Quer instanciar: ");
		System.out.println("1 - Outro");
		System.out.println("2 - Um aluno");
		escolha = lerdados.nextInt();
		
		/* Switch/case é uma estrutura de condição que define o código a ser 
		 * executado com base em uma comparação de valores*/
		switch(escolha) {
		case 1:
			System.out.println("Para instanciar alguem: ");
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			nome = pessoa.setNome(nome);
			System.out.println("Digite sua idade: ");
			idade = lerdados.nextInt();
			idade = pessoa.setIdade(idade);
			
			System.out.print(pessoa.getDados());
			break;
		case 2:
			System.out.println("Para instanciar um aluno: ");
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			nome = aluno.setNome(nome);
			System.out.println("Digite sua idade: ");
			idade = lerdados.nextInt();
			idade = aluno.setIdade(idade);
			System.out.println("O que esta cursando: ");
			nomeCurso = lerdados.next();
			nomeCurso = aluno.setNomeCurso(nomeCurso);
			
			System.out.println(aluno.getDados());		
		}
	}
}