package vendas;

import pessoa.cliente.Cliente;
import produtos.Produto;

public class Venda {
	
	private Cliente cliente;
	private Produto produto;
	private int id;
	
	
	VendaDAO vendaDAO;
	
	public void salvarVenda()
	{
		vendaDAO.addVenda(this);
		produto.setQuantidade(produto.getQuantidade() - 1);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
