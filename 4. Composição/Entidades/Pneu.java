package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Pneu {
	private String marca;
	private float pressaoAr;
	
//Construtor
	public Pneu() {
		marca = marca;
		pressaoAr = pressaoAr;
	}

//Metodos
	public String getDados() {
		System.out.println("Marca: "+marca);
		System.out.println("Press�o: "+pressaoAr);
		return "";
	}
		
// Sets
	public String setMarca(String marca) {
		return this.marca = marca;
	}

	public float setPressaoAr(float pressaoAr) {
		return this.pressaoAr = pressaoAr;
	}
}