function mascaraDataDeNascimento(DataDeNascimento)
{
                         if(DataDeNascimento.value.length==2){ 
                         DataDeNascimento.value=DataDeNascimento.value+"/";
                            }else if(DataDeNascimento.value.length==5) {
                          DataDeNascimento.value=DataDeNascimento.value+"/";
                   }
 }