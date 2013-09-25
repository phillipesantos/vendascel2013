package produtos;

public class Produto {
	
	private int id=0;
	private int ponteiro=0;
	private String nome;
	private String fabricante;
	private String sistemaOperacional;
	private String cor;
	private String tamanho;
	private String tamanhoTela;
	private String modelo;
	private String conexao;
	private String camera;
	private String memoriaInterna;
	private int quantidade=0;
	private double preco=0;
	
	
private IProdutosDAO produtosDAO = new ProdutoDAO();
	
	public void salvar() {
		produtosDAO.addProduto(this);
	}	
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public int getPonteiro() {
		return ponteiro;
	}
	public void setPonteiro(int ponteiro) {
		this.ponteiro = ponteiro;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	
	public String getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(String tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String getConexao() {
		return conexao;
	}
	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	
	
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}

		
	public String getMemoriaInterna() {
		return memoriaInterna;
	}
	public void setMemoriaInterna(String memoriaInterna) {
		this.memoriaInterna = memoriaInterna;
	}

	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	

}
