<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 16, 2022, 9:21:28 PM
    Author     : yousu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            
            <label for="firstInput">First</label>
            <input type ="number" name="firstInput" id="firstInput"> <br>
           
            <label for="secondInput">Second</label>
            <input type ="number" name="secondInput" id="secondInput"> <br>
           
            <button type ="submit" name="addition" id="addition"> + </button>
            <button type ="submit" name="subtraction" id="subtraction"> - </button>
            <button type ="submit" name="multiplication" id="multiplication"> * </button>
            <button type ="submit" name="divison" id="divison"> % </button>
        
        </form>
        
        <label>Result:</label><span id="resultMessage"> ${message} </span> 
            <br>
            <br>
            <a href="age">Age Calculator</a>
    </body>
</html>
