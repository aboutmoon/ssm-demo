<%--
  Created by IntelliJ IDEA.
  User: hb
  Date: 4/28/20
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Account List</h3>

    <a href="/account/findAll.do">findAll</a>

    <h3>test add</h3>
<form action="/account/save.do" method="post">
    name: <input type="text" name="name" />
    money: <input type="text" name="money"/>
    <input type="submit" value="save"/>
</form>
</body>
</html>
