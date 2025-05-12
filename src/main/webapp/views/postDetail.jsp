<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chi tiết bài viết</title>
</head>
<body>
<h2>${post.title}</h2>
<p><strong>Tác giả: </strong> ${post.author}</p>
<p><strong>Ngày đăng: </strong> ${post.publishDate}</p>
<p><strong>Nội dung: </strong>${post.content}</p>
<a href="blog">Quay lại danh sách</a>
</body>
</html>
