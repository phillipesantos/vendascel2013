function mascaraCpf(cpf){
								if(cpf.value.length==3){ 
									cpf.value=cpf.value+".";
								}else if(cpf.value.length==7) {
									cpf.value=cpf.value+".";
								}else if(cpf.value.length==11) {
									cpf.value=cpf.value+"-";
																}
								}