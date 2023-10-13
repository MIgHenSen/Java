package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Eletronicos;
import Entidades.Livros;
import Entidades.Vestuario;

public class Main {
	public static void main(String[] args){
		// Declaracao de variaveis de tipo inteiro
		int escolha = 0, codIdent, preco;
		// Declaracao de variavel de tipo float, decimal
		float imposto;
		// Declaracao de variavel de tipo string(conjunto de caracteres)
		String nome;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Livros livro = new Livros();
		// Objeto criado para chamada de metodos
		Eletronicos eletro = new Eletronicos();
		// Objeto criado para chamada de metodos
		Vestuario roup = new Vestuario();
		
		// Do/while, uma clausula de repeticao
		do {
			/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
			 * que nao sao totalmente atendidos e geram algum erro */
			try {
				// Menu de opcoes para o usuario
				System.out.println("O que deseja comprar: ");
				System.out.println("1 - Livros");
				System.out.println("2 - Eletronicos");
				System.out.println("3 - Vestuario");
				System.out.println("4 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch(escolha) {
				case 1:
					System.out.println("Qual o nome do livro: ");
					nome = lerdados.next();
					nome = (String) livro.setNome(nome);
					System.out.println("Codigo de identificacao: ");
					codIdent = lerdados.nextInt();
					codIdent = (int) livro.setIdentificacao(codIdent);
					System.out.println("Qual o preco: ");
					preco = lerdados.nextInt();
					preco = (int) livro.setPreco(preco);
					System.out.println("Qual a taxa de imposto: ");
					imposto = lerdados.nextFloat();
					imposto = (float) livro.setImposto(imposto);
					
					System.out.println(livro.tostring(codIdent, nome, preco, imposto));
					System.out.println(livro.getPreco(preco, imposto));
					break;
				case 2:
					System.out.println("Qual o nome do livro: ");
					nome = lerdados.next();
					nome = (String) eletro.setNome(nome);
					System.out.println("Codigo de identificacao: ");
					codIdent = lerdados.nextInt();
					codIdent = (int) eletro.setIdentificacao(codIdent);
					System.out.println("Qual o preco: ");
					preco = lerdados.nextInt();
					preco = (int) eletro.setPreco(preco);
					System.out.println("Qual a taxa de imposto: ");
					imposto = lerdados.nextFloat();
					imposto = (float) eletro.setImposto(imposto);
					
					System.out.println(eletro.tostring(codIdent, nome, preco, imposto));
					System.out.println(eletro.getPreco(preco, imposto));
					break;
				case 3:
					System.out.println("Qual o nome do livro: ");
					nome = lerdados.next();
					nome = (String) roup.setNome(nome);
					System.out.println("Codigo de identificacao: ");
					codIdent = lerdados.nextInt();
					codIdent = (int) roup.setIdentificacao(codIdent);
					System.out.println("Qual o preco: ");
					preco = lerdados.nextInt();
					preco = (int) roup.setPreco(preco);
					System.out.println("Qual a taxa de imposto: ");
					imposto = lerdados.nextFloat();
					imposto = (float) roup.setImposto(imposto);
					
					System.out.println(roup.tostring(codIdent, nome, preco, imposto));
					System.out.println(roup.getPreco(preco, imposto));
					break;
				case 4:
					System.out.println("Obrigado, Volte Sempre!");
				default:
					System.out.println("Um teste ou uma brincadeira?");
				}
				
			// Tratamento de excecoes
			/* InputMismatchException indiga que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch (InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 4);
	}
}