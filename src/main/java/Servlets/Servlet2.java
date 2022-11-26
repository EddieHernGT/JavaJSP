package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet2", value = "/servlet2")
public class Servlet2 extends HttpServlet {
    RequestDispatcher rd;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.setAttribute("parametroSesion2","nuevoValorSesion");
        //response.sendRedirect("main.jsp");
        request.setAttribute("nuevoParametroRespuesta","nuevoValorRespuesta");
        rd= request.getRequestDispatcher("/main.jsp");
        rd.forward(request,response);
    }
}
