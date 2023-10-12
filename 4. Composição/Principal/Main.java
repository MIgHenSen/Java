package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Automovel;
import Entidades.Motor;
import Entidades.Pneu;

public class Main {
	public static void main(String[] args) {
		// Declaracao de variaveis de tipo string (conjunto de caracteres)
		String marca = null, marcaPneus = null;
		// Declaracao de variaveis de tipo float, decimais
		float kilometragem = 0, potencia = 0, quantCombustivel = 0, pressaoAr = 0;
		
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Motor motor_1 = new Motor();
		// Objeto criado para chamada de metodos
		Pneu pneu_1 = new Pneu();
		// Objeto criado para chamada de metodos
		Automovel veiculo_1 = new Automovel();
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
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
			System.out.println("Qual a press�o do ar dos pneus: ");
			pressaoAr = lerdados.nextFloat();
			pressaoAr = pneu_1.setPressaoAr(pressaoAr);
				
			System.out.println("Sobre o automevel: ");
			System.out.println(veiculo_1.getDados(marcaPneus, kilometragem));
			System.out.println("Sobre o motor: ");
			System.out.println(motor_1.getDados(potencia, quantCombustivel));
			System.out.println("Sobre os pneus: ");
			System.out.println(pneu_1.getDados());
			
		// Tratamento de excecoes
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas o que for permitido, por favor!");
		}
	}
}