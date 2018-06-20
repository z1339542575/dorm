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
<title>学生注册</title>
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
				<h3>
					<i class="fa fa-dropbox"></i> 学生宿舍管理系统
				</h3>
			</div>
		</div>
		<div class="row">
			<h1 class="page-header"></h1>
		</div>
		<!-- 登陆表单 -->
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4">
				<form class="panel panel-primary" action="<%=request.getContextPath() %>/student/addRegister.do"
					method="post">
					<div class="panel-heading text-center">学生注册</div>
					<div class="panel-body">
						<div>学号</div>
						<input type="text" name="dorm_stu_sno" class="input-sm form-control"
							placeholder="       --请输入4~10个数字--" required="true" digits="true" minlength="4" maxlength="10" />
						<div>班号</div>
						<input type="text" name="dorm_stu_cno" class="input-sm form-control"
							placeholder="       --请输入4~10个数字--" required="true" digits="true" minlength="4" maxlength="10" />
						<div>姓名</div>
						<input type="text" name="dorm_stu_name" class="input-sm form-control"
							placeholder="       --请输入2~10个字符--" required="true" minlength="2" maxlength="10" />
						<div>性别</div>
							<label class="radio-inline">
       					 	<input type="radio" id="dorm_stu_sex" id="dorm_stu_sex" name="dorm_stu_sex" value="男" checked>男</label>
       					 	<label class="radio-inline">
       						<input type="radio" id="dorm_stu_sex" id="dorm_stu_sex" name="dorm_stu_sex" value="女" >女</label>
						<div>房号</div>
						<input type="text" name="dorm_roo_rno" class="input-sm form-control"
							placeholder="       --请输入2~10个数字--" required="true" digits="true" minlength="2" maxlength="10" />
						<div>专业</div>
						<input type="text" name="dorm_stu_specialty" class="input-sm form-control"
							placeholder="       --请输入2~10个字符--" required="true" minlength="2" maxlength="10" />
						<div>密码</div>
						<input type="text" class="input-sm form-control"
							placeholder="    --默认123abc，注册通过后可修改--" disabled="disabled"/>
						<div>&nbsp;</div>
						<div class="text-center">
							<button type="submit" class="btn btn-primary ">提交注册</button>
							<button class="btn btn-primary" onclick="ret()">返回登录</button>
						</div>
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
			if (data == "succeed") {
				//layer.msg("注册成功！等管理员审核后可登陆系统");
				layer.confirm('注册成功！等管理员审核后可登陆系统', {btn: ['确定']},function(){
					open();
  				});
			}else if(data == "fail") {
				layer.msg("添加失败", function(){});
			}else{
				layer.msg("注册失败！该学号已存在，可能未被审核", function(){});
			}
		});
	}
	//后台重定向页面
	function open(){
		window.location.href="/dorm/login/tabOrPop/loginStu.do";
	}
	function ret(){
		window.location.href="/dorm/login/tabOrPop/loginStu.do";
	}
</script>
</body>
</html>
