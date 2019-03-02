<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/crm/proinclude.jsp" %>
    <style>
        /*
                author :前端一枚  努力学习中 qq：815183231;
        */

        /*简单粗暴重置默认样式===============================*/
        * {
            margin: 0;
            padding: 0;
        }

        img {
            border: 0;
        }

        .easing-menu ul, li {
            list-style-type: none;
        }

        .easing-menu ul li a {
            color: #00007F;
            text-decoration: none;
        }

        .easing-menu ul li a:hover {
            color: #bd0a01;
            text-decoration: underline;
        }

        .treebox {
            width: 193px;
            margin: 0 auto;
            background-color: #1a6cb9;
        }

        .easing-menu {
            overflow: hidden;
            border-color: #ddd;
            border-style: solid;
            border-width: 0 1px 1px;
        }

        /*第一层*/
        .easing-menu li.level1 > a {
            display: block;
            height: 45px;
            line-height: 45px;
            color: #fff;
            padding-left: 50px;
            border-bottom: 1px solid #000;
            font-size: 16px;
            position: relative;
            transition: all .5s ease 0s;
        }

        .easing-menu li.level1 a:hover {
            text-decoration: none;
            background-color: #326ea5;
        }

        .easing-menu li.level1 a.current {
            background: #0f4679;
        }

        /*============修饰图标*/
        .ico {
            width: 20px;
            height: 20px;
            display: block;
            position: absolute;
            left: 20px;
            top: 10px;
            background-repeat: no-repeat;
            background-image: url(/crm/script/images/ico1.png);
        }

        /*============小箭头*/
        .level1 i {
            width: 20px;
            height: 10px;
            background-image: url(/crm/script/images/arrow.png);
            background-repeat: no-repeat;
            display: block;
            position: absolute;
            right: 20px;
            top: 20px;
        }

        .level1 i.down {
            background-position: 0 -10px;
        }

        .ico1 {
            background-position: 0 0;
        }

        .ico2 {
            background-position: 0 -20px;
        }

        .ico3 {
            background-position: 0 -40px;
        }

        .ico4 {
            background-position: 0 -60px;
        }

        .ico5 {
            background-position: 0 -80px;
        }

        /*第二层*/
        .easing-menu li ul {
            overflow: hidden;
        }

        .easing-menu li ul.level2 {
            display: none;
            background: #0f4679;
        }

        .easing-menu li ul.level2 li a {
            display: block;
            height: 45px;
            line-height: 45px;
            color: #fff;
            text-indent: 60px;
            /*border-bottom: 1px solid #ddd; */
            font-size: 14px;
            transition: all 1s ease 0s;
        }

    </style>

    <script type="text/javascript">
        $(function () {
            $(".treebox .level1>a").click(function () {
                var cls = $(this).attr('class');
                if (!cls || cls.indexOf('current') <= -1) {
                    $(this).addClass('current')   //给当前元素添加"current"样式
                        .find('i').addClass('down')   //小箭头向下样式
                        .parent().next().slideDown('slow', 'easeOutQuad')  //下一个元素显示
                        .parent().siblings().children('a').removeClass('current')//父元素的兄弟元素的子元素去除"current"样式
                        .find('i').removeClass('down').parent().next().slideUp('slow', 'easeOutQuad');//隐藏
                    return false; //阻止默认时间
                } else {
                    $(this).removeClass('current')   //给当前元素添加"current"样式
                        .find('i').removeClass('down')   //小箭头向下样式
                        .parent().next().slideUp('slow', 'easeOutQuad')  //下一个元素显示
                }

            });
        });
    </script>
</head>
<body>
<div class="easyui-layout" style="width:1000px;min-height: 800px;margin: auto">
    <div data-options="region:'north'" style="height:50px;"></div>
    <!-- <div data-options="region:'south',split:true" style="height:50px;"></div> -->
    <!-- <div data-options="region:'east',split:true" title="East" style="width:100px;"></div> -->
    <div data-options="region:'west',split:true" title=" " style="width:200px;">
        <div class="treebox">
            <ul class="easing-menu">
                <li class="level1">
                    <a href="#none"><em class="ico ico1"></em>数据中心<i></i></a>
                    <ul class="level2">
                        <li><a href="/crm/listcompanys.jsp">企业信息</a></li>
                        <li><a href="/crm/product/productlist.jsp">产品管理</a></li>
                        <li><a href="/crm/user/userlist.jsp">用户管理</a></li>
                    </ul>
                </li>
                <li class="level1">
                    <a href="#none"><em class="ico ico4"></em>客户管理<i></i></a>
                    <ul class="level2">
                        <li><a href="javascript:;">我的客户</a></li>
                    </ul>
                </li>
                <li class="level1">
                    <a href="#none"><em class="ico ico3"></em>运营中心<i></i></a>
                    <ul class="level2">
                        <li><a href="javascript:;">分期管理</a></li>
                        <li><a href="javascript:;">合同管理</a></li>
                        <li><a href="javascript:;">路演管理</a></li>
                        <li><a href="javascript:;">资金流水</a></li>
                    </ul>
                </li>
                <li class="level1">
                    <a href="#none"><em class="ico ico2"></em>个人中心<i></i></a>
                    <ul class="level2">
                        <li><a href="javascript:;">我的客户</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div data-options="region:'center'">
			

