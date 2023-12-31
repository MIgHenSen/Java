package Principal;
import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.Endereço;
import Entidades.Pessoa;

public class Main {
	public static void main(String[] args){
		String pais = null, estado = null, city = null, bairro = null, nomeRua = null, nome = null;
		int numCasa = 0, cep = 0, idade = 0, ident = 0;
		
		try {
			Scanner lerdados = new Scanner(System.in);
			Endereço endereco = new Endereço();
			Pessoa pessoa_1 = new Pessoa();
			
			System.out.println("Em que pais mora?");
			pais = lerdados.next();
			pais = endereco.setPais(pais);
			System.out.println("Em qual estado?");
			estado = lerdados.next();
			estado = endereco.setEstado(estado);
			System.out.println("Em qual cidade?");
			city = lerdados.next();
			city = endereco.setCidade(city);
			System.out.println("Em qual bairro?");
			bairro = lerdados.next();
			bairro = endereco.setBairro(bairro);
			System.out.println("Em qual rua?");
			nomeRua = lerdados.next();
			nomeRua = endereco.setNomeRua(nomeRua);
			System.out.println("Qual o numero da casa?");
			numCasa = lerdados.nextInt();
			numCasa = endereco.setNumCasa(numCasa);
			System.out.println("Qual o CEP: ");
			cep = lerdados.nextInt();
			cep = endereco.setCep(cep);
			
			System.out.println("Digite seu nome: ");
			nome = lerdados.next();
			nome = pessoa_1.setNome(nome);
			System.out.println("Qual a sua idade: ");
			idade = lerdados.nextInt();
			idade = (int) pessoa_1.setIdade(idade);
			System.out.println("Identificacao: ");
			ident = lerdados.nextInt();
			ident = (int) pessoa_1.setIdentificacao(ident);
			
			System.out.println(pessoa_1.toString(nome, idade, ident, endereco));
			System.out.println(endereco.toString(pais, estado, nome, bairro, nomeRua, numCasa, cep));
			
		/* InputMismatchException indica que um elemento solicitado nao existe, 
		* ou seja, o usuario digitou algo que nao deveria */
		}catch(InputMismatchException e) {
			System.out.println("Um teste ou uma brincadeira?");
		}
	}
}
