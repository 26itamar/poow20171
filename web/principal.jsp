<%-- 
    Document   : principal
    Created on : 23/02/2017, 22:34:12
    Author     : Laboratorio
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <h1>Hello World!</h1>
    <%--DECLARAÇÃO--%>
             <%!
        int contaVisitantes= 0;
        %>
        
        %>
        <%---SCRIPLET---%>
        <%
            out.println("mais um jeito de codigo java");
            out.println("Visitante: "+ (++contaVisitantes));
        %>
        <br>
        <%--EXPRESSION--%>
        Data: <%= (new Date()).toLocaleString() %>
    </body>
</html>
