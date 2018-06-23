<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/6/18
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
<form id="userform" action="/user/editor" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" id="username" name="username">
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="radio" name="sex" value="1"> 男
                <input type="radio" name="sex" value="2"> 女
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="添加">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
