<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String user = (String) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("/views/login.jsp");
        return;
    }
%>

<h2>Chào <%= user %>!</h2>
<a href="LogoutController">Đăng xuất</a>

</body>
</html>
