<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/20/21
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("title", "Login Page"); %>

<html>
<head>
    <title>${title}</title>
</head>
<body>
    <h4>Please login here:</h4>

    <form method="post" action="/login">
        <label for="username">Username</label>
        <input type="text" id="username">

        <label for="password">Password</label>
        <input type="password" id="password">

        <button type="submit">Submit</button>
    </form>

<%--    <c:choose>--%>
<%--        <c:if test="param.username = admin" AND test="param.password = password">--%>
<%--            <% response.sendRedirect("/login"); %>--%>
<%--        </c:if>--%>
<%--    </c:choose>--%>

</body>
</html>
