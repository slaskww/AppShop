<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>


<title>Add product</title>
    <%@include file="header.jsp"%>
</head>
<body>
<div class="container" class="col-md-6  text-center">
    <h2 class="text-center">Dodaj nowy produkt</h2>
    <form:form method="post"  action="/display" modelAttribute="productDto">
    <div class="form-group">
        <input type="number" class="form-control" id="id" name="id" hidden="true">
    </div>
    <div class="form-group">
        <label>Nazwa</label>
        <input type="text" class="form-control" id="name" name="name" required>
    </div>
    <div class="form-group">
        <label >Kategoria</label>
        <input type="text" class="form-control" id="category" name="category" required>
    </div>
    <div class="form-group">
        <label >Typ</label>
        <input type="text" class="form-control" id="group" name="group" required>
    </div>

    <div class="form-group">
        <label >Cena</label>
        <input type="number" class="form-control" id="price" name="price" required>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
</body>
</html>