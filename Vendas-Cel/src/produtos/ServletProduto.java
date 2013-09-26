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
		ProdutoController produtoController = new ProdutoController();


				//Preenche as variaveis com as informações obtidas no HTML
				produto.setNome(request.getParameter("campoNome"));
				produto.setFabricante(request.getParameter("campoFabricante"));
				produto.setSistemaOperacional(request.getParameter("campoSO"));
				produto.setCor(request.getParameter("campoCor"));
				produto.setTamanho(request.getParameter("campoTamanho"));
				produto.setTamanhoTela(request.getParameter("campoTamanhoTela"));
				produto.setModelo(request.getParameter("campoModelo"));
				produto.setConexao(request.getParameter("campoConexao"));
				produto.setCamera(request.getParameter("campoCamera"));
				produto.setMemoriaInterna(request.getParameter("campoMemoriaInterna"));
				produto.setQuantidade(Integer.parseInt(request.getParameter("campoQuantidade")));
				produto.setPreco(Double.parseDouble(request.getParameter("campoPreco")));
						
				produtoController.CadastrarProdutos(produto.getId(), produto.getNome(), produto.getFabricante(), produto.getSistemaOperacional(),
						produto.getCor(),produto.getTamanho(),produto.getTamanhoTela(),produto.getModelo(),produto.getConexao(),
						produto.getCamera(),produto.getMemoriaInterna(),produto.getQuantidade(),produto.getPreco());
				
				//Lança as informações obtidas em um HTML
				
				String url = "respostaDoServlet.jsp?campoNome="+ produto.getNome();
				response.sendRedirect(url);
				
				
				/*response.getWriter().println("<html>");
				response.getWriter().println("<head>");
				response.getWriter().println("<title> Dados do Produto </title>");
				response.getWriter().println("</head>");
		 		response.getWriter().println("<body>");
				response.getWriter().println("Nome: \n" + produto.getNome() +"<br>");
				response.getWriter().println("Fabricante: \n" + produto.getFabricante() +"<br>");
				response.getWriter().println("Sistema Operacional: \n" + produto.getSistemaOperacional() +"<br>");
				response.getWriter().println("Cor: \n" + produto.getCor() +"<br>");
				response.getWriter().println("Tamanho: \n" + produto.getTamanho() +"<br>");
				response.getWriter().println("Tamanho da Tela: \n" + produto.getTamanhoTela() +"<br>");
				response.getWriter().println("Modelo: \n" + produto.getModelo() +"<br>");
				response.getWriter().println("Conexão: \n" + produto.getConexao() +"<br>");
				response.getWriter().println("Camera: \n" + produto.getCamera() +"<br>");
				response.getWriter().println("Memória Internet: \n" + produto.getMemoriaInterna() +"<br>");
				response.getWriter().println("Quantidade: \n" + produto.getQuantidade() +"<br>");
				response.getWriter().println("Preço: \n" + produto.getPreco() +"<br>");
				response.getWriter().println("</body>");
    			response.getWriter().println("</html>");*/
	}

}
