package produtos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletProduto")
public class ServletProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletProduto() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produto produto = new Produto();
		ProdutoDAO produtodao = new ProdutoDAO();
				
				produto.setNome(request.getParameter("campoNome"));
				produto.setFabricante(request.getParameter("campoFabricante"));
				produto.setSistemaOperacional(request.getParameter("campoSO"));
				produto.setCor(request.getParameter("campoCor"));
				produto.setTamanho(request.getParameter("campoTamanho"));
				produto.setTamanhoTela(request.getParameter("campoTamanhoTela"));
				produto.setModelo(request.getParameter("campoModelo"));
				produto.setConexao(request.getParameter("campoConexao"));
				produto.setCamera(request.getParameter("campoCamera"));
				produto.setMusica(request.getParameter("campoMusica"));
				produto.setMemoriaInterna(request.getParameter("campoMemoriaInterna"));
				produtodao.addProduto(produto);
				
				
				
				response.getWriter().println("<html>");
				response.getWriter().println("<head>");
				response.getWriter().println("<title> Resposta do servidor </title>");
				response.getWriter().println("</head>");
		 
				response.getWriter().println("<body>");
				  
				response.getWriter().println("seu nome cadastrado foi: \n" + produto.getNome() +"<br>");

				
				//response.getWriter().println("<a href='passiente.html'>Voltar</a>");
				response.getWriter().println("</body>");
				         
				response.getWriter().println("</html>");
	}

}
