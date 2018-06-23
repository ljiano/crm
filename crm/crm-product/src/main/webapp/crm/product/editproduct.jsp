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
    <title>新增产品</title>
</head>
<body>
<form id="productform" action="/product/editor" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td>
                <input type="text" id="productName" name="productName">
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
