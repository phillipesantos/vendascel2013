package produtos;

import java.sql.SQLException;

import produtos.exception.ProdutoInexistenteException;


public class ProdutoController {
	
	private IProdutosDAO daoProduto = new ProdutoDAO();	
	
	public void CadastrarProdutos(String nome, String fabricante, String sistemaOperacional,
			String cor, String tamanho,String tamanhoTela, String modelo, String conexao,
			String camera, String memoriaInterna, int quantidade, double preco) throws ClassNotFoundException, SQLException{
		
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
	
	/*public void excluirContato(String nomeProduto) throws ProdutoInexistenteException{
	
		if(daoProduto.isExisteProduto(nomeProduto)){
			daoProduto.excluirProduto(nomeProduto);	
		} else {
			throw new ProdutoInexistenteException();
		}
	}
	
	public void alterarProduto(String nomeAntigo, Produto produto){
				
		daoProduto.alterarProduto(nomeAntigo, produto);
	}*/
	


}
