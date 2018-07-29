<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/crm/header.jsp" %>

<script>
    $(function(){
        $("#product").datagrid({
            url:'/product/table',
            method:'get',
            editors: $.fn.datagrid.defaults.editors,
            columns:[[
                {field:'',checkbox:true, width:20},
                {field:'productName',title:'产品名称',sortable:true,align:'left', width:200},
                {field:'removeFlag',title:'是否生效',sortable:true,align:'center', width:80,editor:{type:'checkbox',options:{on:'1',off:'0'}}}
            ]],
            pagination:true,
            pageNumber:1,
            pageSize:10,
            pageList:[10,20,30,50,100,200],
            singleSelect:false,
            rowNumbers:true,
            toolbar:'#tb',
            checkOnSelect:false,
            selectOnCheck:true
        });
    });

</script>
<div id="tb" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
    </div>
</div>
<table id="product" title="产品信息">

</table>
<%@ include file="/crm/footer.jsp" %>