<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%> 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>学生主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
<link rel="stylesheet" href="web-part/side/sidebar-menu.css" />
<link rel="stylesheet" href="web-part/css/base.css" />
</head>
<body class="bg-a">
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 text-center">
				<h2>
					<i class="fa fa-dropbox" aria-hidden="true"></i> 学生宿舍管理系统
				</h2>
			</div>
			<div class="col-sm-4 text-center text-success">
				<a href="login/deletStu.do?dorm_stu_sno=" +${loginInfoStu.dorm_stu_sno}>安全退出</a> | <span>学生：${loginInfoStu.dorm_stu_sno}</span>
			</div>
		</div>
		<div class="row">
			<h1 class="page-header"></h1>
		</div>
		<!-- 边栏按钮 -->
		<div class="row">
			<div class="col-sm-12">
				<a href="javascript:callside();"><i class="fa fa-bars"></i><i
					class="fa fa-cog"></i></a>&nbsp;欢迎访问
			</div>
		</div>
		<!-- 边栏/中央 -->
		<div class="row">
			<!-- 边栏 -->
			<div class="col-sm-2" id="sidebar">
				<ul class="sidebar-menu">
					<li><a href="javascript:"><i class="fa fa-clone"></i>个人管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="infoStu"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看个人信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>卫生管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listHealth"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看卫生信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>报修管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listMend"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看报修信息</a></li>
							<li><a href="javascript:" view="addMend"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加报修信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>失物管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listLose"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看失物信息</a></li>
							<li><a href="javascript:" view="addLose"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加失物信息</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- 中央 -->
			<div class="col-sm-12" id="main">
				<ul class="nav nav-tabs"></ul>
				<div class="tab-content"></div>
			</div>
		</div>
	</div>
<!-- js -->
	<script src="web-part/easy/js/jquery-3.0.0.js"></script>
	<script src="web-part/bootstrap/js/bootstrap.min.js"></script>
	<script src="web-part/side/sidebar-menu.js"></script>
	<script src="web-part/tabs/bootstrap-closable-tab.js"></script>
	<script src="web-part/layer/layer.js"></script>
	<script src="web-part/easy/js/base.js"></script>
<script>
		//边栏初始化/隐藏
		$.sidebarMenu($(".sidebar-menu"));
		$("#sidebar").hide();
		//边栏呼出/折叠
		function callside() {
			$("#sidebar").slideToggle(250);
			setmain();
		}
		//设置中央宽度
		function setmain() {
			if ($("#main").hasClass("col-sm-12")) {
				$("#main").removeClass("col-sm-12").addClass("col-sm-10");
			} else {
				$("#main").removeClass("col-sm-10").addClass("col-sm-12");
			}
		}
		//打开标签页
		function opentab(obj, flag) {
			var item = {
				closable : flag,
				id : $(obj).attr("view"),
				name : $(obj).text(),
				url : "login/tabOrPop/" + $(obj).attr("view") + ".do"
			};
			closableTab.addTab(item);
		}
		//默认标签页
		opentab($("#sidebar a[view='infoStu']")[0], false);
</script>
</body>
</html>
