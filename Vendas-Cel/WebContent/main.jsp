<!DOCTYPE html>
<html>
	<head>
		<title>
			ALPOO Project
		</title>
		<link href="CSS/mainCSS.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
	
		<form>

			<a href="telaInicio.jsp" target="conteudo"><img src="CSS/IMG/LogoALPOO.png"></a>
			
						<!-- INICIO DA TABELA 1 -->

			<table class="tabela1" border="0" cellspacing="0" align="center">
				<tr>
					<td valign=bottom align="center">
						<input type="text" style="height:30px;" size="80px" name="barra_busca"  placeholder="O que procura?" />
					</td>
					<td valign=bottom align="center">
						<input type="submit" style="height:30px;" value="Buscar" />
					</td>
					<td align="center">
						<a href="cadastroCliente.jsp" target="conteudo" class="MenuCima" style="margin-left:45px; margin-right:5px;">Cadastre-se </a> <font color="#00BFFF;">|</font>
					</td>
					<td align="center">
						<a href="login.jsp" target="conteudo" class="MenuCima" style="margin:5px;">Entre </a> <font color="#00BFFF;">|</font>
					</td>
					<td align="center">
						<a href="contato.jsp" target="conteudo" class="MenuCima" style="margin:5px;">Contato</a>
					</td>
				</tr>
			</table>
		</form>
		
			<!-- FIM DA TABELA 1 -->
			
			<!-- INICIO DA TABELA 2 -->
			
			<table class="tabela2" border="0" cellspacing="0">
				
				<tr>
					<td><br/></td>
				</tr>
				
				<tr>
					<td> <!-- MENU LATERAL -->
						<iframe src="menuLateral.jsp" name="MenuLateral" frameborder="0" width="220px" height="1360px"></iframe>
					</td>
					<td> <!-- AREA DE CONTEUDO -->
						<iframe src="telaInicio.jsp" name="conteudo" frameborder="0" width="1020px" height="1360px"></iframe>
					</td>
				</tr>
			</table>
			
			
			<!-- FIM DA TABELA 2 -->
			
	</body>
</html>