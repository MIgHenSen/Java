package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Colaborador;
import Entidades.Departamento;

public class Main {
	public static void main(String[] args){
		// Declaracao de variaveis de tipo string (conjunto de caracteres)
		String nomeC = null, funcao = null, dept = null, sigident = null;
		// Declaracao de variaveis de tipo inteiro
		int idade = 0, identificacao = 0, numColab = 0;
		
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Colaborador colab_1 = new Colaborador();
		// Objeto criado para chamada de metodos
		Departamento dept_1 = new Departamento();
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
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
			
		// Tratamento de excecoes
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch (InputMismatchException e) {
			System.out.println("Um teste ou uma brincadeira?");
		}
	}
}