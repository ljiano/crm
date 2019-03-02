<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/crm/header.jsp" %>

<script>
    $(function () {
        $("#user").datagrid({
            url: '/user/table',
            method: 'get',
            editors: $.fn.datagrid.defaults.editors,
            columns: [[
                {field: '', checkbox: true, width: 20},
                {field: 'username', title: '姓名', sortable: true, align: 'left', width: 200},
                {
                    field: 'sex', title: '性别', sortable: true, align: 'left', width: 200,
                    formatter: function (value) {
                        if (value == 1) {
                            return "男";
                        } else if (value == 2) {
                            return "女";
                        }
                    }
                },
                {
                    field: 'removeFlag',
                    title: '是否生效',
                    sortable: true,
                    align: 'center',
                    width: 80,
                    editor: {type: 'checkbox', options: {on: '1', off: '0'}},
                    formatter: function (value) {
                        if (value == 1) {
                            return "是";
                        } else if (value == 2) {
                            return "否";
                        }
                    }
                }
            ]],
            pagination: true,
            pageNumber: 1,
            pageSize: 10,
            pageList: [10, 20, 30, 50, 100, 200],
            singleSelect: false,
            rowNumbers: true,
            toolbar: '#tb',
            checkOnSelect: false,
            selectOnCheck: true
        });
    });

</script>
<div id="tb" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
    </div>
</div>
<table id="user" title="用户信息">

</table>
<%@ include file="/crm/footer.jsp" %>