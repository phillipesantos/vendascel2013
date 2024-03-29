package produtos.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.ProdutoController;
import produtos.exception.ProdutoInexistenteException;

@WebServlet("/ServletExcluirProduto")
public class ServletExcluirProduto extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoController controlador = new ProdutoController();
		String mensagemConfirmacao = "Produto Excluido com Sucesso!";
		
		String nome = request.getParameter("campoExcluirP");
	
		try{			
			controlador.excluirProduto(nome);
			String url = "telaConfirmacao.jsp?msg=" + mensagemConfirmacao;
			response.sendRedirect(url);
			
		} catch (ProdutoInexistenteException e) {
			response.sendRedirect("telaConfirmacao.jsp?msg="+ e.getMessage());
		} catch (ClassNotFoundException | SQLException e) {
			response.sendRedirect("telaConfirmacao.jsp?msg="+ e.getMessage());
		}
		
		
	}
}
