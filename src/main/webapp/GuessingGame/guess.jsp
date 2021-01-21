<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/21/21
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <form action="/guess" method="POST">
        <label for="user-guess">Please enter a number between 1 and 3, inclusive:</label>
        <input type="text" id="user-guess" name="user-guess">
    </form>

</body>
</html>
