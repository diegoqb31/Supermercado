<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>

    <link rel="icon" href="data:;base64,iVBORw0KGgo=">

    <!-- Bootstrap -->
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="CSS/Login.css" >


</head>
<body>
    <main>
        <div class="login">

            <h1 class="text-center">Inicio de Sesión</h1>
            <div class="logo-login text-center">
            </div>

            <form class="needs-validation" id="form" method="post">
                <div class="form-group was-validated">
                    <label class="form-label" for="email">Email</label>
                    <input class="form-control" type="email" id="email" required>
                    <div class="invalid-feedback">
                        Por favor introduzca su correo electrónico
                    </div>
                </div>

                <div class="form-group was-validated">
                    <label class="form-label" for="password">Contraseña</label>
                    <input class="form-control" type="password" id="password" required>
                    <div class="invalid-feedback">
                        Por favor introduzca su contraseña
                    </div>
                </div>

                <div class="form-group form-check">
                    <input class="form-check-input" type="checkbox" id="check">
                    <label class="form-check-label" for="check">Recordarme</label>
                </div>

                <input class="btn btn-success w-100" type="submit" value="Ingresar">
            </form>
        </div>
    </main>
</body>
<script src="JS/jquery-3.6.0.min.js" type="text/javascript"></script>
<script src="JS/Login.js" type="text/javascript"></script>

</html>