package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Cilindro;

public class Main {
	public static void main(String[] args) {
		Scanner lerdados = new Scanner(System.in);
		Cilindro cilindro = new Cilindro();
		float raio, altura, area, volume;
		int escolha = 0;
		
		do {
			try {
				System.out.println("Qual o raio do cilindro: ");
				raio = lerdados.nextFloat();
				System.out.println("Qual a altura do cilindro: ");
				altura = lerdados.nextFloat();
				area = cilindro.exibirArea(raio, altura);
				volume = cilindro.exibirVolume(raio, altura);
				
				System.out.println("O que deseja saber: ");
				System.out.println("1 - Area do cilindro");
				System.out.println("2 - Volume do cilindro");
				System.out.println("3 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
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
				
			/* InputMismatchException indica que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch(InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 3);
	}
}
