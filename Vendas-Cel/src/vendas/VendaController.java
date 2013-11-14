package vendas;

import java.sql.SQLException;
import java.util.Date;

import pessoa.cliente.Cliente;
import produtos.Produto;




public class VendaController {

	
	private IVendaDAO vendaDAO = new VendaDAO();
	
	public void cadastrarVenda(Double preco, Date data,int quantidade, String nome) throws ClassNotFoundException, SQLException {
		
		
		Venda venda = new Venda();
		
		venda.getProduto().setPreco(preco * quantidade);
		venda.setDataDeCompra(data);
		venda.getProduto().setNome(nome);	
		
		
		vendaDAO.addVenda(venda);
		
		
	}

	

	
	
}
