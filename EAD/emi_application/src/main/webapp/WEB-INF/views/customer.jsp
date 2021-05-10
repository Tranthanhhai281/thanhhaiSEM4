<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Enterprise Application</title>
    <link type="text/css" rel="stylesheet" href="<c:url value="webjars/bootstrap/4.3.1/css/bootstrap.css"/> ">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">Enterprise Application</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
</nav>
<br>
<br>
<div class="container">
    <a class="btn btn-success" href="<%=request.getContextPath()%>/emi">Create new EMI</a><br>
    <div class="col-md-12 col-md-offset-0 mt-2">
        <div class="row ">
            <table class="table table-active">
                <thead class="thead-dark">
                <tr>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Phone</th>
                    <th>CCCD</th>
                    <th>Amount</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="user">
                    <tr>
                        <td>${user.fullName}</td>
                        <td>${user.address}</td>
                        <td>${user.phoneNumber}</td>
                        <td>${user.CCCD}</td>
                        <td>${user.amount}</td>
                        <td>
                            <a class="btn btn-primary" href="<%=request.getContextPath()%>/user/edit?id=${user.cust_id}">Edit</a>
                            <a class="btn btn-danger" href="<%=request.getContextPath()%>/user/delete?id=${user.cust_id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </div>
    <a class="btn btn-success" href="<%=request.getContextPath()%>/add">Create new customer</a>
</div>


</body>
</html>
