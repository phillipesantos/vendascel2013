package produtos;

import produtos.exception.ProdutoInexistenteException;


public class ProdutoController {
	
	
	private IProdutosDAO daoProduto;
	
	public ProdutoController(){
		daoProduto = new ProdutoDAO();
	}

	public void CadastrarProdutos(int Id, String nome, String fabricante, String sistemaOperacional,
			String cor, String tamanho,String tamanhoTela, String modelo, String conexao,
			String camera, String memoriaInterna, int quantidade, double preco){
		
		Produto produto= new Produto();
		
		produto.setId( produto.getPonteiro() + 1);
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
		produto.salvar();
	}
	
	public Produto pesquisaProduto(String nomeProduto) throws ProdutoInexistenteException{
			
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
			if(produtoDAO.isExcecao()==false){
				throw new ProdutoInexistenteException();	
			}else{
				return produtoDAO.consultaProduto(nomeProduto);	
			}
	}
	
	public void excluirContato(String nomeProduto) throws ProdutoInexistenteException{
	
		if(daoProduto.isExisteProduto(nomeProduto)){
			daoProduto.excluirProduto(nomeProduto);	
		} else {
			throw new ProdutoInexistenteException();
		}
	}
	
	public void alterarProduto(String nomeAntigo, Produto produto){
				
		daoProduto.alterarProduto(nomeAntigo, produto);
	}
	


}
