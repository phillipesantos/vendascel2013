<!DOCTYPE html>
<html>
	
	<head>
	
		<title>Cadastro de Produtos</title>
		
		<style type="text/css">
									
			#validarBusca{
							background:none;
							border: 1px solid #0d2c52;
							background:white;
						}
		</style>
		
		<link href="CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="JS/passaParaMaiusculo.js"></script>
		<script type="text/javascript" src="JS/somenteNumeros.js"></script>
		<script type="text/javascript" src="JS/campoEmBrancoProduto.js"></script>
		
	</head>
	
	<body>
		<font size="5" color="#bfe2e4" face="Verdana, Arial">Cadastro de Produto</font>
			<hr />
			
			<br />
	
			<font face="Verdana, Arial">
			<center>

				<form id="form1" action="ServletPesquisarIncluirProduto" method="get">

					<table id="tabela1" border="0" width="483px">
						<tr>
							<td align="right">Pesquisa de Produdo: </td>
							<td>
								<input type="text" id="campoPesquisaP" name="campoPesquisaP" onkeyup="passaParaMaiusculo(this)" required/>
								<input type="submit" id="validarBusca"  name="validarBusca" style="height:25px;" value="Pesquisar" />
							</td>
						</tr>
					</table>

				</form>

				<br />

				<form id="form2" action="ServletPesquisarIncluirProduto" method="post" onsubmit="campoEmBrancoProduto()">

					<table id="tabela2" border="0">

						<tr>
							<td align="right">Nome: </td>
							<td><input type="text" id="campoNome" name="campoNome" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Fabricante: </td>
							<td><input type="text" id="campoFabricante" name="campoFabricante" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Sistema Operacional: </td>
							<td><input type="text" id="campoSO" name="campoSO" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Cor: </td>
							<td><input type="text" id="campoCor" name="campoCor" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Tamanho: </td>
							<td><input type="text" id="campoTamanho" name="campoTamanho" required onkeyup="passaParaMaiusculo(this)"/>mm</td>
						</tr>

						<tr>
							<td align="right">Tamanho da Tela: </td>
							<td><input type="text" id="campoTamanhoTela"  name="campoTamanhoTela" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Modelo: </td>
							<td><input type="text" id="campoModelo" name="campoModelo" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Conexão: </td>
							<td><input type="text" id="campoConexao" name="campoConexao" required onkeyup="passaParaMaiusculo(this)"/></td>
						</tr>

						<tr>
							<td align="right">Câmera: </td>
							<td><input type="text" id="campoCamera" name="campoCamera" required onkeyup="passaParaMaiusculo(this)"/>px</td>
						</tr>

						<tr>
							<td align="right">Memória Interna: </td>
							<td><input type="text" id="campoMemoriaInterna" name="campoMemoriaInterna" required onkeyup="passaParaMaiusculo(this)"/>GB</td>
						</tr>
						
						<tr>			
							<td align="right">Quantidade: </td>
							<td><input type="text" id="campoQuantidade" name="campoQuantidade" required onkeypress="return somenteNumeros(event);"/></td>
						</tr>

						<tr>
							<td align="right">Preço(R$): </td>
							<td><input type="text" id="campoPreco" name="campoPreco" required onkeypress="return somenteNumeros(event);"/></td>
						</tr>

						<tr>
							<td></td>
							<td></td>
							<td  align="right">
								<input type="submit" style="height:40px;" size="60px" value="SALVAR" />
							</td>
						</tr>

					</table>
				</form>	
				
			</center>
		</font>	
	</body>
	
</html>