function mascaraSenha(Senha){

	if (repetirsenha.value=="" || repetirsenha.value.length < 6) {
		alert("Preencha a repetição de senha corretamente.");
		senha.focus();
		return false;
		}
}