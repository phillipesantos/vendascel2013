
function campoEmBrancoVenda()
{
	if(document.getElementById("campoProduto").value == "")
	{
		alert("O nome do produto deve ser preenchido.");
	
	}else if(document.getElementById("campoEmail").value == "")
	{
		alert("O email deve ser preenchido.");
	}else if(document.getElementById("campoSenha").value == "")
	{
		alert("A senha deve ser preenchida.");
	}
	
} 