package vendas;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoa.Pessoa;
import pessoa.cliente.Cliente;
import produtos.Produto;


@WebServlet("/VendaServlet")
public class VendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Produto produto = new Produto();
		VendaController vendaController = new VendaController();
		int id = 000;
		
		venda.setId(id +=1); 
		cliente.setEmail(request.getParameter("campoEmail"));
		produto.setNome("campoNome");
		venda.setCliente(cliente);
		venda.setProduto(produto);
		
		vendaController.cadastrarVenda(cliente, produto, id);
		
		
		
	}

}
