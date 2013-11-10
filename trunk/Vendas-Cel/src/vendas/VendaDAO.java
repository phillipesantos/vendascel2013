package vendas;

import java.util.Collection;
import java.util.LinkedList;

import produtos.Produto;

public class VendaDAO implements IVendaDAO {

	private static Collection<Venda> minhasVendas = new LinkedList<Venda>();
	private static Collection<Produto> carrinho = new LinkedList<Produto>();
	
	public void addVenda(Venda venda) {
		
		minhasVendas.add(venda);
		
	}

	
	public void carrinhoDeCompras(Produto produto) {
		
		carrinho.add(produto);
		
	}


	
}
