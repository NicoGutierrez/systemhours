/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.SistemaDeCatedra.servlet;

import cl.SistemaDeCatedra.perfiles.GestorUsuario;
import cl.SistemaDeCatedra.perfiles.Monitor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "CrearMonitor", urlPatterns = {"/CrearMonitor"})
public class CrearMonitor extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CrearMonitor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CrearMonitor at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
    
        /*
        int rut = Integer.parseInt(request.getParameter("rut").trim());
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String direccion = request.getParameter("direccion");
        String tMovil = request.getParameter("tMovil");
        String tFijo = request.getParameter("tFijo");
        String email = request.getParameter("email");
        String cargo = request.getParameter("cargo");
        Monitor monitor = new monitor(rut, nombres, apellidos);
        
        GestorUsuario gestorUsuario = new GestorUsuario();
        if (gestorUsuario.getMonitor(rut)!=null)
            out.println("El Usuario con el rut ingresado ya existe");
        if (gestorUsuario.AgregarMonitor(monitor)){
            
            out.println("OK");
        }else{     
            
            out.println("No se pudo agregar el usuario");
        }
        */
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
