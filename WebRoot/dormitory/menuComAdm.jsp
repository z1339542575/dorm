<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>管理员主页</title>
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
<link rel="stylesheet" href="web-part/side/sidebar-menu.css" />
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
				<a href="login/deletAdm.do?dorm_adm_ano=" +${loginInfoAdm.dorm_adm_ano}>安全退出</a> | <span>管理员：${loginInfoAdm.dorm_adm_ano}</span>
			</div>
		</div>
		<div class="row">
			<h1 class="page-header"></h1>
		</div>
		<!-- 边栏按钮 -->
		<div class="row">
			<div class="col-sm-12">
				<a href="javascript:callside();"><i class="fa fa-bars"></i>
				<i class="fa fa-cog"></i></a>&nbsp;欢迎访问
			</div>
		</div>
		<!-- 边栏/中央 -->
		<div class="row">
			<!-- 边栏 -->
			<div class="col-sm-2" id="sidebar">
				<ul class="sidebar-menu">
					<li><a href="javascript:"><i class="fa fa-clone"></i>个人管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="infoAdm"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看个人信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>学生管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllStu"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看全部学生信息</a></li>
							<li><a href="javascript:" view="listBanStu"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看待审核学生信息</a></li>
							<li><a href="javascript:" view="addStu"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加学生信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>卫生管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllHealth"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看全部卫生信息</a></li>
							<li><a href="javascript:" view="addHealth"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加卫生信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>房间管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllRoom"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看全部房间信息</a></li>
							<li><a href="javascript:" view="addRoom"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加房间信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>访客管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllVis"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看访客信息</a></li>
							<li><a href="javascript:" view="addVis"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加访客信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>报修管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllMend"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看全部报修信息</a></li>
							<li><a href="javascript:" view="addMend"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>添加报修信息</a></li>
						</ul></li>
					<li><a href="javascript:"><i class="fa fa-clone"></i>失物管理</a>
						<ul class="sidebar-submenu">
							<li><a href="javascript:" view="listAllLose"
								onclick="opentab(this,true);"><i class="fa fa-square-o"></i>查看全部失物信息</a></li>
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
		opentab($("#sidebar a[view='infoAdm']")[0], false);
</script>
</body>
</html>
