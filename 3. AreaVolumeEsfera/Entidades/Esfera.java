package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Esfera {
	private float raio;
	
//Construtor
	public Esfera() {
		raio = raio;
	}
	
//Metodos
	// Uso da biblioteca Math para algumas operacoes
	public float getArea(float raio) {
		float area;
		area = (float) (raio*4*Math.PI);
		return area;
	}
	
	public float getVolume(float raio) {
		float volume;
		volume = (float) ((float) ((4/3)*Math.PI)*Math.pow(raio, 3));
		return volume;
	}
}