/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Windows
 */
public class DeleteLastServlet1 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteFrontServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           ArrayList<String> list=(ArrayList<String>)request.getSession().getAttribute("arraylist");
          
            int length=list.size();
             list.remove(length-1);
             int length1=list.size();
            for(int i=0;i<length1;i++)
           {
               //String str=ch[i];
             
               //NewList l=new NewList(str);
               
               out.println("<h3><center>");
               out.println(list.get(i));
               out.println("</center></h3>");
               
               
           }
           
           out.println("<b>Select Choice</b> <br><a href='addfront.jsp'>1.Add in Front</a>");
          out.println("<br><a href='addlast.jsp'>2.Add in Last</a>");
          out.println("<br><a href='AddMiddle.jsp'>3.Add in Middle</a>");
          out.println("<br><a href='DeleteFrontServlet'>4.Delete From Front</a>");
          out.println("<br><a href='DeleteLastServlet'>5.Delete From Last</a>");
          out.println("<br><a href='DeleteSpecific.jsp'>6.Delete From Specific Position</a>");
          out.println("<br><a href='Search.jsp'>7.Search Element</a>");
            
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
