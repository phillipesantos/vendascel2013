function mascaraSomenteLetras(e){
		if (document.all){var evt=event.keyCode;}
		else{var evt = e.charCode;}
		var chr = String.fromCharCode(evt);
//			var re = /[A-Za-z]/; // permite apenas de A-Z e de a-z
		var re = /[A-Za-z\s-ÃÕÑÁÉÍÓÚÀÜÇãõñáéíóúàçü]/; // permite de A-Z, a-z, espaços,
		// hífens e caracteres acentuados. Mais caracteres podem ser adicionados a Lista
		return (re.test(chr) || evt<20); // com evt<20 permitimos <ENTER>,<TAB>,<BACKSPACE>
		}