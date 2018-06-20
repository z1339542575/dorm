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
<title>学生登陆</title>
<!-- css -->
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
</head>
<body>
	<div class="container-fluid">
		<!-- 标题 -->
		<div class="row">&nbsp;</div>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 text-center lead">
				<h2>
					<i class="fa fa-dropbox" aria-hidden="true"></i> 学生宿舍管理系统
				</h2>
			</div>
		</div>
		<div class="row">
			<h1 class="page-header"></h1>
		</div>
		<!-- 登陆表单 -->
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4">
				<form class="panel panel-primary" action="<%=request.getContextPath() %>/student/login.do" method="post">
					<div class="panel panel-heading text-center ">学生登陆</div>
					<div class="panel panel-body">
						<div>学号</div>
							<input type="text" name="dorm_stu_sno" class="input-sm form-control"
								placeholder="请输入4~10个数字" required="true" digits="true" minlength="4" maxlength="15" />
						<div>密码</div>
							<input type="password" name="dorm_stu_password" class="input-sm form-control"
								placeholder="请输入4~15个字符" required="true" minlength="4"maxlength="15" />
					</div>
					<div class="text-center">
						<div class="btn-group">
					    	<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown">切换登录方式
					    		<span class="caret"></span></button>
					    	<ul class="dropdown-menu">
					        	<li><a href="/dorm/login/tabOrPop/loginAdm.do" >管理员登录</a></li>
					        </ul></div>
					    	<button class="btn btn-info" onclick="regi()">学生注册</button>
					    <div>&nbsp;</div>
						<button type="submit" class="btn btn-primary btn-block">提交登陆</button>
					 </div>
				</form>
			</div>
		</div>
	</div>
<!-- js -->
	<script src="web-part/easy/js/jquery-3.0.0.js"></script>
	<script src="web-part/bootstrap/js/bootstrap.min.js"></script>
	<script src="web-part/page/pagination.js"></script>
	<script src="web-part/layer/layer.js"></script>
	<script src="web-part/easy/js/base.js"></script>
	<script src="web-part/easy/js/jquery.time.js"></script>
	<script src="web-part/easy/js/jquery.form.js"></script>
	<script src="web-part/vldt/jquery.validate.min.js"></script>
	<script src="web-part/vldt/messages_zh.js"></script>
<script>
	//表单验证
	$("form").validate({
		submitHandler : function(form) {
			login();
		}
	});
	//后台校验
	function login() {
		$("form").ajaxSubmit(function(data) {
			if (data == "正常") {
				layer.msg("登陆成功");
				view();
				open();
			}else if(data == "fail") {
				layer.msg("账号或密码错误", function(){});
			}else{
				layer.msg("该账号未通过审核或已被禁用", function(){});
			}
		});
	}
	//把用户信息放入session域
	function view() {
		$.post("/dorm/login/selectRightsStu.do", {}, function(date) {
		});
	}
	//后台重定向页面
	function open(){
		window.location.href="/dorm/login/tabOrPop/menuStu.do";
	}
	//后台重定向页面
	function regi(){
		window.location.href="/dorm/login/tabOrPop/register.do";
	}
</script>
</body>
</html>
