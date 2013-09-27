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
				cliente.setIdentidade(request.getParameter("campoIdentidade"));
				cliente.setTelefone(request.getParameter("campoTelefone"));
				cliente.setEmail(request.getParameter("campoEmail"));
				cliente.setSenha(request.getParameter("campoSenha1"));
				endereco.setLogradouro(request.getParameter("Logradouro"));  
				endereco.setComplemento(request.getParameter("complemento"));
				endereco.setNumero(request.getParameter("numero"));
				endereco.setBairro(request.getParameter("Bairro"));
				endereco.setCidade(request.getParameter("cidade"));
				endereco.setUf(request.getParameter("uf"));
				endereco.setCep(request.getParameter("cep"));
						
		clienteController.CadastrarClientes(cliente.getNome(), cliente.getSobrenome(), cliente.getDatadenascimento(),
		cliente.getCpf(),cliente.getIdentidade(),cliente.getTelefone(),cliente.getEmail(),cliente.getSenha());
		
		String url = "cadastroCliente.html";
		response.sendRedirect(url);		
			  
	}
}