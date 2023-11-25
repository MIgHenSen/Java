package Principal;
import Entidades.Administrador;
import Entidades.Vendedor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String nome = null, rg = null;
		int salario = 0, vendas = 0;
		
		Scanner lerdados = new Scanner(System.in);
		Vendedor vendedor = new Vendedor(nome, rg, salario, vendas);
		Administrador administrador = new Administrador(nome, rg, salario);
		
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
			
		/* InputMismatchException indiga que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores permitidos, por favor!");
		}
	}
}
