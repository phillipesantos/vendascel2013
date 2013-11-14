package produtos;

import java.sql.SQLException;


public interface IProdutosDAO {
	
	public void addProduto(Produto produto) throws ClassNotFoundException, SQLException;
	public Produto consultaProduto(String nomeProduto) throws SQLException, ClassNotFoundException;
	public void alterarProduto(String nomeAntigo) throws ClassNotFoundException, SQLException;
	public void excluirProduto(String nomeProduto) throws ClassNotFoundException, SQLException;
	public boolean existeProduto(String nomeProduto) throws ClassNotFoundException, SQLException;
	
}
