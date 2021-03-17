<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 11/03/2021
  Time: 8:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin zone</title>
    <c:if test="${sessionScope.bean==null}">
        <jsp:forward page="index.jsp"></jsp:forward>
    </c:if>
</head>
<body>
Welcome, ${bean.getUername()}

</body>
</html>
