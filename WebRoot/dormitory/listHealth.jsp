<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
<head>
<base href="<%=basePath%>">
<title>卫生信息</title>
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/bootstrap/bootstrap-table/bootstrap-table.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
<link rel="stylesheet" href="web-part/side/sidebar-menu.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
</head>
<body class="bg-b">
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-12">
				<table id="table1"
					class="table table-bordered tab-content ">
				</table>
			</div>
		</div>
	</div>
	<script src="web-part/easy/js/jquery-3.0.0.js"></script>
	<script src="web-part/bootstrap/js/bootstrap.min.js"></script>
	<script src="web-part/bootstrap/bootstrap-table/bootstrap-table.js"></script>
	<script src="web-part/bootstrap/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
	<script src="web-part/easy/js/base.js"></script>
	<script src="web-part/easy/js/jquery.time.js"></script>
	<script src="web-part/easy/js/jquery.form.js"></script>
	<script src="web-part/layer/layer.js"></script>
	<script type="text/javaScript">
		$("#table1").bootstrapTable({
			method : "post",
			//contentType:"application/json;charset=utf-8",
			url : "/dorm/health/getAll.do", 		// 获取表格数据的url
			//toolbar:"#toolbar",
			striped : true, 		//表格显示条纹，默认为false
			pagination : true, 		//显示分页组件
			pageNumber : 1,  		//初始化加载第一页
			pageSize : 5,
			pageList : [ 5, 10, 25, 50, 100 ],
			sidePagination : "client", 		// 设置为客户端分页
			//sortable : true,		 //是否启用排序  
			//sortOrder : "asc",		//排序方式 
			showRefresh: true,             //是否显示刷新按钮
			showToggle:true,             //是否显示详细视图和列表视图
			searchAlign:"left",				//搜索框位置
			//buttonsAlign:"left",			//按钮位置
			search : true,					//是否显示客户端查询
			searchOnEnterKey:true,		  //按回车时触发搜索
			showColumns: true,                  //是否显示所有的列
			height : 450,						 //行高
			uniqueId: "dorm_hea_hno",           //每一行的唯一标识，一般为主键列
			columns: [// 渲染列
			{
              checkbox: true, // 显示一个勾选框
          	}, {
                field: "dorm_hea_hno",
                title: "序号",
			    valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_rno",
                 title: "检查房号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_pno",
                 title: "检查楼号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_hea_date",
                 title: "检查时间",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_hea_score",
                 title: "分数",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_hea_remarks",
                 title: "备注",
                 valign: "middle" // 上下居中
             },
             ],
		});
	</script>
</html>