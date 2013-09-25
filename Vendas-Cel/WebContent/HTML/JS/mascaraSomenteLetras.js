function mascaraSomenteLetras(a){
     var tecla=(window.event)?event.keyCode:a.which;
     if((tecla > 65 && tecla < 90)||(tecla > 97 && tecla < 122)) return true;
    else{
    if (tecla != 8) return false;
    else return true;
    }
}