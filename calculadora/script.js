
function escreve(n) {

  var box = document.f1.txtbox.value;

  document.f1.txtbox.value = box + n;

}

function calcular(){

  var box = document.f1.txtbox.value;

  document.f1.txtbox.value=eval(box);

}