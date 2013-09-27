<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pesquisa de Produto</title>
		<link href="../CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<font size="5" color="#bfe2e4" face="Verdana, Arial">Resultado da Busca de Produto</font>
		<hr />
		<br />
		<font face="Verdana, Arial">
		
		<center>
			
		<table border="0">
		
			<tr>
				<td align="right">Nome:</td>
				<td><input type="text" value="<%= request.getParameter("campoNome") %>" name="respostaCampoNome"></td>
			</tr>
				
			<tr>
				<td align="right">Fabricante:
				<td><input type="text" value="<%= request.getParameter("campoFabricante") %>" name="respostaCampoFabricante"></td>
			</tr>
			
			<tr>
				<td align="right">SO:
				<td><input type="text" value="<%= request.getParameter("campoSO") %>" name="respostaCampoSO"></td>
			</tr>
			
			<tr>
				<td align="right">Cor:
				<td><input type="text" value="<%= request.getParameter("campoCor") %>" name="respostaCampoCor"></td>
			
			</tr>
			
			<tr>
				<td align="right">Tamanho:
				<td><input type="text" value="<%= request.getParameter("campoTamanho") %>" name="respostaCampoTamanho">mm</td>
			</tr>
			
			<tr>
				<td align="right">Tamanho da Tela:
				<td><input type="text" value="<%= request.getParameter("campoTamanhoTela") %>" name="respostaCampoTamanhoTela"></td>
			</tr>
			
			<tr>
				<td align="right">Modelo:
				<td><input type="text" value="<%= request.getParameter("campoModelo") %>" name="respostaCampoModelo"></td>
			</tr>
			
			<tr>
				<td align="right">Conexão:
				<td><input type="text" value="<%= request.getParameter("campoConexao") %>" name="respostaCampoConexao"></td>
			</tr>
			
			<tr>
				<td align="right">Camera:
				<td><input type="text" value="<%= request.getParameter("campoCamera") %>" name="respostaCampoCamera"></td>
			</tr>
			
			<tr>
				<td align="right">Memória Interna:
				<td><input type="text" value="<%= request.getParameter("campoMemoriaInterna") %>" name="respostaCampoMemoriaInterna">GB</td>
			</tr>
			
			<tr>
				<td align="right">Quantidade:
				<td><input type="text" value="<%= request.getParameter("campoQuantidade") %>" name="respostaCampoQuantidade"></td>
			</tr>
			
			<tr>
				<td align="right">Preço:
				<td><input type="text" value="<%= request.getParameter("campoPreco") %>" name="respostaCampoPreco"></td>
			</tr>
			
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" style="height:40px;" size="60px" value="ALTERAR" />
					<input type="button" style="height:40px;" size="60px" value="EXCLUIR" />
					<a href="../cadastroProduto.html" target="conteudo"><input type="button" style="height:40px;" size="60px" value="CANCELAR" /></a></td>
			</tr>
			
		</table>
		
		</center>
		
		</font>
		
	</body>
	
</html>