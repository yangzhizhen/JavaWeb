<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <!--当访问该页面的时候，表示已经登录-->
    <%
        request.getSession().setAttribute("user","monkey1024");
    %>
</body>
</html>
