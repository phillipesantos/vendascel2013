function mascaraCep(cep){
								if(cep.value.length==2){ 
									cep.value=cep.value+".";
								}else if(cep.value.length==6) {
									cep.value=cep.value+".";
								}
						}