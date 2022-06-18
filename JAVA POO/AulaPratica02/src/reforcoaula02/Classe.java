package reforcoaula02;

public class Classe {
	public static void main(String[] args) {
		Internacao u1 = new Internacao();
		u1.local = "UTI 1";
		u1.totalLeitos = 10;
		u1.leitoOcupado = 6;
		u1.leitoVago = 4;
		u1.status();
		u1.internar();

		Internacao u2 = new Internacao();
		u2.local = "UTI 2";
		u2.totalLeitos = 10;
		u2.leitoOcupado = 10;
		u2.leitoVago = 0;
		u2.status();
		u2.internar();
	}
}
