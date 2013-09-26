package pessoa.cliente;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;
import produtos.ProdutoController;

@WebServlet("/ServletProduto")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletCliente() {
       
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cliente cliente = new Cliente();
		ClienteController clienteController = new ClienteController();


				
				cliente.setNome(request.getParameter("nome"));
				cliente.setSobrenome(request.getParameter("sobrenome"));
				cliente.setDatadenascimento(request.getParameter("datadenascimento"));
				cliente.setCpf(request.getParameter("cpf"));
				cliente.setIdentidade(request.getParameter("identidade"));
				cliente.setTelefone(request.getParameter("telefone"));
				cliente.setEmail(request.getParameter("email"));
				cliente.setSenha(request.getParameter("senha1"));
				cliente.setConfirmarsenha(request.getParameter("confirmarsenha"));
				
						
				        CadastrarClientes(cliente.getNome(), cliente.getSobrenome(), cliente.getDatadenascimento(),
						cliente.getCpf(),cliente.getIdentidade(),cliente.getTelefone(),cliente.getEmail(),cliente.getSenha(),
						cliente.getConfirmarsenha());
				 
				Endereco endereco = new Endereco();
			        
			        
		          endereco.setBairro(request.getParameter("nome"));
}
