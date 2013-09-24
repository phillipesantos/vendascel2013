package vendas;

import pessoa.cliente.Cliente;
import produtos.Produto;



public class VendaController {
	
	public void cadastrarVenda(Cliente cliente, Produto produto, int id) {
		Venda v = new Venda();
		v.setCliente(cliente);
		v.setProduto(produto);
		v.setId(id);
		v.salvarVenda();
	}

}
