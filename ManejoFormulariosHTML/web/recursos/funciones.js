function validarForma(forma){
    //validamos usuario
    var usuario = forma.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password = forma.password;
    if (password.value == "" || usuario.value.length < 3){
        alert("Debe proporcionar una password con una logitud mayor a 3");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for (i=0 ; i< tecnologias.length;i++){
        if (tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if (!checkSeleccionado){
        alert("Debe proporcionar una tecnologia");
        return false;
    }
    
    var generos = forma.genero;
    var generoSeleccionado = false;
    
    for (i=0 ; i< generos.length;i++){
        if (generos[i].checked){
            generoSeleccionado = true;
        }
    }
    
    if (!generoSeleccionado){
        alert("Debe proporcionar una genero");
        return false;
    }
    
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    
    alert("Formulario valido, enviando datos...");
    return true;
}