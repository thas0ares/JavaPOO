package aula08;

import java.util.Random;

public class Luta {
	// Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;

	// Métodos Públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) // categorias iguais
				&& l1 != l2) { // e lutadores diferentes
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovado) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();// criando objeto do tipo random
			int vencedor = aleatorio.nextInt(3); // 0 1 2 gerar 3 resultado da luta -> aletório
			System.out.println("========= RESULTADO DA LUTA =========== ");
			switch (vencedor) {// estrututa escolha
			case 0:// Empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1:// Desafiado vence
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiado.perderLuta();
				break;
			case 2:// Desafiante vence
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiante.perderLuta();
				break;
			}
			System.out.println("========================================");
		} else {
			System.out.println("A luta não pode acontecer!");
		}
	}

	// Métodos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
}
