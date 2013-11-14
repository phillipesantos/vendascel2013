package venda.web;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoa.cliente.Cliente;
import produtos.Produto;
import produtos.ProdutoController;
import produtos.exception.ProdutoInexistenteException;
import vendas.Venda;
import vendas.VendaController;


@WebServlet("/VendaServlet")
public class VendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Venda venda = new Venda();
		Produto produto = new Produto();
		Date data = new Date();
    	VendaController vendaController = new VendaController();
    	ProdutoController produtoController = new ProdutoController();
    	    	
    	try{
    		
    	produto = produtoController.pesquisaProduto(request.getParameter("campoNomeVenda"));   
    	int quantidade = Integer.parseInt(request.getParameter("campoQuantidadeVenda"));
    	
    
    	 
    	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");    
    	formatador.format( data );  
    	
    	venda.setDataDeCompra(data);    	
    	
    	
    	vendaController.cadastrarVenda(produto.getPreco(), data, quantidade, produto.getNome());
    	
    	//response.sendRedirect("Boleto.jsp");
    	
    	}catch (ProdutoInexistenteException e) {
			response.sendRedirect("telaConfirmacao.jsp?msg="+ e.getMessage());
    	
    	}catch (ClassNotFoundException | SQLException e) {
			//response.sendRedirect("telaConfirmacao.jsp?msg="+ e.getMessage());
    	}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
