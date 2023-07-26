package Entidades;

public class Matricula {
	private int dia;
	private int mes;
	private int ano;
	
//Construtor
	public Matricula() {
		dia = dia;
		mes = mes;
		ano = ano;
	}
	
//Metodos - Gets/Sets
	public String getMatricula(int dia, int mes, int ano) {
		return "Data de Matricula: " +dia+ "/" +mes+ "/" +ano;
	}

	public int getDia() {
		return dia;
	}

	public int setDia(int dia) {
		return this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public int setMes(int mes) {
		return this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public int setAno(int ano) {
		return this.ano = ano;
	}
}