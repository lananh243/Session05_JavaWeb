<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

                <form action="DeleteStudentController" method="post" onsubmit="return confirm('Bạn có chắc chắn muốn xóa sinh viên này không?');">
                    <input type="hidden" name="id" value="${item.id}"/>
                    <input type="submit" value="Xóa"/>
                </form>
            </td>
        </tr>
        </tbody>
    </c:forEach>
</table>

<c:if test="${empty students}">
    <p>Không có sinh viên nào!</p>
</c:if>
<br><br>
<!-- PHÂN TRANG -->
<div>
    <c:if test="${currentPage > 1}">
        <a href="bt4?page=${currentPage - 1}">Trước</a>
    </c:if>

    <span>Trang ${currentPage} / ${totalPages}</span>

    <c:if test="${currentPage < totalPages}">
        <a href="bt4?page=${currentPage + 1}">Tiếp</a>
    </c:if>
</div>
</body>
</html>
