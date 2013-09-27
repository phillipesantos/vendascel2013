package pessoa.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoa.Endereco;
import produtos.Produto;
import produtos.ProdutoController;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletCliente() {
       
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		ClienteController clienteController = new ClienteController();
		

				
				cliente.setNome(request.getParameter("campoNome"));
				cliente.setSobrenome(request.getParameter("campoSobrenome"));
				cliente.setDatadenascimento(request.getParameter("campoDataNascimento"));
				cliente.setCpf(request.getParameter("campoCpf"));
				cliente.setRg(request.getParameter("campoRg"));
				cliente.setTelefone(request.getParameter("campoTelefone"));
				cliente.setEmail(request.getParameter("campoEmail"));
				cliente.setSenha(request.getParameter("campoSenha1"));
				endereco.setLogradouro(request.getParameter("campoLogradouro"));
				endereco.setNumero(request.getParameter("campoNumero"));
				endereco.setComplemento(request.getParameter("campoComplemento"));				
				endereco.setBairro(request.getParameter("campoBairro"));
				endereco.setCidade(request.getParameter("campoCidade"));
				endereco.setCep(request.getParameter("campoCep"));
						
		clienteController.CadastrarClientes(cliente.getNome(), cliente.getSobrenome(), cliente.getDatadenascimento(),
		cliente.getCpf(),cliente.getRg(),cliente.getTelefone(),cliente.getEmail(),cliente.getSenha(),cliente.getEndereco());
		
		String url = "cadastroCliente.html";
		response.sendRedirect(url);		
			  
	}
}