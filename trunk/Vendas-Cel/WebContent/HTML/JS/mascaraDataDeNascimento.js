function mascaraDataDeNascimento(campoNascimento)
{
	if(campoNascimento.value.length==2){ 
		campoNascimento.value=campoNascimento.value+"/";
	}else if(campoNascimento.value.length==5) {
		campoNascimento.value=cep.value+"/";
	}

}
