function mascaraSomenteLetras(mascaraSomenteLetras){
     var tecla=(window.event)?event.keyCode:mascaraSomenteLetras.which;
     if((tecla > 65 && tecla < 90)||(tecla > 97 && tecla < 122)) return true;
    else{
    if (tecla != 8) return false;
    else return true;
    }
}