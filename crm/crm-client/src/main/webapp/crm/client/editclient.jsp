<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/6/24
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="clientform" action="/client/editor" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" id="name" name="name">
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
