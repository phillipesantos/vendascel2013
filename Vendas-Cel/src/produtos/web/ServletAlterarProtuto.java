package produtos.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import produtos.Produto;
import produtos.ProdutoController;


@WebServlet("/ServletAlterarProtuto")
public class ServletAlterarProtuto extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Produto produtoAlterado = new Produto();
				
		produtoAlterado.setNome(request.getParameter("respostaCampoNome"));
		produtoAlterado.setFabricante(request.getParameter("respostaCampoFabricante"));
		produtoAlterado.setSistemaOperacional(request.getParameter("respostaCampoSO"));
		produtoAlterado.setCor(request.getParameter("respostaCampoCor"));
		produtoAlterado.setTamanho(request.getParameter("respostaCampoTamanho"));
		produtoAlterado.setTamanhoTela(request.getParameter("respostaCampoTamanhoTela"));
		produtoAlterado.setModelo(request.getParameter("respostaCampoModelo"));
		produtoAlterado.setConexao(request.getParameter("respostaCampoConexao"));
		produtoAlterado.setCamera(request.getParameter("respostaCampoCamera"));
		produtoAlterado.setMemoriaInterna(request.getParameter("respostaCampoMemoriaInterna"));
		produtoAlterado.setQuantidade(Integer.parseInt(request.getParameter("respostaCampoQuantidade")));
		produtoAlterado.setPreco(Double.parseDouble(request.getParameter("respostaCampoPreco")));
		
		
		ProdutoController produtoController = new ProdutoController();
		String mensagemConfirmacao = "Produto Alterado com Sucesso!";
		
		try {
		produtoController.alterarProduto(produtoAlterado.getNome(), produtoAlterado.getFabricante(), produtoAlterado.getSistemaOperacional(),produtoAlterado.getCor(),
				produtoAlterado.getTamanho(), produtoAlterado.getTamanhoTela(), produtoAlterado.getModelo(), produtoAlterado.getConexao(), produtoAlterado.getCamera(),
				produtoAlterado.getMemoriaInterna(), produtoAlterado.getQuantidade(), produtoAlterado.getPreco());
		} catch (ClassNotFoundException e) {
			mensagemConfirmacao = e.getMessage();
		} catch (SQLException e) {
			mensagemConfirmacao = e.getMessage();
		}
		String url = "telaConfirmacao.jsp?msg=" + mensagemConfirmacao;
		response.sendRedirect(url);
	}

}
