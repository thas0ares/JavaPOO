package aula11;

public class Aluno extends Pessoa { // heran�a para diferen�a; classe final, assim n�o pode ser sobre posto 
	private int matricula;
	private String curso;

	public void pagarMensalidade() { //public final void pagarMensalidade() m�todo final, assim n�o pode ser sobre posto
		System.out.println("Pagando mensalidade de aluno " + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
