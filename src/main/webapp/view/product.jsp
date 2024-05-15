<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACE HELIOS
  Date: 5/9/2024
  Time: 11:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach Product</h1>
<a href="/add">Them moi</a>
<table border="5" cellspacing="10" cellpadding="10">
    <thead>
    <tr>
        <th>No.</th>
        <th>Name</th>
        <th>price</th>
        <th>stock</th>
        <th>category</th>
        <th>status</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="em" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td >${em.name}</td>
            <td >${em.price}</td>
            <td >${em.stock}</td>
            <td >${em.category.name}</td>
            <td >${em.status}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>
