<%--
  Created by IntelliJ IDEA.
  User: evgeny
  Date: 2019-05-01
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show card </title>
</head>
<body>
        <%@ page import="logic.Card" %>
        <%Card card = (Card) session.getAttribute("card");%>

        <p>Наименование: <%=card.getName()%></p>
        <p>Количество: <%=card.getQuantity()%></p>
</body>
</html>
