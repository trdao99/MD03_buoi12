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
<h1>add employee</h1>
<form action="/addNew" method="post">
    <table border="1">
        <tr>
            <th>Name</th>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <th>Stock</th>
            <td><input type="text" name="stock"></td>
        </tr>
        <tr>
            <th>Status</th>
            <td>
                <input type="radio" checked name="status" value="true"><span>con</span><br>
                <input type="radio" name="status" value="false"><span>het</span>
            </td>
        </tr>
        <tr>
            <th>Category</th>
            <td>
                <select name="categoryID">
                    <c:forEach items="${category}" var="cate">
                        <option value="${cate.id}">${cate.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="ADD"></td>
        </tr>
    </table>
</form>
</body>
</html>
