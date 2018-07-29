<%--
  Created by IntelliJ IDEA.
  User: jb.liang
  Date: 2018/7/25
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/crm/header.jsp" %>

<script type="text/javascript">
    $(function(){
        $("#companys").datagrid({
            url:'/company/table',
            method:'get',
            pagination:true,
            rownumbers:true,
            singleSelect:true,
            pageNumber:1,
            pageSize:20,
            pageList:[10,20,30,50,100,200],
            sortName:'companyname',
            queryParams:{'total':'${total}'},
            columns:[[
                {field:'guid',title:'Guid',width:100, align:'left'},
                {field:'companyname',title:'公司名称',width:100, align:'left',sortable:true},
                {field:'companycode',title:'公司代码',width:100, align:'center'},
                {field:'address',title:'公司地址',width:100,align:'right'},
                {field:'city',title:'注册城市',width:100,align:'center'},
                {field:'qsdate',title:'注册时间',width:100,align:'center'}
            ]],
        })
    });
</script>

<div>
    <%--<table id="companys" class="easyui-datagrid" title="企业信息" style="width:100%;"--%>
           <%--data-options="rownumbers:true,singleSelect:true,pagination:true,url:'/company/table',method:'get'">--%>
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th data-options="field:'guid',align:'left'" width="20%">Guid</th>--%>
            <%--<th data-options="field:'companyname',align:'left'" width="25%">公司名称</th>--%>
            <%--<th data-options="field:'companycode',align:'center'" width="10%">公司代码</th>--%>
            <%--<th data-options="field:'address',align:'left'" width="25%">公司地址</th>--%>
            <%--<th data-options="field:'city',align:'center'" width="10%">注册城市</th>--%>
            <%--<th data-options="field:'qsdate',align:'center'" width="10%">注册时间</th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
    <%--</table>--%>

    <table id="companys" style="width:100%;">

    </table>
</div>

<%@ include file="/crm/footer.jsp" %>