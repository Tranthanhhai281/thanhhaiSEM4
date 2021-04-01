<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 15/03/2021
  Time: 10:02 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>
</head>
<body>
<h2>List products</h2>
<jsp:useBean id="finder" class="com.example.MVC_model2.Model.ProductFinderBean" scope="request"/>
<c:if test="${requestScope.finder==null}">
    <jsp:forward page="search.jsp"></jsp:forward>
</c:if>
<table>
    <tr>
        <td> ID</td>
        <td>Name</td>
        <td>Description</td>
    </tr>
    <c:forEach var="product" items="${finder.productByName}">
        <tr>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.desc}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
