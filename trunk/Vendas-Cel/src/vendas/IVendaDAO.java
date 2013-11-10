package vendas;

import produtos.Produto;

public interface IVendaDAO {

	public void addVenda(Venda venda);
	public void carrinhoDeCompras(Produto produto);
}
