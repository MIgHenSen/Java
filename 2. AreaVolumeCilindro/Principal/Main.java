package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Cilindro;

public class Main {
	public static void main(String[] args) {
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Cilindro cilindro = new Cilindro();
		// Declaracao de variaveis de tipo float, decimais
		float raio, altura, area, volume;
		// Variavel auxiliar
		int escolha = 0;
		
		// Do/while, uma clausula de repeticao
		do {
			/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
			 * que nao sao totalmente atendidos e geram algum erro */
			try {
				System.out.println("Qual o raio do cilindro: ");
				raio = lerdados.nextFloat();
				System.out.println("Qual a altura do cilindro: ");
				altura = lerdados.nextFloat();
				area = cilindro.exibirArea(raio, altura);
				volume = cilindro.exibirVolume(raio, altura);
				
				// Menu de opcoes para o usuario
				System.out.println("O que deseja saber: ");
				System.out.println("1 - Area do cilindro");
				System.out.println("2 - Volume do cilindro");
				System.out.println("3 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch(escolha) {
				case 1:
					System.out.println("Area do cilidro: " + area);
					break;
				case 2:
					System.out.println("Volume do Cilindro: " +volume);
					break;
				case 3:
					System.out.println("Bom trabalho, até mais!");
					break;
				default:
					System.out.println("Um teste ou uma brincadeira?");
				}
				
			// Tratamento de excecoes
			/* InputMismatchException indica que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch(InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 3);
	}
}