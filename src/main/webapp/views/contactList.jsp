<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách Liên hệ</title>
</head>
<body>
<h2>Danh sách Liên hệ</h2>
<a href="contacts?action=add">Thêm Liên hệ</a>
<br><br>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Họ</th>
        <th>Tên</th>
        <th>Email</th>
        <th>Điện thoại</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contact" items="${contacts}">
        <tr>
            <td>${contact.id}</td>
            <td>${contact.firstName}</td>
            <td>${contact.lastName}</td>
            <td>${contact.email}</td>
            <td>${contact.phone}</td>
            <td>
                <a href="contacts?action=edit&id=${contact.id}">Sửa</a>
                <form action="contacts" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete"/>
                    <input type="hidden" name="id" value="${contact.id}"/>
                    <input type="submit" value="Xóa" onclick="return confirm('Xóa liên hệ này?')"/>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
