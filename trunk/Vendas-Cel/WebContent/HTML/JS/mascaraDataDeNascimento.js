function mascaraDataDeNascimento(campoNascimento){
	var expReg = /^(([0-2]\d|[3][0-1])\/([0]\d|[1][0-2])\/[1-2][0-9]\d{2})$/;
	var msgErro = 'Formato inválido de data.';
	if ((campoNascimento.value.match(expReg)) && (campoNascimento.value!='')){
	var dia = campoNascimento.value.substring(0,2);
	var mes = campoNascimento.value.substring(3,5);
	var ano = campoNascimento.value.substring(6,10);
	if(mes==4 || mes==6 || mes==9 || mes==11 && dia > 30){
	alert("Dia incorreto !!! O mês especificado contém no máximo 30 dias.");
	return false;
	} else{
	if(ano%4!=0 && mes==2 && dia>28){
	alert("Data incorreta!! O mês especificado contém no máximo 28 dias.");
	return false;
	} else{
	if(ano%4==0 && mes==2 && dia>29){
	alert("Data incorreta!! O mês especificado contém no máximo 29 dias.");
	return false;
	} else{	
	alert ("Data correta!");
	return true;
	}}}} else {
	alert(msgErro);
	campoNascimento.focus();
	return false;
	}}
								