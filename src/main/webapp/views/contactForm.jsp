<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>${contact != null ? "Sửa Liên hệ" : "Thêm Liên hệ"}</title>
</head>
<body>
<h2>${contact != null ? "Sửa Liên hệ" : "Thêm Liên hệ"}</h2>
<form action="contacts" method="post">
  <c:if test="${contact != null}">
    <input type="hidden" name="action" value="update"/>
    <input type="hidden" name="id" value="${contact.id}"/>
  </c:if>
  <c:if test="${contact == null}">
    <input type="hidden" name="action" value="create"/>
  </c:if>
  Họ: <input type="text" name="firstName" value="${contact.firstName}" required/><br/><br>
  Tên: <input type="text" name="lastName" value="${contact.lastName}" required/><br/><br>
  Email: <input type="email" name="email" value="${contact.email}" required/><br/><br>
  Điện thoại: <input type="text" name="phone" value="${contact.phone}" required/><br/><br>
  <input type="submit" value="${contact != null ? 'Cập nhật' : 'Thêm mới'}"/>
</form>
<a href="contacts">Quay lại</a>
</body>
</html>
