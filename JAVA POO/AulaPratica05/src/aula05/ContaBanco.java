package aula05;

/*Uma conta de banco, temos os clientes J 300reias e C 500reais -> temos conta-corrente e conta poupança
 * eles podem sacar seu dinheiro, o objetivo é transformar conta corrente em um objeto, que é composto por
 * atributos(dados que o objeto tem dentro), métodos(são procedimentos, funções, pequenos programas que existem
 * dentro do objetos)  e estado atual. */

public class ContaBanco {
	// atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	// metodos personalizados
	public void estadoAtual() {
		System.out.println("__________________________________");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void AbrirConta(String t) {// tipo da conta,
		setTipo(t);
		setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
			saldo = 50;
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) { // (saldo > 0)
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
		} else if (this.getSaldo() < 0) { // (saldo < 0)
			System.out.println("Conta não pode ser fechada pois tem débito");
		} else {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v); // saldo = saldo + v;
			System.out.println(("Depósito realizado na conta de " + this.getDono()));
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}

	public void pagarMensal() {
		int v = 0; // variavel local
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade para com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}

	// métodos especiais
	public ContaBanco() { // sempre que eu criar um objeto ele terá esses parâmetros.
		this.saldo = 0; // this.setSaldo(0);
		this.status = false;// this.setStatus(false);
	}

	public void setNumConta(int n) { // tem que receber um parâmetro, n é uma variável
		this.numConta = n; // número da conta recebe n
	}

	public int getNumConta() {// retorna um numero da conta
		return this.numConta;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public String getDono() {
		return this.dono;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}

	public boolean getStatus() {
		return this.status;
	}
}
