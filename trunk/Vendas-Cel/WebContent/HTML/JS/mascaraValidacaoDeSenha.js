function mascaraSenha(Senha){

	if (senha.value=="" || senha.value.length < 6) {
		alert("Preencha a senha corretamente.");
		senha.focus();
		return false;
		}
}