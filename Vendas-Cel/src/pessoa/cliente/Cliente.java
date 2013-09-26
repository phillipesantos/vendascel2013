package pessoa.cliente;

import pessoa.Pessoa;

public class Cliente extends Pessoa{

	private String email;
	private String senha;
	private String confirmarsenha;
	
	
	ClienteDAO clienteDAO = new ClienteDAO();
	
	public void salvar() {
		
		clienteDAO.addCliente(this);
	}	
	

	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfirmarsenha() {
		return confirmarsenha;
	}
	public void setConfirmarsenha(String confirmarsenha) {
		this.confirmarsenha = confirmarsenha;
	}
	
	
}
	
	
	
	


	


