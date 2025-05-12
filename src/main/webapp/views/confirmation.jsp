<%@ page import="com.data.session05_java.ra.model.Student" %>
<%@ page import="com.data.session05_java.ra.model.StudentB2" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Xác Nhận Thông Tin</title>
</head>
<body>
<%
    StudentB2 student = (StudentB2) request.getAttribute("student");
%>

<h1>Xác nhận thông tin sinh viên</h1>
<p>Tên: <%= student.getStudentName() %></p>
<p>Tuổi: <%= student.getAge() %></p>
<p>Địa chỉ: <%= student.getAddress() %></p>
</body>
</html>
