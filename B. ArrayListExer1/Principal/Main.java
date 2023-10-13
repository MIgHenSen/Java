package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.CarrinhoDeCompras;
import Entidades.Produto;

public class Main {
	/* Assim como metodos sao criados em outras classes e apenas chamados
	 * na main atraves dos objetod, pode-se fazer o mesmo na main, separar 
	 * algumas partes do codigo principal e apenas chama-lo mais tarde */
	public static void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Exibir produtos do carrinho");
        System.out.println("4 - Sair");
        System.out.print("\nEscolha uma opção: ");
    } 
	
	public static void main(String[] args) {
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerDados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
	    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	    // Variavel auxiliar
	    int opcao;

	    /* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
	     try {
	    	// Do/while, uma clausula de repeticao
	    	 do {
		            exibirMenu();
		            opcao = lerDados.nextInt();
		            
		            /* Switch/case é uma estrutura de condição que define o código a ser 
					 * executado com base em uma comparação de valores*/
		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do produto: ");
		                    lerDados.nextLine();
		                    String nomeProduto = lerDados.nextLine();
		                    System.out.print("Digite o preço do produto: ");
		                    double precoProduto = lerDados.nextDouble();
		                    System.out.print("Digite a quantidade de produtos: ");
		                    int quantidadeProduto = lerDados.nextInt();
		                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
		                    carrinho.adicionarProduto(produto);
		                    System.out.println("Produto adicionado ao carrinho.");
		                    break;
		                case 2:
		                    System.out.print("Digite o nome do produto a ser removido: ");
		                    lerDados.nextLine();
		                    String nomeRemover = lerDados.nextLine();
		                    carrinho.remover(nomeRemover);
		                    break;
		                case 3:
		                    carrinho.exibirProdutos();
		                    break;
		                case 4:
		                    System.out.println("Saindo do programa...");
		                    break;
		                default:
		                    System.out.println("Opção inválida, digite um valor válido.");
		            }
		        } while (opcao != 4);
	    	 
		        lerDados.close();
		        
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
		    System.out.println("Digite apenas valores permitidos, por favor!");
		}
	}
}