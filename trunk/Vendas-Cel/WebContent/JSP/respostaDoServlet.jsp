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

<table border="0">

	<tr>
		<td align="right">Nome:</td>
		<td><input type="text" value="<%= request.getParameter("campoNome") %>"></td>
	</tr>
		
	<tr>
		<td align="right">Fabricante:
		<td><input type="text" value="<%= request.getParameter("campoFabricante") %>"></td>
	</tr>
	
	<tr>
		<td align="right">SO:
		<td><input type="text" value="<%= request.getParameter("campoSO") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Cor:
		<td><input type="text" value="<%= request.getParameter("campoCor") %>"></td>
	
	</tr>
	
	<tr>
		<td align="right">Tamanho:
		<td><input type="text" value="<%= request.getParameter("campoTamanho") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Tamanho da Tela:
		<td><input type="text" value="<%= request.getParameter("campoTamanhoTela") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Modelo:
		<td><input type="text" value="<%= request.getParameter("campoModelo") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Conexão:
		<td><input type="text" value="<%= request.getParameter("campoConexao") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Camera:
		<td><input type="text" value="<%= request.getParameter("campoCamera") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Memória Interna:
		<td><input type="text" value="<%= request.getParameter("campoMemoriaInterna") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Quantidade:
		<td><input type="text" value="<%= request.getParameter("campoQuantidade") %>"></td>
	</tr>
	
	<tr>
		<td align="right">Preço:
		<td><input type="text" value="<%= request.getParameter("campoPreco") %>"></td>
	</tr>

</table>












</body>
</html>