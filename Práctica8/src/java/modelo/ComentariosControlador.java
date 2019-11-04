package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.*;

/**
 *
 * @author Bárbara Viridiana Lara Espinosa
 */
public class ComentariosControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String accion = request.getParameter("accion");
            
            if(accion.equals("comentar")){
                String nombre = request.getParameter("nombre");
                String comentario = request.getParameter("comentario");
                
                ComentariosDAO comDAO = new ComentariosDAO();
                ComentariosPOJO comPOJO = new ComentariosPOJO();
                
                comPOJO.setNombre(nombre);
                comPOJO.setComentario(comentario);
                
                comDAO.insertar(comPOJO);
                response.sendRedirect("buscar.jsp");
            }else if(accion.equals("buscar")){
                String nombre = request.getParameter("nombre");
                String comentario = request.getParameter("comentario");
                
                ComentariosDAO comDAO = new ComentariosDAO();
                ComentariosPOJO comPOJO = new ComentariosPOJO();
                
                comPOJO.setNombre(nombre);
                comPOJO.setComentario(comentario);
                
                List comentarios = comDAO.buscar(comPOJO);
                
                HttpSession session = request.getSession();
                session.setAttribute("comentarios", comentarios);
                
                response.sendRedirect("buscar.jsp");
            }else{
                response.sendRedirect("error.jsp");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
