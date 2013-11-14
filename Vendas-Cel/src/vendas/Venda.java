package vendas;

import java.util.Date;

import pessoa.cliente.Cliente;
import produtos.Produto;

public class Venda {
	
	private Cliente cliente;
	private Produto produto;
	private Date dataDeCompra;
	private int id;
	
	
	
	
	public Date getDataDeCompra() {
		return dataDeCompra;
	}
	public void setDataDeCompra(Date dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
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
