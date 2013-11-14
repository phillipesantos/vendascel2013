package produtos;

import java.sql.SQLException;

import produtos.exception.ProdutoInexistenteException;

public class ProdutoController {
	
	private IProdutosDAO daoProduto = new ProdutoDAO();	
	
	public void CadastrarProdutos(String nome, String fabricante, String sistemaOperacional,
			String cor, String tamanho,String tamanhoTela, String modelo, String conexao,
			String camera, String memoriaInterna, long quantidade, double preco) throws ClassNotFoundException, SQLException{
		
		Produto produto= new Produto();
		
		produto.setNome(nome);
		produto.setFabricante(fabricante);
		produto.setSistemaOperacional(sistemaOperacional);
		produto.setCor(cor);
		produto.setTamanho(tamanho);
		produto.setTamanhoTela(tamanhoTela);
		produto.setModelo(modelo);
		produto.setConexao(conexao);
		produto.setCamera(camera);
		produto.setMemoriaInterna(memoriaInterna);
		produto.setQuantidade(quantidade);
		produto.setPreco(preco);
		
		daoProduto.addProduto(produto);
	}
	
	public Produto pesquisaProduto(String nomeProduto) throws ClassNotFoundException, SQLException{
		return daoProduto.consultaProduto(nomeProduto);
	
	}
	
	public void excluirProduto(String nomeProduto) throws ProdutoInexistenteException, ClassNotFoundException, SQLException{
		
		if(daoProduto.existeProduto(nomeProduto)){
			daoProduto.excluirProduto(nomeProduto);	
		} else {
			throw new ProdutoInexistenteException();
		}
	
	}
	
	
	public void alterarProduto(String nome, String fabricante, String sistemaOperacional,
			String cor, String tamanho,String tamanhoTela, String modelo, String conexao,
			String camera, String memoriaInterna, long quantidade, double preco) throws ClassNotFoundException, SQLException{
		
		Produto produtoAlterado= new Produto();
		
		produtoAlterado.setNome(nome);
		produtoAlterado.setFabricante(fabricante);
		produtoAlterado.setSistemaOperacional(sistemaOperacional);
		produtoAlterado.setCor(cor);
		produtoAlterado.setTamanho(tamanho);
		produtoAlterado.setTamanhoTela(tamanhoTela);
		produtoAlterado.setModelo(modelo);
		produtoAlterado.setConexao(conexao);
		produtoAlterado.setCamera(camera);
		produtoAlterado.setMemoriaInterna(memoriaInterna);
		produtoAlterado.setQuantidade(quantidade);
		produtoAlterado.setPreco(preco);
		
		daoProduto.alterarProduto(produtoAlterado);
	}
	
}
