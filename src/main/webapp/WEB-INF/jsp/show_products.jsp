<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@include file="header.jsp"%>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

</head>

<body>

<div class="container">
    <table class="table table-striped">
        <tr>
            <th>#</th>
            <th>Nazwa</th>
            <th>Kategoria</th>
            <th>Grupa</th>
            <th>Cena</th>
            <th>Opis</th>
            <th>Akcja</th>
        </tr>

        <c:forEach items="${products}" var="product" varStatus="lp">
            <tr>
                <td>${lp.count}</td>
                <td>${product.name}</td>
                <td>${product.category}</td>
                <td>${product.group}</td>
                <td>${product.price}</td>
                <td>${product.description}</td>
                <td>
                    <form action="/deleteProduct" method="post" onclick="return confirm('Are you sure you want to delete this product?');">
                        <input hidden name="id" value="${product.id}">
                        <button>
                            <i class="fas fa-trash"></i>
                        </button>
                    </form>
                    <form action="/editProduct" method="post" >
                        <input hidden name="id" value="${product.id}">
                        <button>
                            <i class="fas fa-cog"></i>
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>