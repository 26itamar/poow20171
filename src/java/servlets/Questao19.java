/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sony Vaio
 */
@WebServlet(name = "Questao19", urlPatterns = {"/questao19"})
public class Questao19 extends HttpServlet {

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
        
        String nome1  = request.getParameter("nome1");
        String nome2  = request.getParameter("nome2");
        String nome3  = request.getParameter("nome3");
        String nome4  = request.getParameter("nome4");
        String nome5  = request.getParameter("nome5");
        String nome6  = request.getParameter("nome6");
        String nome7  = request.getParameter("nome7");
        String nome8  = request.getParameter("nome8");
        String nome9  = request.getParameter("nome9");
        String nome10  = request.getParameter("nome10");
        
        int numero1 = Integer.valueOf(request.getParameter("idade1"));
        int numero2 = Integer.valueOf(request.getParameter("idade2"));
        int numero3 = Integer.valueOf(request.getParameter("idade3"));
        int numero4 = Integer.valueOf(request.getParameter("idade4"));
        int numero5 = Integer.valueOf(request.getParameter("idade5"));
        int numero6 = Integer.valueOf(request.getParameter("idade6"));
        int numero7 = Integer.valueOf(request.getParameter("idade7"));
        int numero8 = Integer.valueOf(request.getParameter("idade8"));
        int numero9 = Integer.valueOf(request.getParameter("idade9"));
        int numero10 = Integer.valueOf(request.getParameter("idade10"));
        
        int idade1, idade2, idade3, idade4, idade5, idade6, idade7, idade8, maioridade;
        int alt1, alt2, alt3, alt4, alt5, alt6, alt7, alt8, maioraltura;
        
        int altura1 = Integer.valueOf(request.getParameter("altura1"));
        int altura2 = Integer.valueOf(request.getParameter("altura2"));
        int altura3 = Integer.valueOf(request.getParameter("altura3"));
        int altura4 = Integer.valueOf(request.getParameter("altura4"));
        int altura5 = Integer.valueOf(request.getParameter("altura5"));
        int altura6 = Integer.valueOf(request.getParameter("altura6"));
        int altura7 = Integer.valueOf(request.getParameter("altura7"));
        int altura8 = Integer.valueOf(request.getParameter("altura8"));
        int altura9 = Integer.valueOf(request.getParameter("altura9"));
        int altura10 = Integer.valueOf(request.getParameter("altura10"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Questao19</title>");            
            out.println("</head>");
            out.println("<body>");
           
            if (numero1>numero2){
                idade1=numero1;
            } else{
                idade1=numero2;
            }
            if (idade1>=numero3){
                idade2=idade1;
            }else{
                idade2=numero3;
            }
            
            if (idade2>=numero4){
                idade3=idade2;
            }else{
                idade3=numero4;
            }
            if (idade3>=numero5){
                idade4=idade3;
            }else{
                idade4=numero5;
            }
            if (idade4>=numero6){
                idade5=idade4;
            }else{
                idade5=numero6;
            }
            if (idade5>=numero7){
                idade6=idade5;
            }else{
                idade6=numero7;
            }
            if (idade6>=numero8){
                idade7=idade6;
            }else{
                idade7=numero8;
            }
            if (idade7>=numero9){
                idade8=idade7;
            }else{
                idade8=numero9;
            }
            if (idade8>=numero10){
                maioridade=idade8;
            }else{
                maioridade=numero10;
            }
           
           
            
            if (maioridade==numero1){
             out.println("<br>Maior idade pertence a: "+nome1);   
             out.println("<br>Maior idade é de: "+numero1);   
            }
             if (maioridade==numero2){
             out.println("<br>Maior idade pertence a: "+nome2);   
             out.println("<br>Maior idade é de: "+numero2);   
            }
             if (maioridade==numero3){
             out.println("<br>Maior idade pertence a: "+nome3);   
             out.println("<br>Maior idade é de: "+numero3);   
            }
            if (maioridade==numero4){
             out.println("<br>Maior idade pertence a: "+nome4);   
             out.println("<br>Maior idade é de: "+numero4);   
            }
            if (maioridade==numero5){
             out.println("<br>Maior idade pertence a: "+nome5);   
             out.println("<br>Maior idade é de: "+numero5);   
            }
            if (maioridade==numero6){
             out.println("<br>Maior idade pertence a: "+nome6);   
             out.println("<br>Maior idade é de: "+numero6);   
            }
            if (maioridade==numero7){
             out.println("<br>Maior idade pertence a: "+nome7);   
             out.println("<br>Maior idade é de: "+numero7);   
            }
            if (maioridade==numero8){
             out.println("<br>Maior idade pertence a: "+nome8);   
             out.println("<br>Maior idade é de: "+numero8);   
            }
            if (maioridade==numero9){
             out.println("<br>Maior idade pertence a: "+nome9);   
             out.println("<br>Maior idade é de: "+numero9);   
            }
            if (maioridade==numero10){
             out.println("<br>Maior idade pertence a: "+nome10);   
             out.println("<br>Maior idade é de: "+numero10);   
            }
            
            
            
            
            
            
            
            if (altura1>altura2){
                alt1=altura1;
            } else{
                alt1=altura2;
            }
            if (alt1>=altura3){
                alt2=alt1;
            }else{
                alt2=altura3;
            }
            
            if (alt2>=altura4){
                alt3=alt2;
            }else{
               alt3=altura4;
            }
            if (alt3>=altura5){
                alt4=alt3;
            }else{
                alt4=altura5;
            }
            if (alt4>=altura6){
                alt5=alt4;
            }else{
                alt5=altura6;
            }
            if (alt5>=altura7){
               alt6=alt5;
            }else{
                alt6=altura7;
            }
            if (alt6>=altura8){
               alt7=alt6;
            }else{
                alt7=altura8;
            }
            if (alt7>=altura9){
                alt8=alt7;
            }else{
                alt8=altura9;
            }
            if (alt8>=altura10){
                maioraltura=alt8;
            }else{
                maioraltura=altura10;
            }
            if (maioraltura==altura1){
             out.println("<br>Maior altura pertence a: "+nome1);   
             out.println("<br>Maior altura é de: "+altura1);   
            }
             if (maioraltura==altura2){
             out.println("<br>Maior altura pertence a: "+nome2);   
             out.println("<br>Maior altura é de: "+altura2);   
            }
              if (maioraltura==altura3){
             out.println("<br>Maior altura pertence a: "+nome3);   
             out.println("<br>Maior altura é de: "+altura3);   
            }
               if (maioraltura==altura4){
             out.println("<br>Maior altura pertence a: "+nome4);   
             out.println("<br>Maior altura é de: "+altura4);   
            }
                if (maioraltura==altura5){
             out.println("<br>Maior altura pertence a: "+nome5);   
             out.println("<br>Maior altura é de: "+altura5);   
            }
                 if (maioraltura==altura6){
             out.println("<br>Maior altura pertence a: "+nome6);   
             out.println("<br>Maior altura é de: "+altura6);   
            }
                  if (maioraltura==altura7){
             out.println("<br>Maior altura pertence a: "+nome7);   
             out.println("<br>Maior altura é de: "+altura7);   
            }
                   if (maioraltura==altura8){
             out.println("<br>Maior altura pertence a: "+nome8);   
             out.println("<br>Maior altura é de: "+altura8);   
            }
                    if (maioraltura==altura9){
             out.println("<br>Maior altura pertence a: "+nome9);   
             out.println("<br>Maior altura é de: "+altura9);   
            }
                     if (maioraltura==altura10){
             out.println("<br>Maior altura pertence a: "+nome10);   
             out.println("<br>Maior altura é de: "+altura10);   
            }
            
            out.println("</body>");
            out.println("</html>");
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
