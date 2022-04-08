<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Human Manager</title>
</head>
<body>
<div align="center">
    <h2>Human Manager</h2>
    <form method="get" action="/human/">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/human/add">New Customer</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>City</th>
            <th>Street</th>
            <th>Birthday</th>
        </tr>
        <c:forEach items="${listHuman}" var="human">
            <tr>
                <td>${human.id}</td>
                <td>${human.firstname}</td>
                <td>${human.lastname}</td>
                <td>${human.city}</td>
                <td>${human.striit}</td>
                <td>${human.birtday}</td>
                <td>
                    <a href="/edit?id=${human.id}">Edit</a>

                    <a href="/delete?id=${human.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>