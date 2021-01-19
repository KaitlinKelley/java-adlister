<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/19/21
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--JSP tags process in the server, NOT the browser!!!!--%>
<%--Browser doesn't care about server-size logic--%>
<%! int pageNumber = 1;%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <h1>Hello, Jupiter!</h1>
    <%--Testing! We should not see this!--%>
    <!-- 123 -->
    <p>The page number is: <%= pageNumber %></p>

    <h3>View Bob's Profile</h3>
    <form action="user-profile.jsp" method="get">
        <input type="hidden" id="username" name="username" value="Bob">
        <input type="hidden" id="user-id" name="user-id" value="12345">
        <button type="submit">Go</button>
    </form>

    <h3>Add a To do</h3>
    <form action="todo.jsp" method="post">
        <input type="text" id="item" name="item">
        <button type="submit">Add to List</button>
    </form>

    <%@ include file="partials/footer.jsp" %>

</body>
</html>
