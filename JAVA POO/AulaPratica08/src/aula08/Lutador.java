package aula08;

public class Lutador {
	// Atributos
		private String nome;
		private String nacinoalidade;
		private int idade;
		private float altura;
		private float peso;
		private String categoria;
		private int vitorias, derrotas, empates;

		// Métodos publicos
		public void apresentar() {
			System.out.println("_________________________________________________");
			System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
			System.out.println("Diretamente de " + this.getNacinoalidade());
			System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m");
			System.out.println("Pesando " + this.getPeso() + "Kg");
			System.out.println(this.getVitorias() + " vitórias");
			System.out.println(this.getDerrotas() + " derrotas e");
			System.out.println(this.getEmpates() + " empates!");
		}

		public void status() {
			System.out.println(this.getNome() + " é um peso " + this.getCategoria());
			System.out.println("Ganhou " + this.getVitorias() + " vezes");
			System.out.println("Perdeu " + this.getDerrotas() + " vezes");
			System.out.println("Empatou " + this.getEmpates() + " vezes");
		}

		public void ganharLuta() {
			this.setVitorias(this.getVitorias() + 1);
			// this.vitorias = this.vitorias + 1; pode usar tanto o comando de cima como
			// esse
		}

		public void perderLuta() {
			this.setDerrotas(this.getDerrotas() + 1);
		}

		public void empatarLuta() {
			this.setEmpates(this.getEmpates() + 1);
		}

		// Métodos especiais
		public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
			super();
			this.nome = no;
			this.nacinoalidade = na;
			this.idade = id;
			this.altura = al;
			this.setPeso(pe);// this.setPeso(pe);Lembrar de alterar para setPeso, pois ele que chama a
								// categoria
			this.vitorias = vi;
			this.derrotas = de;
			this.empates = em;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getNacinoalidade() {
			return nacinoalidade;
		}

		public void setNacinoalidade(String nacinoalidade) {
			this.nacinoalidade = nacinoalidade;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
		}

		public float getPeso() {
			return peso;
		}

		public void setPeso(float peso) {
			this.peso = peso; // não esquecer de ajustar o setPeso no construtor
			this.setCategoria();// não recebe parametro nenhum, porém precisa existir ali em baixo
		}

		public String getCategoria() {
			return categoria;
		}

		private void setCategoria() {// apago o que estava em dentro do parenteses, para ajustar o erro de cima.
			// this.categoria = categoria; apaga essa linha ele não vai receber parametro
			if (this.peso < 52.2) {
				this.categoria = "Inválido";
			} else if (this.peso <= 70.3) {
				this.categoria = "Leve";
			} else if (this.peso <= 83.9) {
				this.categoria = "Médio";
			} else if (this.peso <= 120.2) {
				this.categoria = "Pesado";
			} else {
				this.categoria = "Inválido";
			}
		}

		public int getVitorias() {
			return vitorias;
		}

		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}

		public int getDerrotas() {
			return derrotas;
		}

		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}

		public int getEmpates() {
			return empates;
		}

		public void setEmpates(int empates) {
			this.empates = empates;
		}
		
}
