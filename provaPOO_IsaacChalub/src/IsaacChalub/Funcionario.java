package IsaacChalub;

public class Funcionario extends Pessoa {

	private int matricula;
	private double salario;
	
	private double primeiraParcela = 60.0;
	private double segundaParcela = 40.0;
	
	
	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		
		if (salario <= 0) {
			System.out.println("Erro!!!! Salário deve ser maior que 0.");
		}else {
			this.salario = salario;
		}	
	 }
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setSalario(double salario) {
		if (salario <= 0) {
			System.out.println("Erro!!!! Salário deve ser maior que 0.");
		}else {
			this.salario = salario;
		}	
	}

	public int getMatricula() {
		return matricula;
	}

	public double getSalario() {
		return salario;
	}

	public double getSalarioPrimeiraParcela() {
		return getSalario()*(primeiraParcela/100.0);
	}
	
	public double getSalarioSegundaParcela() {
		return getSalario()*(segundaParcela/100.0);
	}
	
}
