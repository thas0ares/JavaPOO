package aula13;

public class Cachorro extends Animal {
	// sobreposi�o
	@Override
	public void emitirSom() {
		System.out.println("Au, Au, Au!");
	}

	// sobrecarga
	public void reagir(String frase) {
		if (frase == "Toma Comida" || frase == "Ol�") { // (frase.equals("Toma Comida") || frase.equals("Ol�"))
			System.out.println("Abanar e Latir");
		} else
			System.out.println("Rosnar");
	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
	// public void reagir(int x, int y) --> n�o � permitido pq j� tem l� em cima,
	// por�m
	// public void reagir(float x, int y) pode pq altera a ordem, mesmo se eu mudar
	// o tipo do
	// retorno como --> public String reagir(int x, int y)
}
