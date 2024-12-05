
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        //suponiendo que el usuario visita por primera vez nuestro sitio 
        boolean nuevoUsuario = true;
        
        //Obtenemos el arreglo cookies              
        
        Cookie[] cookies = request.getCookies();
        
        if(cookies != null) {
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario =false;
                    break;
                }
            }
        }
        
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
            
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }
}
