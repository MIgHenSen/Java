package Entidades;

public class Esfera {
	private float raio;
	
//Construtor
	public Esfera() {
		raio = raio;
	}
	
//Metodos - Sets/Gets
	//Mais uma vez ressalto o uso da biblioteca Math para algumas operações
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
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
}