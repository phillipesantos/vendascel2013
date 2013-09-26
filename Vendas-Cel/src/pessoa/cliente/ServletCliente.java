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


				//Preenche as variaveis com as informações obtidas no HTML
				cliente.setNome(request.getParameter("nome"));
				cliente.setSobrenome(request.getParameter("sobrenome"));
				cliente.setDatadenascimento(request.getParameter("datadenascimento"));
				cliente.setSexo(request.getParameter("sexo"));
				cliente.setTamanho(request.getParameter("campoTamanho"));
				cliente.setTamanhoTela(request.getParameter("campoTamanhoTela"));
				cliente.setModelo(request.getParameter("campoModelo"));
				cliente.setConexao(request.getParameter("campoConexao"));
				cliente.setCamera(request.getParameter("campoCamera"));
				cliente.setMemoriaInterna(request.getParameter("campoMemoriaInterna"));
				cliente.setQuantidade(Integer.parseInt(request.getParameter("campoQuantidade")));
				cliente.setPreco(Double.parseDouble(request.getParameter("campoPreco")));
						
				clienteController.CadastrarProdutos(produto.getId(), produto.getNome(), produto.getFabricante(), produto.getSistemaOperacional(),
						produto.getCor(),produto.getTamanho(),produto.getTamanhoTela(),produto.getModelo(),produto.getConexao(),
						produto.getCamera(),produto.getMemoriaInterna(),produto.getQuantidade(),produto.getPreco());

}
