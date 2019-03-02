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
                {field:'companyname',title:'公司名称',width:250, align:'left',
                    formatter: function(value, row, index){
                        return '<span title="'+value+'" class="easyui-tooltip">'+value+'</span>';
                    }
                },
                {field:'companycode',title:'公司代码',width:100, align:'center'},
                {field:'address',title:'公司地址',width:200,align:'right'},
                {field:'city',title:'注册城市',width:100,align:'center'},
                {field:'qsdate',title:'注册时间',width:100,align:'center'}
            ]],
            onLoadSuccess: function(){
                $(".easyui-tooltip").tooltip({
                    onShow: function () {
                        $(this).tooltip('tip').css({
                            borderColor: '#000'
                        });
                    }
                });
            }
        })
    });
</script>

<div>
    <table id="companys" style="width:100%;">

    </table>
</div>

<%@ include file="/crm/footer.jsp" %>