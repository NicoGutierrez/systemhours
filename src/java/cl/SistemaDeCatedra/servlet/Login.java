/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.SistemaDeCatedra.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
         RequestDispatcher requestDispatcher = request.getRequestDispatcher("/versionweb/login/login.jsp");
        requestDispatcher.forward(request, response);
        
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
        String id = request.getParameter("user");
        String contrasena = request.getParameter("password");
        int idEntero = 0;
        try {
            idEntero = Integer.parseInt(id);
        }catch(Exception e){
            response.getWriter().write("Error al validar su rut");
            return;
        }
        /*
        GestorUsuario gestorUsuario = new GestorUsuario();
        Encargado encargado = gestorUsuario.getEncargado(idEntero);
        Cliente cliente = gestorUsuario.getCliente(idEntero);
        
        
        HttpSession session = request.getSession(true);
        if (cliente!=null){
            session.setAttribute("cliente", cliente);
            System.out.println("Cliente");
        }
        if (encargado!=null){
            session.setAttribute("encargado", encargado);
            System.out.println("encargado");
        }
        * */
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
        
        
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
