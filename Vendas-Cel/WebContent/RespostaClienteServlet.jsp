<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pesquisa de Cliente</title>
		<link href="../CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
	
		<font size="5" color="#bfe2e4" face="Verdana, Arial">Resultado da Busca de Cliente</font>
			<hr />
			<br />
			<font face="Verdana, Arial">
			
			<center>
			
				<table>
			
					<tr>
						<td align="right">Nome:</td>
						<td><input type="text" value="<%= request.getParameter("campoNome") %>" size="50px" maxlength="30" name="respostaCampoNome"></td>
					</tr>
					
					<tr>
					    <td align="right">Sobrenome:</td>
						<td><input type="text" value="<%= request.getParameter("campoSobrenome") %>" size="50px" maxlength="30" name="respostaCampoSobrenome"></td>
					</tr>
					
					<tr>
					    <td align="right">Data De Nascimento:</td>
						<td><input type="text" value="<%= request.getParameter("campoDataNascimento") %> "size="20px"  maxlength="10" name="respostaCampoDataNascimento"></td>
					</tr>
					
					<tr>
					    <td align="right">CPF:</td>
						<td><input type="text" value="<%= request.getParameter("campoCpf") %>" size="30px" maxlength="14" name="respostaCampoCpf" ></td>
					</tr>
					
					<tr>
					    <td align="right">RG:</td>
						<td><input type="text" value="<%= request.getParameter("campoRg") %>" size="30px" maxlength="9" name="respostaCampoRg"></td>
					</tr>
					
					<tr>
					    <td align="right">Telefone:</td>
						<td><input type="text" value="<%= request.getParameter("campoTelefone") %>" size="30px" maxlength="13" name="respostaCampoTelefone"></td>
					</tr>
					<tr>
					    <td align="right">Logradouro:</td>
						<td><input type="text"  value="<%= request.getParameter("campoLogradouro") %>" size="50px" maxlength="40" name="respostaCampoLogradouro"></td>
					</tr>
					
					<tr>
					    <td align="right">Numero:</td>
						<td><input type="text" value="<%= request.getParameter("campoNumero") %>"size="20px" maxlength="8" name="respostaCampoNumero"></td>
					</tr>
					
					<tr>
					    <td align="right">Complemento:</td>
						<td><input type="text" value="<%= request.getParameter("campoComplemento") %>" size="50px" maxlength="40" name="respostaCampoComplemento"></td>
					</tr>
					
					<tr>
					    <td align="right">Bairro:</td>
						<td><input type="text" value="<%= request.getParameter("campoBairro") %>" size="50px" maxlength="30" name="respostaCampoBairro"></td>
					</tr>
					
					<tr>
					    <td align="right">Cidade:</td>
						<td><input type="text" value="<%= request.getParameter("campoCidade") %>" size="50px" maxlength="30" name="respostaCampoCidade"></td>
					</tr>
					
					<tr>
					    <td align="right">Cep:</td>
						<td><input type="text" value="<%= request.getParameter("campoCep") %>" size="20px" maxlength="10" name="respostaCampoCep"></td>
					</tr>
										
					<tr>
					    <td align="right">Email:</td>
						<td><input type="email" value="<%= request.getParameter("campoEmail") %>" size="50px" maxlength="30" name="respostaCampoEmail"></td>
					</tr>
					
					<tr>
					    <td align="right">Senha:</td>
						<td><input type="password" value="<%= request.getParameter("campoSenha1") %>" size="30px" maxlength="20"  name="respostaCampoSenha"></td>
					</tr>
	
					<tr>
						<td><br></td>
					</tr>
					
					<tr>
						<td></td>
						<td align="right"><input type="button" style="height:40px;" size="60px" value="ALTERAR" />
						<a href="cadastroCliente.jsp" target="conteudo"><input type="button" style="height:40px;" size="60px" value="CANCELAR" /></a></td>
					</tr>
		
				</table>
				
			</center>	
	
	</body>
</html>