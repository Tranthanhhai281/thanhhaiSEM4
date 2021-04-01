<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/03/2021
  Time: 10:06 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="finder" class="com.example.MVC_model2.Model.ProductFinderBean" scope="request"/>
<c:forEach var="product" items="${finder.allProducts}">

</c:forEach>

</body>
</html>
