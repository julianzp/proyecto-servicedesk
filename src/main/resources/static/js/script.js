var ractive = new Ractive({
  el: '#container',
  template: '#template',
  data: {}
});

function soloNumeros(e){
    var key = window.event ? e.which : e.keyCode;
    if (key < 48 || key > 56) {
       
        e.preventDefault();
    }
}

function validar(){

  var usuario = document.getElementById('usu').value;
  var contra = document.getElementById('contra').value;


  if (usuario=="juanbedoya0320@gmail.com" && contra=="123") {

window.location="principal.html"; 
} else{
  if (usuario=="nico@gmail.com" && contra=="456" ) {
    window.location="adm.html" 

     }else{
      alert('Usuario o contraseña incorrecta');
      location.reload(true);
     }
}

}

