function mascaraTelefone(tel){ // alto preenchimento das posi��es 0= ( 4= ) e 9= -
								if(tel.value.length==0){ 
									tel.value="("+tel.value;
								}else if(tel.value.length==4) {
									tel.value=tel.value+")";
								}else if(tel.value.length==9) {
									tel.value=tel.value+"-";
																}
								}