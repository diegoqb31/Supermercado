
//Tomar datos de los inputs en tiempo real
const datos={
    email:'',
    password:''
}

const email = document.querySelector("#email");
const password = document.querySelector("#password");

email.addEventListener('input', leerTexto);
password.addEventListener('input', leerTexto);

function leerTexto(e){
    datos[e.target.id] = e.target.value;
}

//Submit del form

function validarForm(email, password){
    if(email == ""){
        alert("El correo no puede estar vacío.");
        $("#email").focus();
        return false;
    }
    if(password == ""){
        alert("La contraseña no puede estar vacía.");
        $("#passwrod").focus();
        return false;
    }
    return true;
}

formLogin = $("#form");
form.addEventListener('submit',function(e){
    e.preventDefault();

    //Validar Login
    const {email, password} = datos;
    if(validarForm(email, password)){

        $.ajax({
            type: $(this).attr("method"),
            url: $(this).attr("action"),
            data:$(this).serialize(),
            beforeSend: function(){
                console.log("Enviando");
            },
            success: function(data){
                console.log("Envío exitoso");
                //window.location.href = "http://localhost:8086/Supermercado_war_exploded/JSP/PaginaPrincipal.jsp";
            },
            error: function(data){
                console.log("Error al enviar");
            }
        });
        //console.log("Login Exitoso");
        //window.location.href = "http://localhost:8086/Supermercado_war_exploded/JSP/PaginaPrincipal.jsp";

    }else{
        console.log("Error al hacer login");
    }

});