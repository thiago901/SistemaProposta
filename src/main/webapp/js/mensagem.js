/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function salvarMensagem(idProposta){
    var textoInput = document.querySelector("#textoDigitado");
    var texto =textoInput.value;
    
    var request = new XMLHttpRequest();
    request.open("GET","input?action=CadastrarMensagem&idProposta="+idProposta+"&texto="+texto);
    request.send();
    console.log(request);
    
}
