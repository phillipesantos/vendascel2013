 package produtos.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;
import produtos.ProdutoController;



@WebServlet("/ServletPesquisarIncluirProduto")
public class ServletPesquisarIncluirProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ServletPesquisarIncluirProduto() {
       
    }

 /*
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Produto produto = new Produto();
    	ProdutoController produtoController = new ProdutoController();
    	PrintWriter pw = response.getWriter();
    	
    	try{
    	produto = produtoController.pesquisaProduto(request.getParameter("campoPesquisaP")); 
    	
    	String url = "RespostaProdutoServlet.jsp?campoNome="+ produto.getNome()+"&campoFabricante="+produto.getFabricante()+"&campoSO="+produto.getSistemaOperacional()
				+"&campoCor="+produto.getCor()+"&campoTamanho="+produto.getTamanho()+"&campoTamanhoTela="+produto.getTamanhoTela()+"&campoModelo="+produto.getModelo()
				+"&campoConexao="+produto.getConexao()+"&campoCamera="+produto.getCamera()+"&campoMemoriaInterna="+produto.getMemoriaInterna()+"&campoQuantidade="+produto.getQuantidade()
				+"&campoPreco="+produto.getPreco();
    	
		response.sendRedirect(url);
    	}
    	
    	catch(ProdutoInexistenteException e){
    		pw.append(e.getMessage());
    	}
		
	} 	
*/
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produto = new Produto();
		ProdutoController produtoController = new ProdutoController();

				// CAMINHO: http://localhost:8080/ALPOOproject-VendasCel/
		
				//Preenche as variaveis com as informações obtidas no JSP
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
				
				
				//produtoController.CadastrarProdutos(Id, nome, fabricante, sistemaOperacional, cor, tamanho, tamanhoTela, modelo, conexao, camera, memoriaInterna, quantidade, preco);
	
				String url = "cadastroProduto.jsp";
				response.sendRedirect(url);
				
	}

}
