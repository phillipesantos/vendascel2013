function mascaraTelefone(tel){ // alto preenchimento das posições 0= ( 4= ) e 9= -
								if(tel.value.length==0){ 
									tel.value="("+tel.value;
								}else if(tel.value.length==3) {
									tel.value=tel.value+")";
								}else if(tel.value.length==8) {
									tel.value=tel.value+"-";
																}
								}