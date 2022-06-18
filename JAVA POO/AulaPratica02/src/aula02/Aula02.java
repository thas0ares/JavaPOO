package aula02;

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // criando/ instanciando um objeto c1
		c1.cor = "Azul";// mexendo nos atributos
		c1.ponta = 0.5f;
		c1.tampar();
		c1.status();// chamada ao metodo
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();
	}
}
