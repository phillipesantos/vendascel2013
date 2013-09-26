function mascaraDataDeNascimento(campoNascimento)
{
	
		if(campoNascimento.value.length==2){ 
			campoNascimento.value=campoNascimento.value+"/";
		}else if(cep.value.length==5) {
			campoNascimento.value=campoNascimento.value+"/";
		}
}
					