/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Yousung Park
 */

public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
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
        
        String firstInput = request.getParameter("firstInput");
        String secondInput = request.getParameter("secondInput");
        String message = "";
        
        
      if(!firstInput.isEmpty()&& !secondInput.isEmpty() ){
        try {
            int firstNumb = Integer.parseInt(firstInput);
            int secondNumb = Integer.parseInt(secondInput);
            
            if(request.getParameter("addition") != null){
                message = Integer.toString(firstNumb + secondNumb); 
            }
            
            else if(request.getParameter("subtraction") != null){
                message = Integer.toString(firstNumb - secondNumb); 
            }
            
            else if(request.getParameter("multiplication") != null){
                message = Integer.toString(firstNumb * secondNumb); 
            }
            
            else if(request.getParameter("divison") != null){
                message = Integer.toString(firstNumb / secondNumb); 
            }
            
        
        }   catch(Exception ex){
                message = "invalid";
            }
      }
   
        else{
            message = "---";
        }
       
        request.setAttribute("message", message);
        
      
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
}

