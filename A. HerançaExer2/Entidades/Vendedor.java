package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Vendedor extends Funcionario{
	private float vendas;
    
/* Construtor */
    public Vendedor(String nome, String rg, float salario, float vendas) {
        super(rg, rg, vendas);
        this.vendas = vendas;
    }
    
//Metodos
    public void acumularVendas(float valor) {
        vendas = vendas + valor;
    }
    
    @Override
    public float calcularHolerite() {
    	float salarioTotal = super.calcularHolerite();
    	salarioTotal = (float) (salarioTotal + (vendas * 0.05));
        return salarioTotal;
    }
}
