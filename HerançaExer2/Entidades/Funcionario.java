package Entidades;

public class Funcionario {
	private String nome;
    private String rg;
    private float salario;
    
//Construtor
    public Funcionario(String nome, String rg, float salario) {
        nome = nome;
        rg = rg;
        salario = salario;
    }

//Metodos
    public float calcularHolerite() {
        return salario;
    }
    
//Gets e Sets
	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public String setRg(String rg) {
		return this.rg = rg;
	}

	public float getSalario() {
		return salario;
	}

	public int setSalario(float salario) {
		return (int) (this.salario = salario);
	}
}