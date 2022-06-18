package aula10;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;

	public void receberAumento(float aum) { // que recebe o valor do aumento aqu dentro
		this.salario += aum;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
