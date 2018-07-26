<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/7/8
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/include/include.jsp"%>
<html>
<head>
    <title>机构信息</title>
    <script type="text/javascript">
        $(function(){
            $("#instmessage").accordion("select", 2)
        });
    </script>
</head>
<body>
    <div id="instmessage" class="easyui-accordion" style="position: absolute;width: 800px; height: 900px;
        top: 0;left: 0;right: 0;bottom: 0;margin: auto;">
        <div id="inst01" data-options="collapsed:false,collapsible:false" title="基本信息" style="height: 300px;">
            <ul class="easyui-tree">
                <li>
                    <span>Foods</span>
                    <ul>
                        <li>
                            <span>Fruits</span>
                            <ul>
                                <li>apple</li>
                                <li>orange</li>
                            </ul>
                        </li>
                        <li>
                            <span>Vegetables</span>
                            <ul>
                                <li>tomato</li>
                                <li>carrot</li>
                                <li>cabbage</li>
                                <li>potato</li>
                                <li>lettuce</li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div id="inst02" data-options="collapsed:false,collapsible:false" title="账户信息" style="height: 300px;">
            <input class="easyui-searchbox" prompt="Enter something here" style="width:300px;">
        </div>
        <div id="inst03" title="联系人信息" data-options="collapsed:false,collapsible:false" style="height: 300px;">

        </div>
    </div>


</body>
</html>
