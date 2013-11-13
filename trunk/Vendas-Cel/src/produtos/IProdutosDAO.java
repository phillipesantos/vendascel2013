package produtos;

import java.sql.SQLException;


public interface IProdutosDAO {
	
	public void addProduto(Produto produto) throws ClassNotFoundException, SQLException;;
	//public boolean isExisteProduto(String nomeProduto);
	//public Produto consultaProduto(String nomeProduto);
	//public void alterarProduto(String nomeAntigo, Produto produto);
	//public void excluirProduto(String nomeProduto);

}
