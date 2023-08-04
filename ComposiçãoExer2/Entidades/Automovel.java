package Entidades;

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
		
//Gets e Sets
		public String getMarca() {
			return marca;
		}

		public String setMarca(String marca) {
			return this.marca = marca;
		}

		public float getKilometragem() {
			return kilometragem;
		}

		public float setKilometragem(float kilometragem) {
			return this.kilometragem = kilometragem;
		}
	}