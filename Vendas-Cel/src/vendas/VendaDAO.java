package vendas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class VendaDAO implements IVendaDAO {

		
	private Connection conn = null;
	
	public void addVenda(Venda venda) throws SQLException, ClassNotFoundException {
		
		this.conn = Conexao.getConexao();
		
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO venda (valor_venda, data_venda, cpf_cliente,nome) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ");
								
		pstmt.setDouble(1, venda.getProduto().getPreco());
		pstmt.setDate(2, (Date) venda.getDataDeCompra());
		pstmt.setString(3, venda.getCliente().getCpf());
		pstmt.setString(4, venda.getProduto().getNome());		
		pstmt.executeUpdate();

	}


	
}
