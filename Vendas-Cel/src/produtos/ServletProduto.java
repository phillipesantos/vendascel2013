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

		String url = "JSP/resultado.jsp?Nome="+ produto.getNome() + "&Fabricante="+produto.getFabricante()+"&SO="+produto.getSistemaOperacional();
		
		response.sendRedirect(url);
	}

}
