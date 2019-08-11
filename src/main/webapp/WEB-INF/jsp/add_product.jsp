<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>


    <title>Add product</title>
    <%@include file="header.jsp" %>
</head>
<body>
<div class="container" class="col-md-6  text-center">
    <h2 class="text-center">Dodaj nowy produkt</h2>

    <!--
    Spring form ma tę zaletę, że wypełnia wartościami inputów obiekt, który otrzymuje z kontrolera jako atrybut modelu.
    Uzupełniony obiekt jest dotępny dla kontrolera z pozycji atrybutu modelu.
    Nie musimy już tworzyc w kontolerze nowego obiektu i wypełniać go atrybutami z form. Otrzymujemy wypełniony obiekt, gotowy do dalszego przetwarzania

    Data binding - Actually, Spring simply populate properties of @ModelAttribute object with the values of request parameters with the corresponding names
    (in the simpliest case request parameter have the same name as a property, but nested properties are also supported).
    -->

    <form:form method="post" action="/display" modelAttribute="productDto">
        <div class="form-group">
            <form:input class="form-control" path="id" hidden="true"/> <!--//"id" koresponduje z nazwą pola w obiekcie ProductDto-->
        </div>
        <div class="form-group">
            <form:label path="name">Nazwa</form:label>

            <!--"name" koresponduje z nazwą pola name w obiekcie ProductDto. Path wskazuje na pole (property) obiektu atrybutu modelu
            i wypełnia pole inputu wartościa tego propertisa. W naszym przypadku, jesli obiekt atrybutu modelu jest pusty (nowo utworzony)
            to pola inputów będa puste. Jeśli dostarczono wypełniony obiekt atrybutu, to wartości pól pojawią się w polach inputów-->
            <form:input  class="form-control" path="name" required="true" />
        </div>
        <div class="form-group">
            <form:label path="category">Kategoria</form:label>
            <form:input  class="form-control" path="category" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="group">Grupa</form:label>
            <form:input  class="form-control" path="group" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="description">Opis</form:label>
            <form:input  class="form-control" path="description" required="true"/>
        </div>

        <div class="form-group">
            <form:label path="price">Cena</form:label>
            <form:input  class="form-control" path="price" required="true"/>
        </div>
        <form:button type="submit" class="btn btn-primary" value="submit">Submit</form:button>
    </form:form>
</div>
</body>
</html>