package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Eletronicos;
import Entidades.Livros;
import Entidades.Vestuario;

public class Main {
	public static void main(String[] args){
		int escolha = 0, codIdent, preco;
		float imposto;
		String nome;
		Scanner lerdados = new Scanner(System.in);
		Livros livro = new Livros();
		Eletronicos eletro = new Eletronicos();
		Vestuario roup = new Vestuario();
		
		do {
			try {
				System.out.println("O que deseja comprar: ");
				System.out.println("1 - Livros");
				System.out.println("2 - Eletronicos");
				System.out.println("3 - Vestuario");
				System.out.println("4 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
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
				
			/* InputMismatchException indiga que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch (InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 4);
	}
}
