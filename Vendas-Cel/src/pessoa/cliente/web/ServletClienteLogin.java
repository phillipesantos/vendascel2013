package pessoa.cliente.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pessoa.cliente.Cliente;
import pessoa.cliente.ClienteDAO;

@WebServlet("/ServletClienteLogin")
public class ServletClienteLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente cliente = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		
		cliente.setEmail(request.getParameter("campoLogEmail"));
		cliente.setSenha(request.getParameter("campoLogSenha"));
		
		clienteDAO.isExisteCliente(cliente.getEmail(),cliente.getSenha());
	
		HttpSession sessao = request.getSession();
		request.getSession().setAttribute("cliente", cliente);
	
		
		response.sendRedirect("Boleto.jsp");
		
	}

	

}
