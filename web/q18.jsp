<%-- 
    Document   : q18
    Created on : 17/03/2017, 19:57:40
    Author     : Sony Vaio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Digite dois numeros</h1>
        <form action="questao18" method="POST">
        <input type="text" name="numero1" pattern="[1-9]+$"/>
        
        <input type="text" name="numero2" pattern="[1-9]+$"/>
        
        <input type="submit" value="Enviar"/>
        
  <h1>Escolha a ação</h1>
  <select name="acao">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  </select>
  

            
            
            </form>
    </body>
</html>
