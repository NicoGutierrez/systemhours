/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.SistemaDeCatedra.servlet;

import cl.SistemaDeCatedra.perfiles.Alumno;
import cl.SistemaDeCatedra.perfiles.GestorUsuario;
import cl.SistemaDeCatedra.perfiles.Monitor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Session;

/**
 *
 * @author sam
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        processRequest(request, response);
        HttpSession session = request.getSession(true);
        
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String tipo = request.getParameter("tipo");
  
        GestorUsuario gestorUsuario = new GestorUsuario();
        
        
        if (tipo.compareToIgnoreCase("alumno")==0){
            
            Alumno alumno = gestorUsuario.getAlumno(usuario);
            
            if (alumno!=null && alumno.compareAlumno(usuario, contrasena)){
                session.setAttribute("alumno", alumno);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
                requestDispatcher.forward(request, response);
            }else{
                out.println("<div data-role=\"page\" data-theme=\"h\" id=\"page1\">\n" +
                                "</a>"+
                                "<div data-theme=\"b\" data-role=\"content\">\n" +
                                    "<h3>\n" +
                                        "Error Usuario y o contraseña invalidos\n" +
                                    "</h3>\n" +
                                "</div>\n" +
                        "<a data-role=\"button\" data-rel=\"back\" href=\"#page1\" data-icon=\"back\" data-iconpos=\"left\" class=\"ui-btn-left\">\n" +
                                    "Volver\n" +
                                
                            "</div>");
            }
        }else if (tipo.compareToIgnoreCase("monitor")==0){
            Monitor monitor = gestorUsuario.getMonitor(usuario);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
            requestDispatcher.forward(request, response);
        }else{ 
            out.println("Error al recibir sus datos");
            
        }

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
