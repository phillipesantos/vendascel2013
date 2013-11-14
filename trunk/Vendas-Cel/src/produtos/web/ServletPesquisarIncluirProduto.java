 package produtos.web;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;
import produtos.ProdutoController;



@WebServlet("/ServletPesquisarIncluirProduto")
public class ServletPesquisarIncluirProduto extends HttpServlet {
	

 
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Produto produto = new Produto();
    	ProdutoController produtoController = new ProdutoController();
    	    	
    	try{
    	produto = produtoController.pesquisaProduto(request.getParameter("campoPesquisaP")); 
    	
    	String url = "RespostaProdutoServlet.jsp?campoNome="+ produto.getNome()+"&campoFabricante="+produto.getFabricante()+"&campoSO="+produto.getSistemaOperacional()
				+"&campoCor="+produto.getCor()+"&campoTamanho="+produto.getTamanho()+"&campoTamanhoTela="+produto.getTamanhoTela()+"&campoModelo="+produto.getModelo()
				+"&campoConexao="+produto.getConexao()+"&campoCamera="+produto.getCamera()+"&campoMemoriaInterna="+produto.getMemoriaInterna()+"&campoQuantidade="+produto.getQuantidade()
				+"&campoPreco="+produto.getPreco();
    	
		response.sendRedirect(url);
    	}
    	
    	catch (ClassNotFoundException | SQLException e) {
			response.sendRedirect("telaConfirmacao.jsp?msg="+ e.getMessage());
    	}
		
	} 	

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produto = new Produto();
		
		
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
				produto.setQuantidade(Long.parseLong(request.getParameter("campoQuantidade")));
				produto.setPreco(Double.parseDouble(request.getParameter("campoPreco")));
				
				ProdutoController produtoController = new ProdutoController();
				String mensagemConfirmacao = "Produto Inserido com Sucesso!";
				
				try {
				produtoController.CadastrarProdutos(produto.getNome(), produto.getFabricante(), produto.getSistemaOperacional(),produto.getCor(),
						produto.getTamanho(), produto.getTamanhoTela(), produto.getModelo(), produto.getConexao(), produto.getCamera(), produto.getMemoriaInterna(), produto.getQuantidade(), produto.getPreco());
				} catch (ClassNotFoundException e) {
					mensagemConfirmacao = e.getMessage();
				} catch (SQLException e) {
					mensagemConfirmacao = e.getMessage();
				}
				String url = "telaConfirmacao.jsp?msg=" + mensagemConfirmacao;
				response.sendRedirect(url);
				
	}

}
