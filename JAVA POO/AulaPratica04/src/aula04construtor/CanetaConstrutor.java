package aula04construtor;

public class CanetaConstrutor {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public CanetaConstrutor() { // coloco o mesmo nome da classe
		this.tampar(); // já está mandando a caneta ficar tampada
		this.cor = "Azul";
	}

	public String getModelo() { // eu não posso retornar void tem que ser String
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA:");
		// System.out.println("Modelo: " + this.modelo);
		System.out.println("Modelo: " + this.getModelo());
		// System.out.println("Ponta: " + this.ponta);
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}