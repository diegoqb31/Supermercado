<%--
  Created by IntelliJ IDEA.
  User: Diego Quiros
  Date: 28/8/2022
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <header>
        <div class="container-fluid barra-container">
            <!-- BARRA NAVEGACIÓN -->
            <div class="bg-light">
                <nav class="navbar navbar-expand-md navbar-light bg-light border-3 border-bottom border-primary">
                    <div class="container-fluid">
                        <a href="#" class="navbar-brand link-logo-header" >Supermercado
                            <div class="logo-header text-center"></div>
                        </a>
                        <button type="button"
                                class="navbar-toggler"
                                data-bs-toggle="collapse"
                                data-bs-target="#MenuNavegacion">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="logo-login text-center">
                        </div>
                    </div>

                    <div id="MenuNavegacion" class="collapse navbar-collapse">
                        <ul class="navbar-nav ms-3">
                            <li class="nav-item">
                                <a class="nav-link active" href="#">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Facturar</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Inventario</a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">
                                    Usuario
                                </a>
                                <ul class="dropdown-menu dropdown-menu-end">
                                    <li><a class="dropdown-item" href="#">Perfil</a></li>
                                    <li><a class="dropdown-item" href="#">Ventas</a></li>
                                    <li><a class="dropdown-item" href="http://localhost:8086/Supermercado_war_exploded/index.jsp">Cerrar sesión</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </header>

