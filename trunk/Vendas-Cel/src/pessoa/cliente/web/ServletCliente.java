package pessoa.cliente.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pessoa.Endereco;
import pessoa.cliente.Cliente;
import pessoa.cliente.ClienteController;

@WebServlet("/ServletCliente")
public class ServletCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletCliente() {
       
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	Cliente cliente = new Cliente();
    	Endereco endereco = new Endereco();
		ClienteController clienteControler = new ClienteController();
		cliente = clienteControler.consultaCpfCliente(request.getParameter("campoBuscaCpf"));
		
		String url = "RespostaClienteServlet.jsp?campoNome="+ cliente.getNome()+"&campoSobrenome="+cliente.getSobrenome()
				+"&campoDataNascimento="+cliente.getDatadenascimento()+"&campoCpf="+cliente.getCpf()+"&campoRg="+cliente.getRg()
				+"&campoTelefone="+cliente.getTelefone()+"&campoEmail="+cliente.getEmail()+"&campoSenha1="+cliente.getSenha()
				+"&campoLogradouro="+endereco.getLogradouro()+"&campoNumero="+endereco.getNumero()+"&campoComplemento="+endereco.getComplemento()
				+"&campoBairro="+endereco.getBairro()+"&campoCidade="+endereco.getCidade()+"&campoCidade="+endereco.getCep();
		response.sendRedirect(url);
    	
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