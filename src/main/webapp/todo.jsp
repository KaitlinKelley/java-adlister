<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/19/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<% request.setAttribute("isAdmin", false); %>--%>

<html>
<head>
    <title>To-Do List</title>
</head>
<body>
    <h1>Here is your list:</h1>
    <ul>
        <li>
            <%= request.getParameter("item")%>
        </li>
    </ul>
    <p><%= request.getMethod()%></p>

</body>
</html>
