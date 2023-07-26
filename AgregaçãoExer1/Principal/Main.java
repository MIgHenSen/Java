package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Colaborador;
import Entidades.Departamento;

public class Main {

	public static void main(String[] args) throws InputMismatchException{
		String nomeC = null, funcao = null, dept = null, sigident = null;
		int idade = 0, identificacao = 0, numColab = 0;
		Scanner lerdados = new Scanner(System.in);
		Colaborador colab_1 = new Colaborador();
		Departamento dept_1 = new Departamento();
		
		try {
			System.out.println("Qual o nome do colborador: ");
			nomeC = lerdados.next();
			nomeC = colab_1.setNome(nomeC);
			System.out.println("Qual a sua idade: ");
			idade = lerdados.nextInt();
			idade = colab_1.setIdade(idade);
			System.out.println("Qual a sua funcao: ");
			funcao = lerdados.next();
			funcao = colab_1.setCargo(funcao);
			System.out.println("Qual o codigo de identificacao: ");
			identificacao = lerdados.nextInt();
			identificacao = colab_1.setIdentificacao(identificacao);
			
			System.out.println("Digite o nome do departamento: ");
			dept = lerdados.next();
			dept = dept_1.setNome(dept);
			System.out.println("Sigla de identificacao do departamneto: ");
			sigident = lerdados.next();
			sigident = dept_1.setSiglaIdent(sigident);
			System.out.println("Numero de colaboradores: ");
			numColab = lerdados.nextInt();
			numColab = dept_1.setNumColab(numColab);
			
			System.out.println(dept_1.setSiglaIdent(sigident));
		}catch (InputMismatchException e) {
			System.out.println("Um teste ou uma brincadeira?");
		}
	}
}