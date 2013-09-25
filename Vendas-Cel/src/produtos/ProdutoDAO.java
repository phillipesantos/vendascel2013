package produtos;

import java.util.Collection;
import java.util.LinkedList;



public class ProdutoDAO implements IProdutosDAO{
	
private static Collection<Produto> meusProdutos = new LinkedList<Produto>();
	
	public void addProduto(Produto produto){
		meusProdutos.add(produto);
	}

	
	public boolean isExisteProduto(String nomeProduto){
		boolean existe = false;
		for (Produto produto : meusProdutos) {
			if(produto.getNome().equals(nomeProduto)){
				existe = true;
			}
		}
		
		return existe;
	
	}
	
	public Produto consultaProduto(String nomeProduto){
		Produto produtoEncontrado = null;
		for (Produto produto : meusProdutos) {
			if(produto.getNome().equals(nomeProduto)){
				produtoEncontrado = produto;
			}
		}
		return produtoEncontrado;
	}
	
	
	
}
