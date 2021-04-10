package IsaacChalub;

public class Pessoa {

	private String nome;
	private String sobrenome;

	Pessoa(){}
	
	Pessoa(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String toString() {
		return this.nome + " " + this.sobrenome;
	}
	
	public String getNomeCompleto() {
		return toString(); 
	}		
}
