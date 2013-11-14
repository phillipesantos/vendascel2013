package produtos;

import java.sql.SQLException;


public interface IProdutosDAO {
	
	public void addProduto(Produto produto) throws ClassNotFoundException, SQLException;;
	public Produto consultaProduto(String nomeProduto) throws SQLException, ClassNotFoundException;
	//public void alterarProduto(String nomeAntigo, Produto produto);
	//public void excluirProduto(String nomeProduto);

}
