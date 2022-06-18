package aula14;

public class Gafanhoto extends Pessoa {
	private String login;
	private int toAssistindo;

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo); // que chama de Pessoas, que é a super classe
		this.login = login;
		this.toAssistindo = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistindo() {
		return toAssistindo;
	}

	public void setToAssistindo(int toAssistindo) {
		this.toAssistindo = toAssistindo;
	}

	@Override
	public String toString() {
		return "Gafanhoto[" + super.toString() + "\nlogin=" + login + ", toAssistindo=" + toAssistindo + "]";
	}
}
 