function primo(){
var numero =  parseInt(document.getElementById('num').value);
var resposta = document.getElementById('resposta');
var divisores = 0

for(var primo=1; primo<=numero; primo ++)
if(numero % primo == 0)
   divisores++

   if(divisores==2)
   resposta.innerHTML = "o numero é primo";
   
   else
   resposta.innerHTML = "o numero não é primo";
}
