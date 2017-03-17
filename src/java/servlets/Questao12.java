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
@WebServlet(name = "Questao12", urlPatterns = {"/questao12"})
public class Questao12 extends HttpServlet {

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
        
        int idade1 = Integer.valueOf(request.getParameter("idade1"));;
        int idade2 = Integer.valueOf(request.getParameter("idade2"));;
        int id3 = Integer.valueOf(request.getParameter("idade3"));
        int id4 = Integer.valueOf(request.getParameter("idade4"));
        int id5 = Integer.valueOf(request.getParameter("idade5"));
        
        int total = idade1+idade2+id3+id4+id5;
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int maior = 0;
            
        String n1  = request.getParameter("nome1");
        String n2  = request.getParameter("nome2");
        String n3  = request.getParameter("nome3");
        String n4  = request.getParameter("nome4");
        String n5  = request.getParameter("nome5");
        
        
        
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Questao12</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Soma das idades</h1>  "+total );
            
            
        if (idade1>idade2)
       {
           m1=idade1;
           
           }else{
           m1=idade2;
       }
       if (m1>id3){
            m2=m1;
           }else{
            m2=id3;
        }      
        if (m2>id4){
            m3=m2;
           }else{
            m3=id4;
        }
        if (m3>id5){
            maior=m3;
           }else{
            maior=id5;
         }
          if (maior==idade1){
              out.println("<br>Nome da pessoa mais velha: "+n1 );
              out.println("<br>Com a idade eh"+idade1 );
          }
          if (maior==idade2){
              out.println("<br>Nome da pessoa mais velha: "+n2 );
              out.println("<br>maior idade eh"+idade2 );
          }
          if (maior==id3){
              out.println("<br>Nome da pessoa mais velha: "+n3 );
              out.println("<br>maior idade eh"+id3 );
          }
          if (maior==id4){
              out.println("<br>Nome da pessoa mais velha: "+n4 );
              out.println("<br>maior idade eh"+id4 );
          }
          if (maior==id5){
              out.println("<br>Nome da pessoa mais velha: "+n5 );
              out.println("<br>maior idade eh"+id5);
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

/*
 int [] vetor = { id1, id2, id3, id4, id5};

    // aux = variável que usaremos para guardar o maior valor de cada comparação
          

    // primeiro for = esse for fará com que o a variável i percorra o vetor a ser ordenado, mas ela vai anda                 uma casa enquanto a variável j percorre o vetor todo, ou seja i percorrerá apenas o tamanho do vetor ja             j percorrerá o tamanho do vetor vezes o tamanho do vetor
            for (i = 0; i < vetor.length; i++)
            {
                for (j = 0; j < vetor.length; j++)
                {
                    if (vetor[i] < vetor[j])
                    {
//aqui acontece a troca, do maior cara  vaia para a direita e o menor para a esquerda
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                }
            }
            for (k = 0; k < vetor.length; k++)
            {
                out.println(vetor[k]);                
            }
*/