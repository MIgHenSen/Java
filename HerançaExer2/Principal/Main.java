package Principal;

import Entidades.Administrador;
import Entidades.Vendedor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InputMismatchException {
		String nome = null, rg = null;
		int salario = 0, vendas = 0;
		
		Scanner lerdados = new Scanner(System.in);
		Vendedor vendedor = new Vendedor(nome, rg, salario, vendas);
		Administrador administrador = new Administrador(nome, rg, salario);
		
		try {
			System.out.println("Digite as informações do vendedor: ");
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = vendedor.setNome(nome);
			System.out.println("RG: ");
			rg = lerdados.next();
			rg = vendedor.setRg(rg);;
			System.out.println("Salário Base: ");
			salario = lerdados.nextInt();
			salario = vendedor.setSalario(salario);
			System.out.println("Número de vendas: ");
			vendas = lerdados.nextInt();
			vendas = vendedor.setSalario(salario);
			System.out.println("Salário Total: ");
			vendas = lerdados.nextInt();
			vendas = vendedor.setSalario(salario);
			
			System.out.println("Digite as informações do administrador: ");
			System.out.println("Nome: ");
			nome = lerdados.next();
			nome = administrador.setNome(nome);
			System.out.println("RG: ");
			rg = lerdados.next();
			rg = administrador.setRg(rg);;
			System.out.println("Salário Base: ");
			salario = lerdados.nextInt();
			salario = administrador.setSalario(salario);
			System.out.println("Número de vendas: ");
			vendas = lerdados.nextInt();
			vendas = administrador.setSalario(salario);
			System.out.println("Salário Total: ");
			vendas = lerdados.nextInt();
			vendas = administrador.setSalario(salario);
		}catch(InputMismatchException e) {
			System.out.println("Digite apenas valores permitidos, por favor!");
		}
	}
}