<%-- 
    Document   : agecalculator
    Created on : Jan 16, 2022, 7:59:46 PM
    Author     : yousung Park 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
          <%-- label for should be id  --%>  
            <label for="age">Enter your age:</label>
            <input type ="number" name="age" id="age">
            <input type ="submit" value="Submit">
        </form>
            <br>
        
            <span id="resultMessage"> ${message} </span> 
            <br>
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
          
          
    
        
    </body>
</html>
