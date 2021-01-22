<%--
  Created by IntelliJ IDEA.
  User: kaitlinmuse
  Date: 1/22/21
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Displaying All Ads</title>
</head>
<body>
    <h1>Here are all the ads!</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h3>${ad.title}</h3>
            <h4>${ad.description}</h4>
            <h5>Posted by user: ${ad.userId}</h5>
            <br>
        </div>
    </c:forEach>

</body>
</html>
