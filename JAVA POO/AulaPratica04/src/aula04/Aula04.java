package aula04;

public class Aula04 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("BIC");
		// c1.modelo = "bic"; -> acessando diretamente o atributo não dá erro pq público
		c1.setPonta(0.5f);
		// c1.Ponta(0.5f); -> acessando diretamente o porém da erro pq é privado
		// c1.status();

		System.out.println("Tenho um caneta " + c1.modelo + " de ponta " + c1.getPonta());
		// eu tive acesso ao modelo através do atributo pq o mesmo está privado, porém o
		// atributo ponta eu tive que pasa pelo método pois ponta é um atributo privado
		// logo acessando o método getPonta que é publico é possível ter esse acesso com
		// segurança
	}
}
