package pessoa.cliente;

import pessoa.Pessoa;

public class Cliente extends Pessoa{

	private String id;
	private String email;
	private String senha;
	private String confirmarsenha;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
