	package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;



public class ProdutoDAO implements IProdutosDAO{
	

	private Connection conn = null;
	
	@Override
	public void addProduto(Produto produto) throws ClassNotFoundException, SQLException{
		this.conn = Conexao.getConexao();
		
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO produto (id, nome, fabricante, sistemaoperacional, cor, tamanho, tamanhotela, modelo, conexao, camera, memoriainterna, quantidade, preco) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,); ");
		
		pstmt.setInt(1, produto.getId());
		pstmt.setString(2, produto.getNome());
		pstmt.setString(3, produto.getFabricante());
		pstmt.setString(4, produto.getSistemaOperacional());
		pstmt.setString(5, produto.getCor());
		pstmt.setString(6, produto.getTamanho());
		pstmt.setString(7, produto.getTamanhoTela());
		pstmt.setString(8, produto.getModelo());
		pstmt.setString(9, produto.getConexao());
		pstmt.setString(10, produto.getCamera());
		pstmt.setString(11, produto.getMemoriaInterna());
		pstmt.setInt(12, produto.getQuantidade());
		pstmt.setDouble(13, produto.getPreco());

		pstmt.executeUpdate();
	}

	
	/*public boolean isExisteProduto(String nomeProduto){
		boolean existe = false;
		for (Produto produto : meusProdutos) {
			if(produto.getNome().toUpperCase().equals(nomeProduto.toUpperCase())){
				existe = true;
			}
		}
		
		return existe;
	
	}
	
	public Produto consultaProduto(String nomeProduto){
		Produto produtoEncontrado = null;
			
		for (Produto produto : meusProdutos) {
			if(produto.getNome().toUpperCase().equals(nomeProduto.toUpperCase())){
				produtoEncontrado = produto;				
				break;
			}
			
		}
		return produtoEncontrado;
	}
	
	
	@Override
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
