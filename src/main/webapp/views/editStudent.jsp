<%@ page import="com.data.session05_java.ra.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/12/2025
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sửa Sinh Viên</title>
</head>
<body>
    <%
        Student student = (Student) request.getAttribute("student");

    %>

    <h2>Sửa Thông Tin Sinh Viên</h2>
    <form action="EditStudentController" method="post">
        <input type="hidden" name="id" value="<%= student.getId() %>"/>
        Tên: <input type="text" name="name" value="<%= student.getStudentName() %>"/><br/>
        Tuổi: <input type="number" name="age" value="<%= student.getAge() %>"/><br/>
        Địa chỉ: <input type="text" name="address" value="<%= student.getAddress() %>"/><br/>
        <input type="submit" value="Lưu Thay Đổi"/>
    </form>
</body>
</html>
