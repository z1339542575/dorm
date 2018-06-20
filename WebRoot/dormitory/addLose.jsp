<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>添加失物信息</title>
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
				<form action="<%=request.getContextPath()%>/lose/addInfo.do"
					method="post">
					<table class="table table-hover table-striped">
						<tbody>
							<tr>
								<td align="right">序号</td>
								<td align="center"><input type="text" id="dorm_lose_lno" name="dorm_lose_lno" placeholder="       --后台自动生成--" disabled="disabled">
								</td>
							</tr>
							<tr>
								<td align="right">失物信息</td>
								<td align="center"><input type="text" id="dorm_lose_info" name="dorm_lose_info" placeholder="    --请输入2~200个字符--" required="true" minlength="2" maxlength="200">
								</td>
							</tr>
							<tr>
								<td align="right">发布人</td>
								<td align="center"><input type="text" id="dorm_lose_name" name="dorm_lose_name" placeholder="    --请输入2~10个字符--" required="true" minlength="2" maxlength="10">
								</td>
							</tr>
							<tr>
								<td align="right">发布时间</td>
								<td align="center"><input type="text" id="dorm_lose_date" name="dorm_lose_date" required="true" >
								</td>
							</tr>
							<tr>
								<td align="right">领取地址</td>
								<td align="center"><input type="text" id="dorm_lose_addr" name="dorm_lose_addr" placeholder="    --请输入2~200个字符--"
									required="true" minlength="2" maxlength="200">
								</td>
							</tr>
							<tr>
								<td align="right">领取状态</td>
								<td align="center"><input type="text" id="dorm_lose_state" name="dorm_lose_state" placeholder="    --默认为未领取状态--" disabled="disabled">
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center"><button type="submit" class="btn btn-info btn-sm">提交添加</button>&nbsp;&nbsp;&nbsp;&nbsp;
									<button type="button" class="btn btn-info btn-sm" onclick="clearAll()">清除数据</button>
								</td>
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
	<script src="web-part/laydate/laydate.js"></script>
	<script src="web-part/vldt/jquery.validate.min.js"></script>
	<script src="web-part/vldt/messages_zh.js"></script>
<script type="text/javaScript">
	laydate.render({
		elem : "#dorm_lose_date",
		type : "datetime"
	});
	function add() {
		$("form").ajaxSubmit(function(data) {
			if (data == "succeed") {
				layer.msg("添加成功");
				clearAll();
			} else
				layer.msg("添加失败", function() {
				});
		});
	}
	$("form").validate({
		submitHandler : function(form) {
			add();
		}
	});
	function clearAll() {
		document.getElementById("dorm_lose_info").value = "";
		document.getElementById("dorm_lose_name").value = "";
		document.getElementById("dorm_lose_date").value = "";
		document.getElementById("dorm_lose_addr").value = "";
	}
</script>
</html>