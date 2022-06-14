<%@ page import="com.test.Alien" %><%--
  Created by IntelliJ IDEA.
  User: stepa
  Date: 2021-11-28
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#a9a9a9">
<b>
<%
    Alien a1 = (Alien)session.getAttribute("alien");
    out.println(a1);
%>
</b>
</body>
</html>
