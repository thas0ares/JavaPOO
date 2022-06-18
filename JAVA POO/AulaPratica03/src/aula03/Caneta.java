package aula03;

public class Caneta {
	// adicionando a visibilidade aos atributos (public, private, protected)
	public String modelo; // ad
	public String cor;
	private float ponta;
	protected int carga;
	//protected boolean tampada;
	private boolean tampada;

	// adicionando a visibilidade aos m�todos (public, private, protected)
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}

	public void rabiscar() { // quando private -> eu n�o posso rabiscar a n�o ser dentro da classe
		if (this.tampada == true) {
			System.out.println("Erro! N�o posso rabiscar!");
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