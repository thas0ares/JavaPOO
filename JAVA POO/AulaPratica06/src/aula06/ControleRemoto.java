package aula06;

public class ControleRemoto implements Controlador { // Ligação, implementação onde ele tem que fazer todos os métodos
														// abstratos, é programado automaticamente
	// Atributos todos privados
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// métodos especiais
	public ControleRemoto() {//// construtor
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// métodos getters e setters dos 3 atributos
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) { // em boolean ele coloca isLigado
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// métodos abstratos
	@Override // sobrescrever = eu já tinha método definido que era o abstrato e agora eu
				// estou sobreescrevendo, estou desconsiderando aquela programação eu ainda nã
				// havia sido feita e agora estou sobre-escrevendo ela
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if (this.getLigado()) {
			System.out.println("------- MENU --------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i += 10) {//
				System.out.print("|");
			}
		} else {
			System.out.println("Ligar TV para abrir MENU");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {// só irá aumentar ou desligar volume se TV estiver ligada
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Imposspivel aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() { //
		if (this.getLigado() && !(this.getTocando())) {// se estiver ligado e não tocando
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não consegui pausar");
		}
	}

}
