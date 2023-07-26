package Principal;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Entidades.Aluno;

public class Main {

	public static void main(String[] args) throws InputMismatchException{
		int escolha = 0, idade, numIdent, tamanho;
		String nome;
		Scanner lerdados = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		do {
			try {
				System.out.println("Digite 1 para Aluno");
				System.out.println("Digite 2 para Professor");
				System.out.println("3 - Finalizar Programa");
				escolha = lerdados.nextInt();
				
				switch (escolha) {
				case 1:
					System.out.println("Digite seu nome: ");
					nome = lerdados.next();
					nome = aluno.setNome(nome);
					System.out.println("Digite sua idade: ");
					idade = lerdados.nextInt();
					idade = aluno.setIdade(idade);
					System.out.println("Qual o seu numero de identificacao: ");
					numIdent = lerdados.nextInt();
					numIdent = aluno.setIdentificacao(numIdent);
					
					System.out.println("Quantos materias escolares possui: ");
					tamanho = lerdados.nextInt();
					String[] lista=new String[tamanho];
					for(int i=0; i<tamanho; i++) {
						System.out.printf("Informe as materias[%s]: ",i);
						lista[i]=lerdados.next();
					}
					
					List<String> list = Arrays.asList(lista);
					Collections.sort(list);
					System.out.println(list);
					
					System.out.println(aluno.toString(nome, idade));
					break;
				case 2:
					System.out.println("Digite seu nome: ");
					nome = lerdados.next();
					nome = aluno.setNome(nome);
					System.out.println("Digite sua idade: ");
					idade = lerdados.nextInt();
					idade = aluno.setIdade(idade);
					System.out.println("Qual o seu numero de identificacao: ");
					numIdent = lerdados.nextInt();
					numIdent = aluno.setIdentificacao(numIdent);
					
					System.out.println("Quantos materias ensina: ");
					tamanho = lerdados.nextInt();
					String[] lista1=new String[tamanho];
					for(int i=0; i<tamanho; i++) {
						System.out.printf("Informe as materias[%s]: ",i);
						lista1[i]=lerdados.next();
					}
					
					System.out.println(aluno.toString(nome, idade));
					List<String> list1 = Arrays.asList(lista1);
					Collections.sort(list1);
					System.out.println(list1);
					break;
				case 3:
					System.out.println("Bom trabalho, até mais!");
					break;
				default:
					System.out.println("Um teste ou uma brincadeira?");
				}
			}catch(InputMismatchException e) {
				System.out.println("Um teste ou uma brincadeira?");
			}
		}while(escolha != 3);
	}
}