	package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;



public class ProdutoDAO implements IProdutosDAO{
	

	private Connection conn = null;
	
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
		pstmt.setInt(11, produto.getQuantidade());
		pstmt.setDouble(12, produto.getPreco());
		pstmt.executeUpdate();

	}

	
	
	public Produto consultaProduto(String nomeProduto) throws SQLException, ClassNotFoundException{
		this.conn = Conexao.getConexao();
		
		Produto produtoEncontrado = null;
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM produto WHERE nome = ?");
		ps.setString(1, nomeProduto);
		ResultSet rs = ps.executeQuery();	
		
		return produtoEncontrado;
	}
	
	
	/*@Override
	public void alterarProduto(String nomeAntigo, Produto produto) {
		for (Produto produtoAntigo : meusProdutos) {
			if(produtoAntigo.getNome().toUpperCase().equals(nomeAntigo.toUpperCase())){
				produtoAntigo.setNome(produto.getNome());
				produtoAntigo.setFabricante(produto.getFabricante());
				produtoAntigo.setSistemaOperacional(produto.getSistemaOperacional());
				produtoAntigo.setCor(produto.getCor());
				produtoAntigo.setTamanho(produto.getTamanho());
				produtoAntigo.setTamanhoTela(produto.getTamanhoTela());
				produtoAntigo.setModelo(produto.getModelo());
				produtoAntigo.setConexao(produto.getConexao());
				produtoAntigo.setCamera(produto.getCamera());
				produtoAntigo.setMemoriaInterna(produto.getMemoriaInterna());
				produtoAntigo.setQuantidade(produto.getQuantidade());
				produtoAntigo.setPreco(produto.getPreco());
				break;
			}
		}
	}

	@Override
	public void excluirProduto(String nomeProduto) {
		for (Produto produto : meusProdutos) {
			if(produto.getNome().toUpperCase().equals(nomeProduto.toUpperCase())){
				meusProdutos.remove(produto);
				break;
			}
		}
	}*/
	
}
