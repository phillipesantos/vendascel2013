package vendas;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;


@WebServlet("/VendaServlet")
public class VendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		
 		Produto produto = new Produto();
 		VendaController vendaController = new VendaController();	
 		Venda venda = new Venda();
 		
 		vendaController.adicionarNoCarrinho(produto);
 		 		

 		int id = 000;		
		venda.setId(id +=1); 
 		
 		response.sendRedirect("Boleto.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
	}

}
