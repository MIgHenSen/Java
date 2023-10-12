package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Motor {
	private float quantCombustivel;
	private float potencia;
	
//Construtor
	public Motor() {
		potencia = potencia;
		quantCombustivel = quantCombustivel;
	}
	
//Metodos
	public String getDados(float potencia, float quantCombustivel) {
		System.out.println("Potencia: " +potencia+ "cavalos");
		System.out.println("Qauntidade m�xima de combustivel: "+quantCombustivel);
		return "";
	}
		
// Sets
	public float setQuantCombustivel(float quantCombustivel) {
		return this.quantCombustivel = quantCombustivel;
	}

	public float setPotencia(float potencia) {
		return this.potencia = potencia;
	}	
}