package Entidades;

public class Cilindro {
	private float raio;
	private float altura;
	
//Construtor
	public Cilindro() {
		this.raio = raio;
		this.altura = altura;
	}
	
//Metodos - Gets/Sets
	//Em java, para alguns cálculos, usamos a biblioteca Math 
	public float exibirArea(float raio, float altura) {
		float area;
		area = (float) (raio*Math.PI*2)*(raio+altura);
		return area;
	}
	
	public float exibirVolume(float raio, float altura) {
		float volume;
		volume = (float) (altura*Math.PI*Math.pow(raio,3));
		return volume;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}