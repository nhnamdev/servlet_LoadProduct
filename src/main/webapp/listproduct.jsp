<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh sách sản phẩm</title>
    <style>
        /* Định dạng toàn trang */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f9f9f9;
            color: #333;
        }
        /* Định dạng tiêu đề */
        .header {
            background-color: #4CAF50;
            color: #fff;
            padding: 15px;
            text-align: center;
        }
        /* Định dạng container của danh sách sản phẩm */
        .product-list {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin: 20px;
        }
        /* Định dạng thẻ sản phẩm */
        .product-item {
            background-color: #fff;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 200px;
            margin: 15px;
            padding: 20px;
            text-align: center;
            transition: transform 0.3s;
        }
        /* Hiệu ứng hover */
        .product-item:hover {
            transform: scale(1.05);
        }
        /* Định dạng hình ảnh sản phẩm */
        .product-item img {
            width: 100%;
            height: auto;
            border-radius: 8px;
            margin-bottom: 10px;
        }
        /* Tên sản phẩm */
        .product-name {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
            color: #4CAF50;
        }
        /* Giá sản phẩm */
        .product-price {
            font-size: 16px;
            color: #888;
        }
        .product-item img {
            width: 200px;
            height: 200px;
        }
    </style>
</head>
<body>
<!-- Phần tiêu đề -->
<div class="header">
    <h1>Danh sách sản phẩm</h1>
</div>

<!-- Danh sách sản phẩm -->
<div class="product-list">
    <!-- Sản phẩm 1 -->

    <c:forEach var="p" items="${data}">
    <div class="product-item">
        <img src="${p.img}" alt="Sản phẩm A">
        <div class="product-name">${p.title}</div>
        <div class="product-price">${p.price}</div>
    </div>
    </c:forEach>
</div>
</body>
</html>
