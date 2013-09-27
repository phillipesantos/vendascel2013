function validacaoDasSenhas(input){
	if (input.value != document.getElementById('campoSenha1').value) {
		input.setCustomValidity('As duas senhas devem coincidir.');
	  } else {
		//  input valido - redefinir a mensagem de erro
		input.setCustomValidity('');
	  }
	}
