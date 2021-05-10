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
    <link rel="stylesheet" href="${contextPath}/webjars/bootstrap/4.3.1/css/bootstrap.css">
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
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h1> Create New User</h1>
            <%--@elvariable id="emiNew" type=""--%>
            <form:form action="${pageContext.request.contextPath}/emi/saveEmi" method="post" modelAttribute="emiNew">
                <div class="form-group">

                    <form:select class="custom-select" path="customer.cust_id">
                        <form:options items="${listCust}"  itemLabel="fullName" itemValue="cust_id" />
                    </form:select>
                </div>
                <div class="form-group">
                    <label > employee Name :</label>
                    <form:input type="text" class="form-control" path="employeeName" placeholder="Enter address" />
                </div>
                <div class="form-group">
                    <label > loan amount :</label>
                    <form:input type="number" class="form-control"  path="loan_amount" placeholder="Enter loan amount" autofocus="autofocus"/>
                </div>
                <div class="form-group">
                    <label > rate of interest :</label>
                    <form:input type="number" class="form-control" path="rate_of_interest" placeholder="Enter rate of interest" autofocus="autofocus"/>
                </div>
                <div class="form-group">
                    <label > team of the loan :</label>
                    <form:input type="text" class="form-control"  path="team_of_the_loan" placeholder="Enter team of the loan" autofocus="autofocus"/>
                </div>
                <div class="form-group">
                    <div class="row">
                        <div class="col-sm-6 ">
                            <input type="submit" name="login-submit" id="Login-submit" class="form-control btn btn-success" value="Save" >
                        </div>
                    </div>
                </div>
            </form:form>
        </div>
    </div>

</div>


</body>
</html>
