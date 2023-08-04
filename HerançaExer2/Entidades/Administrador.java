package Entidades;

public class Administrador extends Funcionario{
	private int horasExtras;
	
//Construtor
	public Administrador(String nome, String rg, float salario) {
		super(nome, rg, salario);
		horasExtras = 0;
	}
	
//Metodos
	 @Override
	    public float calcularHolerite() {
	        float salarioTotal = super.calcularHolerite();
	        salarioTotal = salarioTotal+  (horasExtras * (getSalario() / 100));
	        return salarioTotal;
	    }
	 
	 public void acumularHorasExtras(int horas) {
	        horasExtras =  horasExtras + horas;
	    }
	 
//Gets
	 public int getHorasExtras() {
	        return horasExtras;
	    }
}