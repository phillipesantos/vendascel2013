package pessoa.funcionario;

import pessoa.Pessoa;

public class Funcionario extends Pessoa{

	private String ctps;
	private String matricula;
	
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
