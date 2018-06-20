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
<title>添加管理员信息</title>
<link rel="stylesheet" href="web-part/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="web-part/icon/css/font-awesome.min.css" />
<link rel="stylesheet" href="web-part/side/sidebar-menu.css" />
<link rel="stylesheet" href="web-part/easy/css/base.css" />
</head>
<body class="bg-c">
	<div class="container-fluid">
		<div class="row">&nbsp;</div>
		<div class="row">&nbsp;</div>
		<div class="row">
			<div class="col-sm-12">
				<form action="<%=request.getContextPath() %>/admin/addInfo.do" method="post">
				<table class="table table-hover table-striped">
					<tbody>
						<tr>
							<td align="right">工号</td>
							<td align="center"><input type="text" id ="dorm_adm_ano" name="dorm_adm_ano" placeholder="    --4~10个数字--" required="true" digits="true" minlength="4" maxlength="10"></td>
						</tr><tr>
							<td align="right">姓名</td>
							<td align="center"><input type="text" id ="dorm_adm_name" name="dorm_adm_name" placeholder="    --2~10个字符--" required="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">性别</td>
							<td align="center"><label class="radio-inline">
       					 		<input type="radio" id="dorm_adm_sex" name="dorm_adm_sex" value="男" checked>男</label>
       					 		<label class="radio-inline">
       							<input type="radio" id="dorm_adm_sex" name="dorm_adm_sex" value="女" >女</label></td>
						</tr><tr>
							<td align="right">密码</td>
							<td align="center"><input type="password" id ="dorm_adm_password" name="dorm_adm_password" placeholder="    --4~15个字符--" required="true" minlength="4" maxlength="15"></td>
						</tr><tr >
							<td align="right">权限</td>
							<td align="center"><input type="text" placeholder="    --默认为普通管理员--" disabled="disabled"/></td>
							</tr><tr>
							<td colspan="2" align="center"><button type="submit" class="btn btn-info btn-sm">提交添加</button>&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="button" class="btn btn-info btn-sm" onclick="clearAll()">清除数据</button></td>
						</tr>
					</tbody>
				</table>
			</form>
			</div>
		</div>
	</div>
</body>
	<script src="web-part/easy/js/jquery-3.0.0.js"></script>
	<script src="web-part/bootstrap/js/bootstrap.min.js"></script>
	<script src="web-part/page/pagination.js"></script>
	<script src="web-part/side/sidebar-menu.js"></script>
	<script src="web-part/layer/layer.js"></script>
	<script src="web-part/easy/js/base.js"></script>
	<script src="web-part/easy/js/jquery.time.js"></script>
	<script src="web-part/easy/js/jquery.form.js"></script>
	<script src="web-part/vldt/jquery.validate.min.js"></script>
	<script src="web-part/vldt/messages_zh.js"></script>
	<script type ="text/javaScript">
	function add() {
			$("form").ajaxSubmit(function(data) {
				if(data == "exist"){
					layer.msg("添加失败！该工号已存在", function(){}); 
				}else if(data == "succeed"){
					layer.msg("添加成功");
					clearAll();
				}else if(data == "fail")
					layer.msg("添加失败", function(){}); 
			});
		}
		$("form").validate({
			submitHandler : function(form) {
				add();
			}
		});
	function clearAll(){
		document.getElementById("dorm_adm_ano").value = "";
		document.getElementById("dorm_adm_name").value = "";
		document.getElementById("dorm_adm_password").value = "";
	}
	</script>
</html>