<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Công Việc</title>
</head>
<body>
<h2>${task != null ? "Sửa công việc" : "Thêm công việc"}</h2>
<form action="tasks" method="post">
    <c:if test="${task != null}">
        <input type="hidden" name="action" value="update"/>
        <input type="hidden" name="id" value="${task.id}"/>
    </c:if>
    <c:if test="${task == null}">
        <input type="hidden" name="action" value="create"/>
    </c:if>
    Mô tả: <input type="text" name="description" value="${task.description}" required/><br/><br>
    Ngày đến hạn: <input type="text" name="dueDate" value="${task.dueDate}" required/><br/><br>
    Hoàn thành: <input type="checkbox" name="completed" <c:if test="${task.completed}">checked</c:if>/><br/><br>
    <input type="submit" value="${task != null ? 'Cập nhật' : 'Thêm mới'}"/>
</form>
<a href="tasks">Quay lại</a>
</body>
</html>
