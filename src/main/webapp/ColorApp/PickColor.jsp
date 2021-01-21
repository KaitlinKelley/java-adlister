<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/21/21
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick A Color</title>
</head>
<body>
    <h1>Pick a color, any color!</h1>
    <form action="/viewcolor" method="POST">
        <label for="color">You picked:</label>
        <input type="text" name="color" id="color">
        <button type="submit">Submit</button>

    </form>

</body>
</html>
