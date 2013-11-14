package vendas;

import java.sql.SQLException;
import java.util.Date;

import pessoa.cliente.Cliente;
import produtos.Produto;




public class VendaController {

	
	private IVendaDAO vendaDAO = new VendaDAO();
	
	public void cadastrarVenda(Double preco, Date data, String cpf, String nome) throws ClassNotFoundException, SQLException {
		
		
		Venda venda = new Venda();
		
		venda.getProduto().setPreco(preco);
		venda.setDataDeCompra(data);
		venda.getCliente().setCpf(cpf);
		venda.getProduto().setNome(nome);	
		
		
		vendaDAO.addVenda(venda);
		
		
	}

	
	
}
