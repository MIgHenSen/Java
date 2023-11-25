package Principal;
import java.util.Scanner;
import entidades.Alunos;
import entidades.Pessoa;

public class Main {
	public static void main(String[] args) {
		String nome = null, nomeCurso = null;
		int idade = 0, escolha = 0;
		Scanner lerdados = new Scanner(System.in);
		Pessoa pessoa = new Pessoa(nome, idade);
		Alunos aluno = new Alunos(nomeCurso, escolha, nomeCurso);
		
		System.out.println("Quer instanciar: ");
		System.out.println("1 - Outro");
		System.out.println("2 - Um aluno");
		escolha = lerdados.nextInt();
		
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
