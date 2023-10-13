package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Administrador extends Funcionario{
	private int horasExtras;
	
/* Construtor que obriga informacoes para referenciar objeto */
	public Administrador(String nome, String rg, float salario) {
		super(nome, rg, salario);
		horasExtras = 0;
	}
	
//Metodos
	/* Override mostra que é uma subescrita de metodo */
	 @Override
	    public float calcularHolerite() {
	        float salarioTotal = super.calcularHolerite();
	        salarioTotal = salarioTotal+  (horasExtras * (getSalario() / 100));
	        return salarioTotal;
	    }
	 
	 public void acumularHorasExtras(int horas) {
	        horasExtras =  horasExtras + horas;
	    }
}