package aula02;

public class Caneta {
	// Atributos
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	// Métodos
	void status() {// void = sem retorno
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor); // this = autoreferência
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Erro! Não posso rabiscar!");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}

	void tampar() {
		this.tampada = true;// this é um referencia ao proprio objeto que chamou
	}

	void destampar() {
		this.tampada = false;
	}
}
