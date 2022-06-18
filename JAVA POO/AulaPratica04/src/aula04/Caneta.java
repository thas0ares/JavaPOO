package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	
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
	public void status() {
		System.out.println("SOBRE A CANETA:");
		//System.out.println("Modelo: " + this.modelo);
		System.out.println("Modelo: " + this.getModelo());
		//System.out.println("Ponta: " + this.ponta);
		System.out.println("Ponta: " + this.getPonta());
	}
}
