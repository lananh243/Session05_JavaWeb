<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/12/2025
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông tin sinh viên</title>
</head>
<body>
<h3>Thông tin của sinh viên</h3>
<table border="1">
    <thead>
    <tr>
        <th>Mã sinh viên</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <c:forEach var="item" items="${students}">
        <tbody>
        <tr>
            <td>${item.id}</td>
            <td>${item.studentName}</td>
            <td>${item.age}</td>
            <td>${item.address}</td>
            <td>
                <form action="EditStudentController" method="get">
                    <input type="hidden" name="id" value="${item.id}"/>
                    <input type="submit" value="Sửa"/>
                </form>
            </td>
        </tr>
        </tbody>
    </c:forEach>
    <c:if test="${empty students}">
        <p>Không có sinh viên nào!</p>
    </c:if>
</table>
</body>
</html>
