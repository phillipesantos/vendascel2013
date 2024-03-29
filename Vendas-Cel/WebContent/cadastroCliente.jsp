<!DOCTYPE html>
<html>

	<head>
		
		<meta charset="ISO-8859-1">
		
		<title>Cadastro de Cliente</title>
		
		<link href="CSS/tabelasDeCadastroCSS.css" rel="stylesheet" type="text/css" />
		
		<script type="text/javascript" src="JS/somenteNumeros.js"></script>
		<script type="text/javascript" src="JS/somenteLetras.js"></script>
		<script type="text/javascript" src="JS/mascaraCpf.js"></script>
		<script type="text/javascript" src="JS/mascaraIdentidade.js"></script>
		<script type="text/javascript" src="JS/mascaraTelefone.js"></script>
		<script type="text/javascript" src="JS/mascaraDataDeNascimento.js"></script>
		<script type="text/javascript" src="JS/mascaraCep.js"></script>
		<script type="text/javascript" src="JS/validacaoDasSenhas.js"></script>	

		
	</head>

<body>

<font size="5" color="#bfe2e4" face="Verdana, Arial">Cadastro de Cliente</font>
			<hr />
			
			<br />
	
			<font face="Verdana, Arial">
<center>			
	<form id="form1" action="ServletCliente" method="post">
		<table>
		
			<tr>
				<td align="right">Nome:*</td>
				<td><input type="text"  size="50px" maxlength="30" name="campoNome" required></td>
			</tr>
			
			<tr>
			    <td align="right">Sobrenome:*</td>
				<td><input type="text" size="50px" maxlength="30" name="campoSobrenome" required></td>
			</tr>
			
			<tr>
			    <td align="right">Data De Nascimento:</td>
				<td><input type="text" size="20px"  maxlength="10" name="campoDataNascimento" title="DD/MM/AAAA" onkeypress="mascaraDataDeNascimento(this); return somenteNumeros(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">CPF:*</td>
				<td><input type="text" size="30px" maxlength="14" name="campoCpf" required onkeypress="mascaraCpf(this); return somenteNumeros(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">RG:*</td>
				<td><input type="text" size="30px" maxlength="9" name="campoRg" required onkeypress="mascaraIdentidade(this); return somenteNumeros(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Telefone:</td>
				<td><input type="text" size="30px" maxlength="13" name="campoTelefone" onkeypress="mascaraTelefone(this); return somenteNumeros(event);"></td>
			</tr>
			<tr>
			    <td align="right">Logradouro:</td>
				<td><input type="text"  size="50px" maxlength="40" name="campoLogradouro" onkeypress="return somenteLetras(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Numero:</td>
				<td><input type="text" size="20px" maxlength="8" name="campoNumero" onkeypress="return somenteNumeros(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Complemento:</td>
				<td><input type="text" size="50px" maxlength="40" name="campoComplemento"></td>
			</tr>
			
			<tr>
			    <td align="right">Bairro:</td>
				<td><input type="text" size="50px" maxlength="30" name="campoBairro" onkeypress="return somenteLetras(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Cidade:</td>
				<td><input type="text" size="50px" maxlength="30" name="campoCidade" onkeypress="return somenteLetras(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Cep:</td>
				<td><input type="text" size="20px" maxlength="10" name="campoCep" onkeypress="mascaraCep(this); return somenteNumeros(event);"></td>
			</tr>
			
			<tr>
			    <td align="right">Email:*</td>
				<td><input type="email" size="50px" maxlength="30" name="campoEmail" required></td>
			</tr>
			
			<tr>
			    <td align="right">Senha:*</td>
				<td><input type="password" size="30px" maxlength="20" id="campoSenha1" name="campoSenha1" required></td>
			</tr>
			
			<tr>
			    <td align="right">Repetir Senha:*</td>
				<td><input type="password" size="30px" maxlength="20" id="campoSenha2" name="campoSenha2"  required oninput="validacaoDasSenhas(this)"></td>
			</tr>

			<tr>
				<td></td>
				<td></td>
			    <td align="right">
					<input type="submit" style="height:40px;" size="60px" value="SALVAR" />
				</td>
			</tr>

		</table>
	</form>
	
<br />

		<form id="form2" action="ServletCliente" method="get">

			<table border="0" width="634px">
				<tr>
					<td align="right">Pesquisa de Cliente(CPF):</td>
					<td>
						<input type="text" id="campoBuscaCpf" name="campoBuscaCpf" maxlength="14" onkeypress="mascaraCpf(this); return somenteNumeros(event);" />
						<input type="submit" id="buscarCliente"  name="=buscarCliente" style="height:25px;" value="Pesquisar" />
					</td>
				</tr>
			</table>

         </form>

</center>
</body>
</html>