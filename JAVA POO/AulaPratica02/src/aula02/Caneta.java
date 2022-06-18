package aula02;

public class Caneta {
	// Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	// M�todos
	void status() {// void = sem retorno
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); // this = autorefer�ncia
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! N�o posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

	void tampar() {
		this.tampada = true;// this � um referencia ao proprio objeto que chamou
	}

	void destampar() {
		this.tampada = false;
	}
}
