package aula04;

public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("BIC");
		// c1.modelo = "bic"; -> acessando diretamente o atributo n�o d� erro pq p�blico
		c1.setPonta(0.5f);
		// c1.Ponta(0.5f); -> acessando diretamente o por�m da erro pq � privado
		// c1.status();

		System.out.println("Tenho um caneta " + c1.modelo + " de ponta " + c1.getPonta());
		// eu tive acesso ao modelo atrav�s do atributo pq o mesmo est� privado, por�m o
		// atributo ponta eu tive que pasa pelo m�todo pois ponta � um atributo privado
		// logo acessando o m�todo getPonta que � publico � poss�vel ter esse acesso com
		// seguran�a
	}
}
