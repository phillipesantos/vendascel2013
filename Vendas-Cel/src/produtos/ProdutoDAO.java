	package produtos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;




public class ProdutoDAO implements IProdutosDAO{
	

	private Connection conn = null;
	Produto produto = new Produto();
	
	@Override
	public void addProduto(Produto produto) throws ClassNotFoundException, SQLException{
		this.conn = Conexao.getConexao();
		
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO produto (nome, fabricante, sistemaoperacional, cor, tamanho, tamanhotela, modelo, conexao, camera, memoriainterna, quantidade, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ");
		
					
		pstmt.setString(1, produto.getNome());
		pstmt.setString(2, produto.getFabricante());
		pstmt.setString(3, produto.getSistemaOperacional());
		pstmt.setString(4, produto.getCor());
		pstmt.setString(5, produto.getTamanho());
		pstmt.setString(6, produto.getTamanhoTela());
		pstmt.setString(7, produto.getModelo());
		pstmt.setString(8, produto.getConexao());
		pstmt.setString(9, produto.getCamera());
		pstmt.setString(10, produto.getMemoriaInterna());
		pstmt.setLong(11, produto.getQuantidade());
		pstmt.setDouble(12, produto.getPreco());
		pstmt.executeUpdate();

	}

	
	
	public Produto consultaProduto(String nomeProduto) throws SQLException, ClassNotFoundException{
		this.conn = Conexao.getConexao();
		
			
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM produto WHERE nome = ?");
		ps.setString(1, nomeProduto);
		
		ResultSet rs = ps.executeQuery();
		Produto produtoEncontrado = null;
		
		while(rs.next()){
			Produto produto= new Produto();
			produto.setNome(rs.getString("nome"));
			produto.setFabricante(rs.getString("fabricante"));
			produto.setSistemaOperacional(rs.getString("sistemaoperacional"));
			produto.setCor(rs.getString("cor"));
			produto.setTamanho(rs.getString("tamanho"));
			produto.setTamanhoTela(rs.getString("tamanhotela"));
			produto.setModelo(rs.getString("modelo"));
			produto.setConexao(rs.getString("conexao"));
			produto.setCamera(rs.getString("camera"));
			produto.setMemoriaInterna(rs.getString("memoriainterna"));
			produto.setQuantidade(rs.getLong("quantidade"));
			produto.setPreco(rs.getLong("preco"));
			produtoEncontrado=produto;
		}
		
		return produtoEncontrado;
	}
	
	
	public void alterarProduto(String nomeAntigo, Produto produtoAlterado) throws ClassNotFoundException, SQLException {
		this.conn = Conexao.getConexao();
		
		PreparedStatement ps = conn.prepareStatement("UPDATE produto WHERE nome = ?");
		Statement stmt = conn.createStatement(); 
		if(produtoAlterado.getNome().toUpperCase().equals(nomeAntigo.toUpperCase())){
			stmt.executeUpdate("UPDATE produto SET nome = '" + produtoAlterado.getNome() + "', fabricante = '"
			+ produtoAlterado.getFabricante() + "', sistemaoperacional = '"+ produtoAlterado.getSistemaOperacional()+"', cor = '"
			+ produtoAlterado.getCor() + "', tamanho= '"+ produtoAlterado.getTamanho()+"', tamanhotela= '"+produtoAlterado.getTamanho()+"', modelo ='"
			+ produtoAlterado.getModelo() + "' conexao='"+ produtoAlterado.getConexao()+ "', camera= '" + produtoAlterado.getCamera() + "', memoriainterna = '"
			+ produtoAlterado.getMemoriaInterna() + "', quantidade= '" + produtoAlterado.getQuantidade() + "', preco= '" + produtoAlterado.getPreco() + "'  WHERE nome = '" + produtoAlterado.getNome() + "'");
		}
	}
	
	
	public boolean existeProduto(String nomeProduto)throws ClassNotFoundException, SQLException {
		this.conn = Conexao.getConexao();
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM produto WHERE nome = ?");
		ps.setString(1, nomeProduto);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			produto.setNome(rs.getString("nome"));
			if(produto.getNome().toUpperCase().equals(nomeProduto.toUpperCase())){
				return true;
			}
		}
			return false;
			
		}	
	
	@Override
	public void excluirProduto(String nomeProduto)throws ClassNotFoundException, SQLException {
		Statement stmt = conn.createStatement();
		if(produto.getNome().toUpperCase().equals(nomeProduto.toUpperCase())){
			stmt.executeUpdate("DELETE FROM produto WHERE nome='"+produto.getNome()+"'");
			
			//PreparedStatement ps = conn.prepareStatement
			//ps.setString(1, nomeProduto);
		}

	}

}