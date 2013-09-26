function mascaraDataDeNascimento(campoNascimento)
{
    var origem;
    var txtOrigem;
    var key;
    if(window.event)
    {
        key = evento.keyCode;
        if(key >= 48 && key <= 57)
        {
            origem = evento.srcElement;
            txtOrigem = origem.value;
            if(txtOrigem.length == 2 || txtOrigem.length == 5 )
            {
                txtOrigem += "/";
                origem.value = txtOrigem ;
            }
        }else
        {
            event.returnValue = false;
        }   
    }
    else
    {
        key = evento.which;
        if(key >= 48 && key <= 57)
        {
            origem = evento.target;
            txtOrigem = origem.value;
            if(txtOrigem.length == 2 || txtOrigem.length == 5 )
            {
                txtOrigem += "/";
                origem.value = txtOrigem ;
            }
        }else
        {
            if(key != 8 && key != 0)
            {
                evento.preventDefault();
            }
        }
    }
}