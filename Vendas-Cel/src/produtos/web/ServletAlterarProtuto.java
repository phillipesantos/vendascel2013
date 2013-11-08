package produtos.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;
import produtos.ProdutoController;


@WebServlet("/ServletAlterarProtuto")
public class ServletAlterarProtuto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletAlterarProtuto() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produto = new Produto();
		ProdutoController produtoController = new ProdutoController();
		
		produto.setNome(request.getParameter("respostaCampoNome"));
		produto.setFabricante(request.getParameter("respostaCampoFabricante"));
		produto.setSistemaOperacional(request.getParameter("respostaCampoSO"));
		produto.setCor(request.getParameter("respostaCampoCor"));
		produto.setTamanho(request.getParameter("respostaCampoTamanho"));
		produto.setTamanhoTela(request.getParameter("respostaCampoTamanhoTela"));
		produto.setModelo(request.getParameter("respostaCampoModelo"));
		produto.setConexao(request.getParameter("respostaCampoConexao"));
		produto.setCamera(request.getParameter("respostaCampoCamera"));
		produto.setMemoriaInterna(request.getParameter("respostaCampoMemoriaInterna"));
		produto.setQuantidade(Integer.parseInt(request.getParameter("respostaCampoQuantidade")));
		produto.setPreco(Double.parseDouble(request.getParameter("respostaCampoPreco")));
	}

}
