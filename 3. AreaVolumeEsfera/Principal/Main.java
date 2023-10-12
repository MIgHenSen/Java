package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Esfera;

public class Main {
	public static void main(String[] args){
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Esfera esfera = new Esfera();
		// Declaracao de variaveis do tipo float, decimais
		float raio, area, volume;
		// Variavel auxiliar
		int escolha = 0;
		
		// Do/while, uma clausula de repeticao
		do {
			/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
			 * que nao sao totalmente atendidos e geram algum erro */
			try {
				System.out.println("Qual o raio do circulo: ");
				raio = lerdados.nextFloat();
				area = esfera.getArea(raio);
				volume = esfera.getVolume(raio);
				
				// Menu de opcoes para o usuario
				System.out.println("O que deseja saber: ");
				System.out.println("1 - Area do circulo");
				System.out.println("2 - Volume de uma esfera");
				System.out.println("3 - Finalisar Programa");
				escolha = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
				switch(escolha) {
				case 1:
					System.out.println("Area do circulo: " + area);
					break;
				case 2:
					System.out.println("Volume da esfera: " + volume);
					break;
				case 3:
					System.out.println("Bom trabalho!");
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