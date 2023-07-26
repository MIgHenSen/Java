package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Matricula;
import Entidades.Aluno;
import Entidades.Turma;

public class Main {

	public static void main(String[] args) throws InputMismatchException{
		int dia = 0, mes = 0, ano = 0, idade = 0;
		String nome = null, disciplina = null, prof = null;
		Scanner lerdados = new Scanner(System.in);
		Matricula mat_1 = new Matricula();
		Aluno aluno_1 = new Aluno();
		Turma t_1 = new Turma();
		
		try {
			System.out.println("Digite o dia, o mes e o ano da matricula: : ");
			dia = lerdados.nextInt();
			dia = mat_1.setDia(dia);;
			mes = lerdados.nextInt();
			mes = mat_1.setMes(mes);
			ano = lerdados.nextInt();
			ano = mat_1.setAno(ano);
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = aluno_1.setNome(nome);
			System.out.println("Idade: ");
			idade = lerdados.nextInt();
			idade = aluno_1.setIdade(idade);
			System.out.println("Qual a disciplina quer verificar: ");
			disciplina = lerdados.next();
			disciplina = t_1.setDisciplina(disciplina);
			System.out.println("Nome do professor: ");
			prof = lerdados.next();
			prof = t_1.setProfessor(prof);
			
			System.out.println("Dados: ");
			System.out.println(t_1.toString(disciplina, prof));
			System.out.println(aluno_1.toString(nome, idade) + mat_1.getMatricula(dia, mes, ano));
		}catch(InputMismatchException e) {
			System.out.println("Um teste ou uma brincadeira?");
		}
	}
}