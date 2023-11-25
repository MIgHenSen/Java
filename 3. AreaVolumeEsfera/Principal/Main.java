package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Esfera;

public class Main {
	public static void main(String[] args){
		Scanner lerdados = new Scanner(System.in);
		Esfera esfera = new Esfera();
		float raio, area, volume;
		int escolha = 0;
		
		do {
			try {
				System.out.println("Qual o raio do circulo: ");
				raio = lerdados.nextFloat();
				area = esfera.getArea(raio);
				volume = esfera.getVolume(raio);
				
				System.out.println("O que deseja saber: ");
				System.out.println("1 - Area do circulo");
				System.out.println("2 - Volume de uma esfera");
				System.out.println("3 - Finalisar Programa");
				escolha = lerdados.nextInt();
				
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
				
			/* InputMismatchException indica que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch(InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 3);
	}
}
