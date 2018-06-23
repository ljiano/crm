<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 2018/6/4
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<a href="/crm/user/edituser.jsp">新增</a>
<table>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>状态</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="index">
    <tr>
        <td>${index.count}</td>
        <td>${user.username}</td>
        <td>${user.sex}</td>
        <td>${user.removeFlag}</td>
        <td>
            <a href="">编辑</a>
            <a href="/user/delete/${user.id}">删除</a>
        </td>
    </tr>
    </c:forEach>
</table>



</body>
</html>
