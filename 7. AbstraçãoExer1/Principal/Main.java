package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Entidades.Aluno;

public class Main {

	public static void main(String[] args){
		// Declaracao de variaveis de tipo inteiro
		int escolha = 0, idade, numIdent, tamanho;
		// Variavel do tipo string (conjunto de caracteres)
		String nome;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Aluno aluno = new Aluno();
		
		// Do/while, uma clausula de repeticao
		do {
			/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
			 * que nao sao totalmente atendidos e geram algum erro */
			try {
				System.out.println("Digite 1 para Aluno");
				System.out.println("Digite 2 para Professor");
				System.out.println("3 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch (escolha) {
				case 1:
					System.out.println("Digite seu nome: ");
					nome = lerdados.next();
					nome = aluno.setNome(nome);
					System.out.println("Digite sua idade: ");
					idade = lerdados.nextInt();
					idade = aluno.setIdade(idade);
					System.out.println("Qual o seu numero de identificacao: ");
					numIdent = lerdados.nextInt();
					numIdent = aluno.setIdentificacao(numIdent);
					
					System.out.println("Quantos materias escolares possui: ");
					//Variavel auxiliar para o tamanho da lista
					tamanho = lerdados.nextInt();
					// Criacao da lista
					String[] lista=new String[tamanho];
					for(int i=0; i<tamanho; i++) {
						// Pedido para informar os valores da lista, digitados pelo usuario
						System.out.printf("Informe as materias[%s]: ",i);
						// Le os valores e os coloca em suas respectivas posicoes na lista
						lista[i]=lerdados.next();
					}
					
					/* Metodo bubble sort, usado para organizar a lista de materias 
					 * em oredem alfabetica */
					List<String> list = Arrays.asList(lista);
					Collections.sort(list);
					System.out.println(list);
					
					System.out.println(aluno.toString(nome, idade));
					break;
				case 2:
					System.out.println("Digite seu nome: ");
					nome = lerdados.next();
					nome = aluno.setNome(nome);
					System.out.println("Digite sua idade: ");
					idade = lerdados.nextInt();
					idade = aluno.setIdade(idade);
					System.out.println("Qual o seu numero de identificacao: ");
					numIdent = lerdados.nextInt();
					numIdent = aluno.setIdentificacao(numIdent);
					
					System.out.println("Quantos materias ensina: ");
					//Variavel auxiliar para o tamanho da lista
					tamanho = lerdados.nextInt();
					// Criacao da lista
					String[] lista1=new String[tamanho];
					for(int i=0; i<tamanho; i++) {
						// Pedido para informar os valores da lista, digitados pelo usuario
						System.out.printf("Informe as materias[%s]: ",i);
						// Le os valores e os coloca em suas respectivas posicoes na lista
						lista1[i]=lerdados.next();
					}
					
					/* Metodo bubble sort, usado para organizar a lista de materias 
					 * em oredem alfabetica */
					System.out.println(aluno.toString(nome, idade));
					List<String> list1 = Arrays.asList(lista1);
					Collections.sort(list1);
					System.out.println(list1);
					break;
				case 3:
					System.out.println("Bom trabalho, ate mais!");
					break;
				default:
					System.out.println("Um teste ou uma brincadeira?");
				}
				
			// Tratamento de excecoes
			/* InputMismatchException indiga que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch(InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 3);
	}
}