function validarform() {
    if(document.forms[0].usuario.value==""){
        alert('Ingrese el Usuario');
        document.getElementById("usuario").style.border="1px solid red";
                return false;
       }     
         if(document.forms[0].contrasena.value=="") {
            alert ('Ingrese la Contrasena');
            document.getElementById("contrasena").style.border="1px solid red";
            return false;
          }
          if(document.forms[0].nombre.value=="") {
            alert ('Ingrese la Fecha de Creacion');
            document.getElementById("nombre").style.border="1px solid red";
            return false;
          }
          if(document.forms[0].apellido.value=="") {
            alert ('Ingrese la Fecha de Creacion');
            document.getElementById("apellido").style.border="1px solid red";
            return false;
          }
          if(document.forms[0].rut.value=="") {
            alert ('Ingrese la Fecha de Creacion');
            document.getElementById("rut").style.border="1px solid red";
            return false;
          }
          if(document.forms[0].telefono.value=="") {
            alert ('Ingrese la Fecha de Creacion');
            document.getElementById("telefono").style.border="1px solid red";
            return false;
          }
            return true;
    }   


 