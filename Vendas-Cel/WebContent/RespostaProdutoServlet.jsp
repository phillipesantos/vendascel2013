<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<title>Pesquisa de Produto</title>
		
		<link href="CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="JS/passaParaMaiusculo.js"></script>
		<script type="text/javascript" src="JS/somenteNumeros.js"></script>
	</head>

	<body>
		<font size="5" color="#bfe2e4" face="Verdana, Arial">Resultado da Busca de Produto</font>
		<hr />
		<br />
		<font face="Verdana, Arial">
		
		<center>
		
		<form id="formAlterarProduto" action="ServletAlterarProtuto" method="post">
			<table border="0">
	
				<tr>
					<td align="right">Nome:</td>
					<td><input type="text" value="<%= request.getParameter("campoNome") %>" name="respostaCampoNome" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
					
				<tr>
					<td align="right">Fabricante:
					<td><input type="text" value="<%= request.getParameter("campoFabricante") %>" name="respostaCampoFabricante" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
				
				<tr>
					<td align="right">Sistema Operacional:
					<td><input type="text" value="<%= request.getParameter("campoSO") %>" name="respostaCampoSO" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
				
				<tr>
					<td align="right">Cor:
					<td><input type="text" value="<%= request.getParameter("campoCor") %>" name="respostaCampoCor" onkeyup="passaParaMaiusculo(this)"></td>
				
				</tr>
				
				<tr>
					<td align="right">Tamanho:
					<td><input type="text" value="<%= request.getParameter("campoTamanho") %>" name="respostaCampoTamanho" onkeyup="passaParaMaiusculo(this)">mm</td>
				</tr>
				
				<tr>
					<td align="right">Tamanho da Tela:
					<td><input type="text" value="<%= request.getParameter("campoTamanhoTela") %>" name="respostaCampoTamanhoTela" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
				
				<tr>
					<td align="right">Modelo:
					<td><input type="text" value="<%= request.getParameter("campoModelo") %>" name="respostaCampoModelo" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
				
				<tr>
					<td align="right">Conexão:
					<td><input type="text" value="<%= request.getParameter("campoConexao") %>" name="respostaCampoConexao" onkeyup="passaParaMaiusculo(this)"></td>
				</tr>
				
				<tr>
					<td align="right">Câmera:
					<td><input type="text" value="<%= request.getParameter("campoCamera") %>" name="respostaCampoCamera" onkeyup="passaParaMaiusculo(this)">px</td>
				</tr>
				
				<tr>
					<td align="right">Memória Interna:
					<td><input type="text" value="<%= request.getParameter("campoMemoriaInterna") %>" name="respostaCampoMemoriaInterna"  onkeyup="passaParaMaiusculo(this)">GB</td>
				</tr>
				
				<tr>
					<td align="right">Quantidade:
					<td><input type="text" value="<%= request.getParameter("campoQuantidade") %>" name="respostaCampoQuantidade" onkeypress="return somenteNumeros(event);"></td>
				</tr>
				
				<tr>
					<td align="right">Preço(R$):
					<td><input type="text" value="<%= request.getParameter("campoPreco") %>" name="respostaCampoPreco" onkeypress="return somenteNumeros(event);"></td>
				</tr>
				
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td></td>
					<td align="right"><input type="submit" style="height:40px;" size="60px" value="ALTERAR" />
						<a href="cadastroProduto.jsp" target="conteudo"><input type="button" style="height:40px;" size="60px" value="CANCELAR" /></a></td>
				</tr>
				
			</table>
		</form>
		
		</center>
		
		</font>
		
	</body>
	
</html>