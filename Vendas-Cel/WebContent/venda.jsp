<!DOCTYPE html>
<html>
<head>
<!--  --><link href="CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />

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
			<form action="VendaServlet" method="get" onsubmit="campoEmBrancoProduto()">
				<table>
								
					<tr>
						 <td> Produto:<input type="text" size="40px" name="campoNomeVenda"></td>
					</tr>
					<tr>
					
						<td>Quantidade:<input type="text" size="10px" name="campoQuantidadeVenda"></td>
					</tr>
			
			
					<tr>									
						<td><input type="submit" size="300px" value="Comprar" ></td>
					</tr>
					
				</table>
			</form>
		</center>
	</body>
</html>