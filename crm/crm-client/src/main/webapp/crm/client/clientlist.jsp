<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/6/24
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>客户</title>
</head>
<script type="text/javascript" src="/crm/script/js/jquery-1.11.3.min.js"></script>

<body>
<a href="/crm/client/editclient.jsp">新增</a>
<table>
    <tr>
        <td>序号</td>
        <td>客户名称</td>
        <td>操作</td>
    </tr>
    ${fn:length(clients)}
    <c:forEach items="${clients}" var="client" varStatus="index">
        <tr>
            <td>${index.step}</td>
            <td>${client.name}</td>
            <td>
                <a href="">编辑</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
