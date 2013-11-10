	package produtos;

import java.util.Collection;
import java.util.LinkedList;



public class ProdutoDAO implements IProdutosDAO{
	

private static Collection<Produto> meusProdutos = new LinkedList<Produto>();
	
	@Override
	public void addProduto(Produto produto){
		meusProdutos.add(produto);
	}

	
	public boolean isExisteProduto(String nomeProduto){
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
	}
	
}
