package Entidades;

public class Pneu {
	private String marca;
	private float pressaoAr;
	
//Construtores
	public Pneu() {
		marca = marca;
		pressaoAr = pressaoAr;
	}

//Metodos
	public String getDados() {
		System.out.println("Marca: "+marca);
		System.out.println("Pressão: "+pressaoAr);
		return "";
	}
		
//Gets e Sets
	public String getMarca() {
		return marca;
	}

	public String setMarca(String marca) {
		return this.marca = marca;
	}

	public float getPressaoAr() {
		return pressaoAr;
	}

	public float setPressaoAr(float pressaoAr) {
		return this.pressaoAr = pressaoAr;
	}
}