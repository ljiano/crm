<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/7/8
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EasyUI demo01</title>
    <script type="text/javascript" src="/jquery-easyui-1.5.5.4/jquery.min.js"></script>
    <script type="text/javascript" src="/jquery-easyui-1.5.5.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/jquery-easyui-1.5.5.4/locale/easyui-lang-zh_CN.js"></script>
    <link type="text/css" rel="stylesheet" href="/jquery-easyui-1.5.5.4/themes/default/easyui.css"/>
    <link type="text/css" rel="stylesheet" href="/jquery-easyui-1.5.5.4/themes/icon.css"/>

    <script type="text/javascript">
        $(function(){
            $("#dd2").dialog();

            $("#dd2").dialog({
                title:'dd3',
                width:200,
                height:200,
                collapsible:true,
            });
        });
    </script>
</head>
<body>
    <div class="easyui-dialog" id="dd1" title="EasyUI Dialog" style="width: 500px;height: 300px;">
        hello world!
    </div>

    <div id="dd2">dd2</div>
    <div id="dd3"></div>

    <div id="dd4" class="easyui-accordion" style="width: 500px;height: 600px;">
        <div title="About" data-options="iconCls:'icon-ok'" style="overflow:auto;padding:10px;">
            <h3 style="color:#0099FF;">11</h3>
            <p>43</p>
        </div>
    </div>

</body>
</html>
