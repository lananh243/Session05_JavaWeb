<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/12/2025
  Time: 12:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Nhập thông tin sinh viên</h3>
<form action="<%=request.getContextPath()%>/StudentController" method="post">
    <label for="userName">Tên người dùng: </label>
    <input type="text" name="userName" id="userName">
    <br><br>
    <label for="age">Tuổi: </label>
    <input type="number" name="age" id="age">
    <br><br>
    <label for="address">Địa chỉ: </label>
    <input type="text" name="address" id="address">
    <br><br>
    <input type="submit" value="Gửi">
</form>
</body>
</html>
