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
<title>访客信息</title>
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
			url : "/dorm/visitor/getAll.do", 		// 获取表格数据的url
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
			uniqueId: "dorm_vis_vno",           //每一行的唯一标识，一般为主键列
			columns: [// 渲染列
			{
              checkbox: true, // 显示一个勾选框
          	}, {
                field: "dorm_vis_vno",
                title: "序号",
			    valign: "middle" // 上下居中
             }, {
                 field: "dorm_vis_name",
                 title: "访客姓名",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_vis_sex",
                 title: "访客性别",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_roo_pno",
                 title: "来访楼号",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_vis_date",
                 title: "来访时间",
                 valign: "middle" // 上下居中
             }, {
                 field: "dorm_vis_remarks",
                 title: "备注",
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
        '<a class="btn active btn-info btn-sm" onclick="modify(\'' + row.dorm_vis_vno + '\')">更新</a>&nbsp;&nbsp;',
        '<a class="btn active btn-info btn-sm" onclick="del(\'' + row.dorm_vis_vno + '\')">删除</a>&nbsp;&nbsp;',
   		].join('');
   		}
   		function modify(dorm_vis_vno) {
			window.location.href="/dorm/visitor/modify.do?dorm_vis_vno="+dorm_vis_vno;
		} 
		function del(dorm_vis_vno) {
			$.ajax({
				url : "/dorm/visitor/del.do",
				type : "POST",
				data : {
					"dorm_vis_vno" : dorm_vis_vno
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
	   /*  function fmt(val) {
			return $.msfmt.todate(val, false, 8);
		} */

	</script>
</html>