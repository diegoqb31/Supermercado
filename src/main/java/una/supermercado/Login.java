package una.supermercado;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    private String message;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        String correo = request.getParameter("email");
        String clave = request.getParameter("password");

        if(correo == "admin@supermercado.com" || clave == "admin"){
            try{
                response.sendRedirect("Supermercado_war_exploded/JSP/PaginaPrincipal.jsp");
            }catch(Exception ex){
                
            }

        }
    }
}