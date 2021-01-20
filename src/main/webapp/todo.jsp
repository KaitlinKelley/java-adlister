<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/19/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("isAdmin", false); %>
<% request.setAttribute("myTasks", new String[] {"Todo 1", "Todo 2", "Todo 3"}); %>
<html>
<head>
    <title>To-Do List</title>
</head>
<body>

<c:if test="${isAdmin}">
    <%@include file="partials/admin_navbar.jsp"%>
</c:if>

<h1>Here is your list:</h1>
<ul>
    <c:forEach items="${myTasks}" var="task">
        <li>${task}</li>
    </c:forEach>
</ul>
<p><%= request.getMethod()%></p>

</body>
</html>