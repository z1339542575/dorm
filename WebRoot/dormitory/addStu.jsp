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
<title>添加学生信息</title>
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
				<form action="<%=request.getContextPath() %>/student/addInfo.do" method="post">
				<table class="table table-hover table-striped">
					<tbody>
						<tr>
							<td align="right">学号</td>
							<td align="center"><input type="text" id="dorm_stu_sno" name="dorm_stu_sno" placeholder="    --请输入4~10个数字--" required="true" digits="true" minlength="4" maxlength="10"></td>
						</tr><tr>
							<td align="right">班号</td>
							<td align="center"><input type="text" id="dorm_stu_cno" name="dorm_stu_cno" placeholder="    --请输入4~10个数字--" required="true" digits="true" minlength="4" maxlength="10"></td>
						</tr><tr>
							<td align="right">姓名</td>
							<td align="center"><input type="text" id="dorm_stu_name" name="dorm_stu_name" placeholder="    --请输入2~10个字符--" required="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">性别</td>
							<td align="center"><label class="radio-inline">
       					 		<input type="radio" id="dorm_stu_sex" id="dorm_stu_sex" name="dorm_stu_sex" value="男" checked>男</label>
       					 		<label class="radio-inline">
       							<input type="radio" id="dorm_stu_sex" id="dorm_stu_sex" name="dorm_stu_sex" value="女" >女</label></td>
						</tr><tr>
							<td align="right">房号</td>
							<td align="center"><input type="text" id="dorm_roo_rno" name="dorm_roo_rno" placeholder="    --请输入2~10个数字--" required="true" digits="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">专业</td>
							<td align="center"><input type="text" id="dorm_stu_specialty" name="dorm_stu_specialty" placeholder="    --请输入2~10个字符--" required="true" minlength="2" maxlength="10"></td>
						</tr><tr>
							<td align="right">密码</td>
							<td align="center"><input type="text" placeholder="    --默认123abc，添加通过后可修改--" disabled="disabled"/></td>
						</tr><tr>
							<td align="right">状态</td>
							<td align="center"><input type="text" placeholder="    --默认审核通过--" disabled="disabled"/></td>
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
					layer.msg("添加失败！该工号已存在");
				}else if(data == "succeed"){
					layer.msg("添加成功");
					clearAll();
				}else if(data == "fail")
					layer.msg("添加失败");
			});
		}
		$("form").validate({
			submitHandler : function(form) {
				add();
			}
		});
	function clearAll(){
		document.getElementById("dorm_stu_sno").value = "";
		document.getElementById("dorm_stu_cno").value = "";
		document.getElementById("dorm_stu_name").value = "";
		document.getElementById("dorm_roo_rno").value = "";
		document.getElementById("dorm_stu_specialty").value = "";
	}
	</script>
</html>