<!DOCTYPE html>
<html>
<head>
<link href="CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="JS/campoEmBrancoVenda.js"></script>

<meta charset="ISO-8859-1">
<title>Comprar</title>
</head>
	<body>
	<font size="5" color="#bfe2e4" face="Verdana, Arial">Venda</font>
			<hr />
			
			<br />
	
			<font face="Verdana, Arial"> 
		<center>	
			<form>
				<table>
					<tr>
						<td>Produto:</td>
						<td><input type="text" size="25px" id="campoProduto" name="campoProduto" maxlength="20"></td>
					</tr>
					<tr>
						<td>E-mail:</td>
						<td><input type="text" size="30px"  id="campoEmail" name="campoEmail" maxlength="25"></td>
					</tr>
					<tr>
						<td>Senha:</td>
						<td><input type="password" size="20px"   id="campoSenha" name="campoSenha" maxlength="15"></td>
					</tr>
					<tr>
						<td></td>
						<td></td>				
						<td><input type="submit" size="150px" value="Comprar" onclick="campoEmBrancoVenda()"></td>
					</tr>
					
				</table>
			</form>
		</center>
	</body>
</html>