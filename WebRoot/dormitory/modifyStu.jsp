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
<title>修改数据</title>
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
<link rel="stylesheet" href="web-part/side/sidebar-menu.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
</head>  
<body class="bg-b">
	<div class="container-fluid">
		<div class="row">&nbsp;</div>
		<div class="row">&nbsp;</div>
		<div class="row">
			<div class="col-sm-12">
				<form action="<%=request.getContextPath() %>/student/update.do" method="post">
				<table class="table table-striped">
						<tr>
							<td align="right">学号</td>
							<td align="center"><input type="text" value="${add.dorm_stu_sno}" disabled="disabled"></td>
						</tr><tr>
							<td align="right">班号</td>
							<td align="center"><input type="text" name="dorm_stu_cno" value="${add.dorm_stu_cno}" placeholder="       --请输入4~10个数字--" required="true" digits="true" minlength="4" maxlength="10"></td>
						</tr><tr>
							<td align="right">姓名</td>
							<td align="center"><input type="text" name="dorm_stu_name" value="${add.dorm_stu_name}" placeholder="    --2~10个字符--" required="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">性别</td>
							<td align="center"><input type="text" name="dorm_stu_sex" value="${add.dorm_stu_sex}" placeholder="    --1~2个字符--" required="true" minlength="1" maxlength="2"></td>
						</tr><tr>
							<td align="right">房号</td>
							<td align="center"><input type="text" name="dorm_roo_rno" value="${add.dorm_roo_rno}" placeholder="       --请输入2~10个数字--" required="true" digits="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">专业</td>
							<td align="center"><input type="text" name="dorm_stu_specialty" value="${add.dorm_stu_specialty}" placeholder="    --请输入2~10个字符--" required="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">密码</td>
							<td align="center"><input type="text" name="dorm_stu_password" value="${add.dorm_stu_password}" placeholder="    --4~15个字符--" required="true" minlength="4" maxlength="15"></td>
						</tr><tr>
							<td colspan="2" align="center"><input type="hidden" name="dorm_stu_sno" value="${add.dorm_stu_sno}">
								<button type="submit" class="btn btn-info btn-sm" >提交更新</button>
								<button class="btn btn-info btn-sm" onclick="retu()">返回</button>
						</tr>
				</table>
			</form>
			</div>
		</div>
	</div>
</body>
	<script src="web-part/easy/js/jquery-3.0.0.js"></script>
	<script src="web-part/bootstrap/js/bootstrap.min.js"></script>
	<script src="web-part/page/pagination.js"></script>
	<script src="web-part/layer/layer.js"></script>
	<script src="web-part/easy/js/base.js"></script>
	<script src="web-part/easy/js/jquery.time.js"></script>
	<script src="web-part/easy/js/jquery.form.js"></script>
	<script src="web-part/vldt/jquery.validate.min.js"></script>
	<script src="web-part/vldt/messages_zh.js"></script>

	<script type ="text/javaScript">
	function add() {
		$("form").ajaxSubmit(function(data) {
			if(data == "succeed"){
				layer.confirm('更新成功！', {btn: ['确定']},function(){
					retu();
  				});
			}else if(data == "fail")
				layer.msg("更新失败", function(){});
			});
		}
		$("form").validate({
			submitHandler : function(form) {
				add();
			}
		});
	function retu() {
		window.location.href="/dorm/login/tabOrPop/listAllStu.do";
	} 
	</script>
</html>