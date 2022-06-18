package aula04construtor;

public class aula04Construtor1 {
	public static void main(String[] args) {
		CanetaConstrutor1 c1 = new CanetaConstrutor1("Nic", "Amarela", 0.4f);
		c1.status();
		CanetaConstrutor1 c2 = new CanetaConstrutor1("N555", "Azul", 0.3f);
		c2.status();
	}
}
