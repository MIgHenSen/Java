package Principal;

/* Biblioteca (library) é uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import Entidades.Administrador;
import Entidades.Vendedor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// Declaracao de variaveis de tipo string(conjunto de caracteres)
		String nome = null, rg = null;
		// Declaracao de variaveis de tipo inteiro
		int salario = 0, vendas = 0;
		
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Objeto criado para chamada de metodos
		Vendedor vendedor = new Vendedor(nome, rg, salario, vendas);
		// Objeto criado para chamada de metodos
		Administrador administrador = new Administrador(nome, rg, salario);
		
		/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
		 * que nao sao totalmente atendidos e geram algum erro */
		try {
			System.out.println("Digite as informa��es do vendedor: ");
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = vendedor.setNome(nome);
			System.out.println("RG: ");
			rg = lerdados.next();
			rg = vendedor.setRg(rg);;
			System.out.println("Sal�rio Base: ");
			salario = lerdados.nextInt();
			salario = vendedor.setSalario(salario);
			System.out.println("N�mero de vendas: ");
			vendas = lerdados.nextInt();
			vendas = vendedor.setSalario(salario);
			System.out.println("Sal�rio Total: ");
			vendas = lerdados.nextInt();
			vendas = vendedor.setSalario(salario);
			
			System.out.println("Digite as informacoes do administrador: ");
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = administrador.setNome(nome);
			System.out.println("RG: ");
			rg = lerdados.next();
			rg = administrador.setRg(rg);;
			System.out.println("Salario Base: ");
			salario = lerdados.nextInt();
			salario = administrador.setSalario(salario);
			System.out.println("Numero de vendas: ");
			vendas = lerdados.nextInt();
			vendas = administrador.setSalario(salario);
			System.out.println("Salario Total: ");
			vendas = lerdados.nextInt();
			vendas = administrador.setSalario(salario);
			
		// Tratamento de excecoes
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores permitidos, por favor!");
		}
	}
}