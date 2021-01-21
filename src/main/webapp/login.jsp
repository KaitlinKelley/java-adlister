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

<%
    if(request.getMethod().equalsIgnoreCase("post")){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>


<html>
<head>
    <title>${title}</title>
</head>
<body>
    <h4>Please login here:</h4>

    <form method="POST" action="login.jsp">
        <label for="username">Username</label>
        <input type="text" id="username" name="username">

        <label for="password">Password</label>
        <input type="password" id="password" name="password">

        <button type="submit">Submit</button>
    </form>

</body>
</html>
