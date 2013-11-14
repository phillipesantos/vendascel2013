package pessoa.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import produtos.Produto;
import conexao.Conexao;


public class ClienteDAO implements IClienteDAO {
	
private static Collection<Cliente> meusClientes = new LinkedList<Cliente>();
	
private Connection conn = null;

@Override
public void addCliente(Cliente cliente) throws ClassNotFoundException, SQLException{
	this.conn = Conexao.getConexao();
	
	PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO pessoa () VALUES (?, ?, ?); ");
	
	pstmt.setString(2, cliente.getCpf());
	pstmt.setString(3,cliente.getEmail());
	pstmt.setString(3, cliente.getSenha());
	
	
	PreparedStatement pstmt2 = this.conn.prepareStatement("INSERT INTO cliente (cpf_pessoa,email,senha) VALUES (?, ?, ?); ");
		
	pstmt2.setString(2, cliente.getCpf());
	pstmt2.setString(3,cliente.getEmail());
	pstmt2.setString(3, cliente.getSenha());

	
	PreparedStatement pstmt3 = this.conn.prepareStatement("INSERT INTO endereco (cpf_pessoa,email,senha) VALUES (?, ?, ?); ");
	
	pstmt3.setString(2, cliente.getCpf());
	pstmt3.setString(3,cliente.getEmail());
	pstmt3.setString(3, cliente.getSenha());

	
	pstmt.executeUpdate();

}
		
	}



