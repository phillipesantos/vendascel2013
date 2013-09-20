package produtos;


public interface IProdutosDAO {
	
	public void addProduto(Produto produto);
	public boolean isExisteProduto(String nomeProduto);
	public Produto consultaProduto(String nomeProduto);

}
