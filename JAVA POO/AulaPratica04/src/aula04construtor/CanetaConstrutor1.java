package aula04construtor;

public class CanetaConstrutor1 {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

//	ATALHO Alt+Shift+S para mostrar automaticamente os métodos acessórios, modificadores e construtores
//	public CanetaConstrutor1(String modelo, float ponta, String cor) {
//		super();
//		this.modelo = modelo;
//		this.ponta = ponta;
//		this.cor = cor;
//	}
//	
//	public String getModelo() {
//		return modelo;
//	}
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//	public float getPonta() {
//		return ponta;
//	}
//	public void setPonta(float ponta) {
//		this.ponta = ponta;
//	}
//	public String getCor() {
//		return cor;
//	}
//	public void setCor(String cor) {
//		this.cor = cor;
//	}
//	public boolean isTampada() {
//		return tampada;
//	}
//	public void setTampada(boolean tampada) {
//		this.tampada = tampada;
//	}

	public CanetaConstrutor1(String m, String c, float p) { // coloco 3 parâmetors
		this.modelo = m;
		this.cor = c;
		this.ponta = p; // ou pode usar o this.setPonta(p);
		this.tampar(); // já está mandando a caneta ficar tampada
	}

	public String getModelo() { // eu não posso retornar void tem que ser String
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return this.ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("SOBRE A CANETA:");
		// System.out.println("Modelo: " + this.modelo);
		System.out.println("Modelo: " + this.getModelo());
		// System.out.println("Ponta: " + this.ponta);
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
