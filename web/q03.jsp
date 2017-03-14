<%-- 
    Document   : q03
    Created on : 11/03/2017, 21:14:08
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
        <h1>Idade</h1>
        <form action="questao3" method="POST">
            <input type="text" name="idade"/>
            
            <h1>Estado civil</h1>
            <select name="civil">
  <option value="solteiro">SOLTEIRO(A)</option>
  <option value="casado">CASADO(A)</option>
  <option value="viúvo">VIÚVO(A)</option>
  <option value="divorciado">DIVORCIADO(A0</option>
</select>
            
            <h1>Escolaridade</h1>
            <select name="escolaridade">
  
  <option value="ENSINO FUNDAMENTAL INCOMPLETO">FUNDAMENTAL INCOMPLETO</option>
  <option value="ENSINO FUNDAMENTAL COMPLETO">FUNDAMENTAL COMPLETO</option>
  <option value="2 grau INcompleto">2 GRAU INCOMPLETO</option>
  <option value="2 grau completo">2 GRAU COMPLETO </option>
  <option value="FACULDADE">ENSINO SUPERIOR COMPLETO</option>
 </select>
            <input type="submit" value="Enviar"/>
         </form>
    </body>
</html>
