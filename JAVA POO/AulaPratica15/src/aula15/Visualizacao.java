package aula15;

public class Visualizacao { // agregação eu consegui ligar uma estancia de um objeto com um atributo, tenho
							// o atributo espectador e e o atributo filme e eles são instancias de outra
							// classe.
	private Gafanhoto espectador;
	private Video filme;

	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);// total assistido, quando filmes um
																				// gafanhoto assistiu
		this.filme.setViews(this.filme.getViews() + 1);// tenho tbm a views visualizaçao
	}

	public void avaliar() { // sobrecarga -> 3 metodos com o mesmo nome e assinaturas diferentes na mesma
							// classe
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(float porc) {
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}

}
