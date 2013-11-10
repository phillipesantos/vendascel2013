<!DOCTYPE html>
<html>
	<head>
		<link href="CSS/loginCSS.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<form action="ServletClienteLogin">
			<div style="padding: 0 0 0 25%;">
	
				<div id="login-box">
	
					<H1>Login</H1>
					
					<br />
					<br />
					
					<div id="login-box-name" style="margin-top:20px;">Email:</div>
					
					<div id="login-box-field" style="margin-top:20px;">
						<input type="email" name="campoLogEmail" class="form-login" title="Usuário" value="" size="30" maxlength="50" placeholder="Digite aqui o seu Email"/>
					</div>
					
					<div id="login-box-name">Senha:</div>
					
					<div id="login-box-field">
						<input type="password" name="campoLogSenha"  class="form-login" title="Senha" value="" size="30" maxlength="15" placeholder="Digite aqui a sua Senha" />
					</div>
					
					<br />
					
					<span class="login-box-options">
						<input type="checkbox" name="1" value="1"> Lembrar! 
						<a href="#" style="margin-left:30px;">Esqueceu sua Senha?</a>
					</span>
					
					<br />
					<br />
					
					<a href="javascript:history.go(-1)"><img src="CSS/IMG/login-btn.png" width="103" height="42" style="margin-left:90px;" /></a>
	
				</div>

		   </div>
		</form>
	</body>
</html>
