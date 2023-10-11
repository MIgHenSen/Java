package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Operacoes;

public class Main {
	public static void main(String[] args) {
		// Declaracao de variaveis do tipo float, decimais
		float adicao, subtracao, divisao, multiplicacao, raiz, potencia, number, numero;
		// Variavel auxiliar
		int escolha;
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Operacoes contas = new Operacoes();
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			// Do/while, uma clausula de repeticao
			do {
				// Menu de opcoes para o usuario
				System.out.println("O que quer fazer: ");
				System.out.println("1 - Adicao");
				System.out.println("2 - Subtracao");
				System.out.println("3 - Divisao");
				System.out.println("4 - Multiplicacao");
				System.out.println("5 - Raiz Quadrada");
				System.out.println("6 - Potencia");
				System.out.println("7 - Finalisar programa");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch(escolha) {
				case 1:
					System.out.println("Digite os numeros para somar: ");
					number = lerdados.nextFloat();
					numero = lerdados.nextFloat();
					adicao = contas.getAdicao(number, numero);
					System.out.println("Resultado: " + adicao);
					break;
				case 2:
					System.out.println("Digite os numeros para subtrair: ");
					number = lerdados.nextFloat();
					numero = lerdados.nextFloat();
					subtracao = contas.getSubtracao(number, numero);
					System.out.println("Resultado: " + subtracao);
					break;
				case 3:
					System.out.println("Digite os numeros para dividir: ");
					number = lerdados.nextFloat();
					numero = lerdados.nextFloat();
					divisao = contas.getDivisao(number, numero);
					System.out.println("Resultado: " + divisao);
					break;
				case 4:
					System.out.println("Digite os numeros para multiplicar: ");
					number = lerdados.nextFloat();
					numero = lerdados.nextFloat();
					multiplicacao = contas.getMultiplicacao(number, numero);
					System.out.println("Resultado: " + multiplicacao);
					break;
				case 5:
					System.out.println("Quer a raiz de qual numero: ");
					number = lerdados.nextFloat();
					raiz = contas.getRaiz(number);
					System.out.println("Resultado: " + raiz);
					break;
				case 6:
					System.out.println("Digite a base da potencia: ");
					number = lerdados.nextFloat();
					System.out.println("Digite o expoente:");
					numero = lerdados.nextFloat();
					potencia = contas.getPotencia(number, numero);
					System.out.println("Resultado: " + potencia);
					break;
				case 7:
					System.out.println("Bom trabalho!");
				}
			}while (escolha!=7);
		// Tratamento de excecoes
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores vÃ¡lidos, por favor!");
		}
	}
}