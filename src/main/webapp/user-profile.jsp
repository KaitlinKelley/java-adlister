<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/19/21
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h3>Welcome, <%= request.getParameter("username")%></h3>
    <h3>Your user id is: <%=request.getParameter("user-id")%></h3>
    <p><%= request.getMethod()%></p>

</body>
</html>
