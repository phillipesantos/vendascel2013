function mascaraDataDeNascimento(campoNascimento)
{
	if(identidade.value.length==2){ 
		campoNascimento.value=campoNascimento.value+"/";
	}else if(identidade.value.length==5) {
		campoNascimento.value=campoNascimento.value+"/";
	 }
}
					