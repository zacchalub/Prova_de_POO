package IsaacChalub;

public class Professor extends Funcionario {
	
	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
	}
	
	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
	
}
