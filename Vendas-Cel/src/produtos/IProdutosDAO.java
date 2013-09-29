package produtos;


public interface IProdutosDAO {
	
	public void addProduto(Produto produto);
	public boolean isExisteProduto(String nomeProduto);
	public Produto consultaProduto(String nomeProduto);
	public void alterarProduto(String nomeAntigo, Produto produto);
	public void excluirProduto(String nomeProduto);

}
