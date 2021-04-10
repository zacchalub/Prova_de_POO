package IsaacChalub;

public class Main {

	public static void main(String[] args) {	
		
		//instancia da classe pessoa utilizando o construtor
		Pessoa pessoa = new Pessoa("Isaac", "Chalub");

		System.out.println("Teste da classe Pessoa (construtor recebendo nome e sobrenome): ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Sobrenome: " + pessoa.getSobrenome());
		System.out.println("Nome completo: " + pessoa.toString());
		System.out.println("Classe: " + pessoa.getClass());
		System.out.println();
		
		//Teste do construtor vazio da classe pessoa
		System.out.println("Teste da classe Pessoa (construtor vazio): ");
		Pessoa segundaPessoa = new Pessoa();
		segundaPessoa.setNome("Pedro");
		segundaPessoa.setSobrenome("Augusto");
		System.out.println("Nome completo: " + segundaPessoa.toString());
		System.out.println("Classe: " + segundaPessoa.getClass());
		System.out.println();
	
		//instancia da classe funcionario que herda de pessoa
		Funcionario funcionario = new Funcionario("Abrahão","Faria", 123123, 1000.0);
		System.out.println("Teste da classe Funcionario: ");
		System.out.println("Nome completo: " + funcionario.toString());
		System.out.println("Matrícula: " + funcionario.getMatricula());
		System.out.println("Salário: R$ " + funcionario.getSalario());
		System.out.println("Primeira parcela do salário R$ : " + funcionario.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela do salário R$ : " + funcionario.getSalarioSegundaParcela());
		System.out.println("Classe: " + funcionario.getClass());
		System.out.println();

		//instancia da classe professor que herda de funcionario
		Professor professor = new Professor( "Felipe", "Gomes", 674826, 5000.0);
		System.out.println("Teste da classe Professor");
		System.out.println("Nome completo: " + professor.toString());
		System.out.println("Matrícula: " + professor.getMatricula());
		System.out.println("Salário R$ : " + professor.getSalario());
		System.out.println("Primeira parcela do salário R$ : " + professor.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela do salário R$ : " + professor.getSalarioSegundaParcela());
		System.out.println("Classe: " + professor.getClass());
		System.out.println();
	}

}
