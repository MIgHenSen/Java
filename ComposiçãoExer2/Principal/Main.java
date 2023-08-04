package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Automovel;
import Entidades.Motor;
import Entidades.Pneu;

public class Main {
	public static void main(String[] args) throws InputMismatchException{
		String marca = null, marcaPneus = null;
		float kilometragem = 0, potencia = 0, quantCombustivel = 0, pressaoAr = 0;
		
		Scanner lerdados = new Scanner(System.in);
		Motor motor_1 = new Motor();
		Pneu pneu_1 = new Pneu();
		Automovel veiculo_1 = new Automovel();
		
		try {
			System.out.println("Digite a marca do veiculo: ");
			marca = lerdados.next();
			marca = veiculo_1.setMarca(marca);
			System.out.println("Digite a kilometragem atual do veiculo: ");
			kilometragem = lerdados.nextFloat();
			kilometragem = veiculo_1.setKilometragem(kilometragem);
			System.out.println("Digite a potencia do motor: ");
			potencia = lerdados.nextFloat();
			potencia = motor_1.setPotencia(potencia);
			System.out.println("Quanto de combustivel esse motor pode ter: ");
			quantCombustivel = lerdados.nextFloat();
			quantCombustivel = motor_1.setQuantCombustivel(quantCombustivel);
			System.out.println("Qual amarca dos pneus: ");
			marcaPneus = lerdados.next();
			marcaPneus = pneu_1.setMarca(marcaPneus);
			System.out.println("Qual a pressão do ar dos pneus: ");
			pressaoAr = lerdados.nextFloat();
			pressaoAr = pneu_1.setPressaoAr(pressaoAr);
				
			System.out.println("Sobre o automevel: ");
			System.out.println(veiculo_1.getDados(marcaPneus, kilometragem));
			System.out.println("Sobre o motor: ");
			System.out.println(motor_1.getDados(potencia, quantCombustivel));
			System.out.println("Sobre os pneus: ");
			System.out.println(pneu_1.getDados());
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas o que for permitido, por favor!");
		}
	}
}