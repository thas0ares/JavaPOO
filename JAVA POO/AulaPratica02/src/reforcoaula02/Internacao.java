package reforcoaula02;

public class Internacao {
	String local;
	int totalLeitos;
	int leitoOcupado;
	int leitoVago;

	void status() {
		System.out.println("Qual unidade? " + this.local);
		System.out.println("Quantos leitos no total existem nessa unidade? " + this.totalLeitos);
		System.out.println("Quantos leitos est�o ocupados?  " + this.leitoOcupado);
		System.out.println("Quantos leitos est�o vagos?" + this.leitoVago);
	}

	void internar() {
		if (this.leitoOcupado != 10) {
			System.out.println("UTI com alguns leitos vagos!");
		} else {
			System.out.println("UTI sem leito dispon�vel no momento!");
		}
		System.out.println(" ");
	}

}
