package aula10;

public class Aula10 {
	public static void main(String[] args) {
		//Programa principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cl�udio");
		p4.setNome("Fabiana");
		
		p1.setSexo("M");
		p4.setSexo("F");
		p2.setIdade(18);
		
		
//		p2.setCurso("Inform�tica");
//		p3.setSalario(2500.75f);
//		p4.setSetor("Estoque");n�o funcionam -> aparece na proxima aula
		
		//p1.receberAumento(550.0f); n�o pode receber aumento pois � um metodo que � dos deus filhos
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
	}
}
