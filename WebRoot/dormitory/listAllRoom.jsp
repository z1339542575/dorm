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
<title>房间信息</title>
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
				<table id="table1" class="table table-bordered tab-content">
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
			url : "/dorm/room/getAll.do", 		// 获取表格数据的url
			method : "post",
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
			uniqueId: "dorm_roo_xno",           //每一行的唯一标识，一般为主键列
			columns: [
			 {
              	 checkbox: true, // 显示一个勾选框
          		 }, {
                 field: "dorm_roo_xno",
                 title: "序号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_rno",
                 title: "房号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_pno",
                 title: "楼号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_bnum",
                 title: "床位数",
                 valign: "middle" // 上下居中
             },
             {
                 field: "operate",
                 title: "操作",
                 valign: "middle", // 上下居中
                 formatter: operateFormatter //自定义方法，添加操作按钮
             },
             ],
		});
 		function operateFormatter(value, row, index) {//赋予的参数
     	return [
        '<a class="btn active btn-info btn-sm" onclick="modify(\'' + row.dorm_roo_xno + '\')">更新</a>&nbsp;&nbsp;',
        '<a class="btn active btn-info btn-sm" onclick="del(\'' + row.dorm_roo_xno + '\')">删除</a>&nbsp;&nbsp;',
   		].join('');
   		}
   		function modify(dorm_roo_xno) {
			window.location.href="/dorm/room/modify.do?dorm_roo_xno="+dorm_roo_xno;
		} 
		function del(dorm_roo_xno) {
			$.ajax({
				url : "/dorm/room/del.do",
				type : "POST",
				data : {
					"dorm_roo_xno" : dorm_roo_xno
				},
				dataType : "json",
				success : function(data) {
					if (data == "succeed") {
						layer.msg("删除成功");
						refresh();
					} else
						layer.msg("删除失败", function() {
						});
				},
				error : function() {
				}
			});
		}
		function refresh(){
			$("#table1").bootstrapTable("refreshOptions", {//刷新表单
				pageNumber : 1
			});
		}
	</script>
</html>