package aula03;

public class Aula03 {

	public static void main(String[] args) {// dentro do meu metodo main eu posso fazer uso, com tanto que eu esteje
											// usando obejto dessa classe dos metodos e atributos que s�o publicos e
											// protegidos mas n�o dos privados.
		Caneta c1 = new Caneta();
		c1.modelo = "Bic Cristal"; // � um atributo p�blico � permitido alterar.
		c1.cor = "Azul"; // p�blico � permitido alterar.
		// c1.ponta = 0.5f; -> n�o permite alterar a ponta pq ela � uma atributo privado.
		c1.carga = 80; // Dentro da classe Aula03 eu tenho um m�todo main que est� utilizando um objeto
						// c1 que � uma Caneta ent�o ele deixa eu mexer num atributo protegido pq ele
						// esta dentro de uma classe que utiliza uma classe caneta.
		// c1.tampada = false; modifiquei para de protected para privado, d� erro, mas
		// se vc chama um metodo publico d� certo como explicado a baixo.
		c1.tampar();// ou c1.destampar(); -> mesmo o atributo sendo privado quando eu crio o metodo
					// publico que chama esse atributo privado dentro, eu consigo mexer no privado
					// por causa do metodo que � publico.
		c1.status();
		c1.rabiscar();
	}
}
