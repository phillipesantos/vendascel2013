package pessoa;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String datadenascimento;
	private boolean sexo;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(String datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
}
	