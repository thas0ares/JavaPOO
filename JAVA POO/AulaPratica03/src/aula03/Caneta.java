package aula03;

public class Caneta {
	// adicionando a visibilidade aos atributos (public, private, protected)
	public String modelo; // ad
	public String cor;
	private float ponta;
	protected int carga;
	//protected boolean tampada;
	private boolean tampada;

	// adicionando a visibilidade aos métodos (public, private, protected)
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void rabiscar() { // quando private -> eu não posso rabiscar a não ser dentro da classe
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

//	protected void tampar() { 
//		this.tampada = true;
//	}
//
//	protected void destampar() {
//		this.tampada = false;
//	}
	public void tampar() { 
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}