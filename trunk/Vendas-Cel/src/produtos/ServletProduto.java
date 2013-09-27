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

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	Produto produto = new Produto();
    	ProdutoController produtoController = new ProdutoController();    	
    	produto = produtoController.pesquisaProduto(request.getParameter("campoPesquisaP")); 
    	
    	String url = "JSP/respostaDoServlet.jsp?campoNome="+ produto.getNome()+"&campoFabricante="+produto.getFabricante()+"&campoSO="+produto.getSistemaOperacional()
				+"&campoCor="+produto.getCor()+"&campoTamanho="+produto.getTamanho()+"&campoTamanhoTela="+produto.getTamanhoTela()+"&campoModelo="+produto.getModelo()
				+"&campoConexao="+produto.getConexao()+"&campoCamera="+produto.getCamera()+"&campoMemoriaInterna="+produto.getMemoriaInterna()+"&campoQuantidade="+produto.getQuantidade()
				+"&campoPreco="+produto.getPreco();
		response.sendRedirect(url);
		
	} 	

    @Override
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
		
				String url = "cadastroProduto.html";
				response.sendRedirect(url);
				
	}

}
