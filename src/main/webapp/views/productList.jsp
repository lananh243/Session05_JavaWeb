<%@ page import="com.data.session05_java.ra.controller.ProductController" %>
<%@ page import="com.data.session05_java.ra.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<%
    ProductController controller = new ProductController();
    List<Product> products = controller.getProducts();
%>

<h1>Danh sách sản phẩm</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
    </tr>
    <%
        for (Product product : products) {
    %>
    <tr>
        <td><%= product.getId() %></td>
        <td><%= product.getProductName() %></td>
        <td><%= product.getPrice() %></td>
        <td><%= product.getDescription() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
