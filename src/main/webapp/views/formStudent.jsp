<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/12/2025
  Time: 1:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nhập thông tin sinh viên</title>
</head>
<body>

    <h3>Nhập thông tin sinh viên</h3>
    <form action="<%= request.getContextPath()%>/InfoStudentController" method="post">
        <label for="studentName">Tên người dùng: </label>
        <input type="text" name="studentName" id="studentName">
        <br><br>
        <label for="age">Tuổi: </label>
        <input type="number" name="age" id="age">
        <br><br>
        <label for="address">Địa chỉ: </label>
        <input type="text" name="address" id="address">
        <br><br>
        <input type="submit" value="Gửi">
    </form>

    <%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
    <p style="color:red;"><%= errorMessage %></p>
    <%
        }
    %>
</body>
</html>
