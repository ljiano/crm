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
        var pager = $("#companys").datagrid("getPager");
    });
</script>

<div>
    <table id="companys" class="easyui-datagrid" title="企业信息" style="width:100%;"
           data-options="rownumbers:true,singleSelect:true,pagination:true,url:'/company/table',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'guid',align:'left'" width="20%">Guid</th>
            <th data-options="field:'companyname',align:'left'" width="25%">公司名称</th>
            <th data-options="field:'companycode',align:'center'" width="10%">公司代码</th>
            <th data-options="field:'address',align:'left'" width="25%">公司地址</th>
            <th data-options="field:'city',align:'center'" width="10%">注册城市</th>
            <th data-options="field:'qsdate',align:'center'" width="10%">注册时间</th>
        </tr>
        </thead>
    </table>
</div>

<%@ include file="/crm/footer.jsp" %>