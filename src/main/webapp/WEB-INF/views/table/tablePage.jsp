<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>BootStrap Table使用</title>
    <script src="${ctx}/js/jquery/jquery-3.2.1.min.js"></script>
    <script src="${ctx}/js/bootstrap/bootstrap.js"></script>
    <link href="${ctx}/css/bootstrap/bootstrap.css" rel="stylesheet" />
    <script src="${ctx}/js/bootstrap/table/bootstrap-table.js"></script>
    <link href="${ctx}/css/bootstrap/table/bootstrap-table.css" rel="stylesheet" />
    <script src="${ctx}/js/bootstrap/table/bootstrap-table-zh-CN.js"></script>
    <%--<script src="${ctx}/js/modules/table/tablePage.js"></script>--%>
</head>
<body>
<div class="panel-body" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">
            <form id="formSearch" class="form-horizontal">
                <div class="form-group" style="margin-top:15px">
                    <label class="control-label col-sm-1" for="txt_search_departmentname">部门名称</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_departmentname">
                    </div>
                    <label class="control-label col-sm-1" for="txt_search_statu">状态</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="txt_search_statu">
                    </div>
                    <div class="col-sm-4" style="text-align:left;">
                        <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <div id="toolbar" class="btn-group">
        <button id="btn_add" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
        <button id="btn_edit" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
        </button>
        <button id="btn_delete" type="button" class="btn btn-default">
            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
        </button>
    </div>
        <table id="tb_departments"></table>
    <script type="text/javascript">
        function initTable() {
            //先销毁表格
            $('#tb_departments').bootstrapTable('destroy');
            //初始化表格,动态从服务器加载数据
            $("#tb_departments").bootstrapTable({
                columns: [
                    {field: "name", title: "序号", width: 10 },
                    {field: "sex", title: "zidbh", width: 80 },
                    {field: "age", title: "路段编码", width: 80, align: "center"}
                ],
                method: "get",  //使用get请求到服务器获取数据
                url: window.webboot + "/login/gridTable", //获取数据的Servlet地址
                striped: true,  //表格显示条纹
                pagination: true, //启动分页
                pageSize: 1,  //每页显示的记录数
                pageNumber:1, //当前第几页
                pageList: [5, 10, 15, 20, 25],  //记录数可选列表
                search: false,  //是否启用查询
                showColumns: true,  //显示下拉框勾选要显示的列
                showRefresh: true,  //显示刷新按钮
                sidePagination: "server", //表示服务端请求
                //设置为undefined可以获取pageNumber，pageSize，searchText，sortName，sortOrder
                //设置为limit可以获取limit, offset, search, sort, order
                queryParamsType : "undefined",
                dataField: "result",
                queryParams: function queryParams(params) {   //设置查询参数
                    var param = {
                    };
                    return param;
                },
                onLoadSuccess: function(){  //加载成功时执行
                    //layer.msg("加载成功");
                },
                onLoadError: function(){  //加载失败时执行
                    alert("shibai");
                    //layer.msg("加载数据失败", {time : 1500, icon : 2});
                }
            });
        }

        $(document).ready(function () {
            //调用函数，初始化表格
            initTable();
            window.webboot = "${ctx}";
            //当点击查询按钮的时候执行
            $("#search").bind("click", initTable);
        });
    </script>
</div>
</body>
</html>