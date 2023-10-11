package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Cilindro {
	private float raio;
	private float altura;
	
/* Construtor */
	public Cilindro() {
		this.raio = raio;
		this.altura = altura;
	}
	
//Metodos
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
}
