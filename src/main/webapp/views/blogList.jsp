<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách Bài viết</title>
</head>
<body>
<h2>Danh sách Bài viết</h2>
<ul>
  <c:forEach var="post" items="${posts}">
    <li>
      <a href="blog?id=${post.id}">${post.title}</a> - ${post.author} (${post.publishDate})
    </li>
  </c:forEach>
</ul>
</body>
</html>
