<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng Nhập</title>
</head>
<body>
<h2>Đăng Nhập</h2>
    <form action="LoginController" method="post">
        <label for="username">Tên người dùng:</label>
        <input type="text" name="username" id="username" required/><br><br>

        <label for="password">Mật khẩu:</label>
        <input type="password" name="password" id="password" required/><br><br>

        <input type="submit" value="Đăng nhập"/>
    </form>
</body>
</html>
