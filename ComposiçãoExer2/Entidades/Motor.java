package Entidades;

public class Motor {
	private float quantCombustivel;
	private float potencia;
	
//Construtores
	public Motor() {
		potencia = potencia;
		quantCombustivel = quantCombustivel;
	}
	
//Metodos
	public String getDados(float potencia, float quantCombustivel) {
		System.out.println("Potencia: " +potencia+ "cavalos");
		System.out.println("Qauntidade máxima de combustivel: "+quantCombustivel);
		return "";
	}
		
//Gets e Sets
	public float getQuantCombustivel() {
		return quantCombustivel;
	}

	public float setQuantCombustivel(float quantCombustivel) {
		return this.quantCombustivel = quantCombustivel;
	}

	public float getPotencia() {
		return potencia;
	}

	public float setPotencia(float potencia) {
		return this.potencia = potencia;
	}	
}