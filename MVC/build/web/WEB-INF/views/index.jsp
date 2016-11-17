<%-- 
    Document   : default
    Created on : Nov 16, 2016, 8:00:48 PM
    Author     : ruman dangol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>FirstName</th>
                <th>LastName</th>
            </tr>
            <c:forEach var="customer" items="${requestScope.customers}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                </tr>
            </c:forEach>

        </table>
        <form method="post">
            <input type="text" name="name">
            <button type="submit">Send</button>
        </form>
    </body>
</html>
