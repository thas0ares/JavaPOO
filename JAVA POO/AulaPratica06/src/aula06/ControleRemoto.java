package aula06;

public class ControleRemoto implements Controlador { // Liga��o, implementa��o onde ele tem que fazer todos os m�todos
														// abstratos, � programado automaticamente
	// Atributos todos privados
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// m�todos especiais
	public ControleRemoto() {//// construtor
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	// m�todos getters e setters dos 3 atributos
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

	// m�todos abstratos
	@Override // sobrescrever = eu j� tinha m�todo definido que era o abstrato e agora eu
				// estou sobreescrevendo, estou desconsiderando aquela programa��o eu ainda n�
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
			System.out.println("Est� ligado? " + this.getLigado());
			System.out.println("Est� tocando? " + this.getTocando());
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
	public void maisVolume() {// s� ir� aumentar ou desligar volume se TV estiver ligada
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
			System.out.println("Imposs�vel diminuir volume");
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
		if (this.getLigado() && !(this.getTocando())) {// se estiver ligado e n�o tocando
			this.setTocando(true);
		} else {
			System.out.println("N�o consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("N�o consegui pausar");
		}
	}

}
