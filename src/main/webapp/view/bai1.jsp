<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACE HELIOS
  Date: 5/12/2024
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="bai1">
    <input type="checkbox" name="condiments" value="Lettuce"> <span>Lettuce</span> <br>
    <input type="checkbox" name="condiments" value="Tomato"> <span>Tomato</span> <br>
    <input type="checkbox" name="condiments" value="Mustard"> <span>Mustard</span> <br>
    <input type="checkbox" name="condiments" value="Sprouts"> <span>Sprouts</span> <br>
    <input type="submit" value="save">
</form>
<div style="border: 1px solid; width: 200px; height: 100px;">
    <h4>Sandwich condiments:
        <c:forEach items="${comdiments}" var="s" >
            ${s}
        </c:forEach>
    </h4>
</div>
</body>
</html>
