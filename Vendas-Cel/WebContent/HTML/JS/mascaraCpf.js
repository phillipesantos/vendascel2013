function mascaraCpf(cpf){
								if(cpf.value.length==4){ 
									cpf.value="."+tel.value;
								}else if(cpf.value.length==8) {
									cpf.value=cpf.value+".";
								}else if(cpf.value.length==12) {
									cpf.value=cpf.value+"-";
																}
								}