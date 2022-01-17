/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 * Determines the next age of the person. 
 * @author Yousung Park 
 */
public class AgeCalculatorServlet extends HttpServlet {



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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
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
        
        String ageInput = request.getParameter("age");
        String message = "";
        
        
      if(ageInput != null){
        try {
            int age = Integer.parseInt(ageInput);
        
            if(age < 0 ){
                message = "Age must be greater than zero.";
            }
            else{
                age++;
                message = String.format("You will be %d after your next birthday",age); 
            }
        }   catch(Exception ex){
                message = "Please Enter your age.";
            }
      }
        else{
            message = "Please Enter your age.";
        }
       
      request.setAttribute("message", message);
        
      getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
      
      
    
      }      
 
    

    

}

