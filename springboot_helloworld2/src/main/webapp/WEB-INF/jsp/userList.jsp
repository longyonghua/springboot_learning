<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; UTF-8" %>

<table border="1" align="center" width="50%">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.age}</td>
        </tr>
    </c:forEach>
</table>