package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Automovel {
	private String marca;
	private float kilometragem;
	
//Construtor
	public Automovel() {
		marca = marca;
		kilometragem = kilometragem;
	}

//Metodos
		public String getDados(String marca, float kilometragem) {
			System.out.println("Marca: "+marca);
			System.out.println("Quilometragem atual: "+kilometragem);
			return "";
		}
		
// Sets
		public String setMarca(String marca) {
			return this.marca = marca;
		}

		public float setKilometragem(float kilometragem) {
			return this.kilometragem = kilometragem;
		}
	}