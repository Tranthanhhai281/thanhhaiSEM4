<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/03/2021
  Time: 10:10 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search product</title>
</head>
<body>
<form action="pattern_name" method="POST">
        <span style="color: red">
            <c:out value="${param.msg}"/>
        </span>
    <input type="text" name="name"/>
    <input type="submit" value="Read"/>

</form>

</body>
</html>
