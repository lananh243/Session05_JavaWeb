<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách công việc</title>
</head>
<body>
<h2>Danh sách công việc</h2>
<a href="tasks?action=add">Thêm công việc</a>
<br><br>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Mô tả</th>
        <th>Ngày đến hạn</th>
        <th>Hoàn thành</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="task" items="${tasks}">
        <tr>
            <td>${task.id}</td>
            <td>${task.description}</td>
            <td>${task.dueDate}</td>
            <td><c:if test="${task.completed}">✔</c:if></td>
            <td>
                <a href="tasks?action=edit&id=${task.id}">Sửa</a>
                <form action="tasks" method="post" style="display:inline;">
                    <input type="hidden" name="action" value="delete"/>
                    <input type="hidden" name="id" value="${task.id}"/>
                    <input type="submit" value="Xóa" onclick="return confirm('Xóa công việc này?')"/>
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
