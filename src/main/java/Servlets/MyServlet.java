package Servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "myServlet", value = "/myServlet")
public class MyServlet extends HttpServlet {
    RequestDispatcher rd;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parametro1=request.getParameter("saludo");
        System.out.println(parametro1);

        HttpSession session=request.getSession();
        session.setAttribute("parametrosSesion","usuario1");

        //acceso a sesion
        String usuario=(String) session.getAttribute("parametrosSesion");

        System.out.println("Parametro de sesion:"+usuario);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parametro1=request.getParameter("saludo");
        System.out.println(parametro1);
        //response.sendRedirect("https://www.twitch.tv/");
        //response.sendRedirect(request.getContextPath());
        //response.sendRedirect("main.jsp");
        rd=request.getRequestDispatcher("/servlet2");
        rd.forward(request,response);
    }
}
