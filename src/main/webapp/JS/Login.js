
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

formLogin = $("#form");
form.addEventListener('submit',function(e){
    e.preventDefault();

    //Validar Login
    const {email, password} = datos;

    if(email === "admin@supermercado.com" || password === "admin"){
        console.log("Login Exitoso");
        window.location.href = "http://localhost:8086/Supermercado_war_exploded/JSP/PaginaPrincipal.jsp";
    }else{
        console.log("Error al hacer login");
    }

});