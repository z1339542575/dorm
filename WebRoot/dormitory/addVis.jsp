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
<title>添加访客信息</title>
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
				<form action="<%=request.getContextPath()%>/visitor/addInfo.do"
					method="post">
					<table class="table table-hover table-striped">
						<tbody>
							<tr>
								<td align="right">序号</td>
								<td align="center"><input type="text" id="dorm_vis_vno" name="dorm_vis_vno" placeholder="       --后台自动生成--" disabled="disabled">
								</td>
							</tr>
							<tr>
								<td align="right">访客姓名</td>
								<td align="center"><input type="text" id="dorm_vis_name" name="dorm_vis_name" placeholder="    --请输入2~10个字符--" required="true" minlength="2" maxlength="10">
								</td>
							</tr>
							<tr>
								<td align="right">访客性别</td>
								<td align="center"><label class="radio-inline">
									<input type="radio" id="dorm_vis_sex" name="dorm_vis_sex" value="男"checked>男</label>
									<label class="radio-inline">
									<input type="radio" id="dorm_vis_sex" name="dorm_vis_sex" value="女">女</label>
								</td>
							</tr>
							<tr>
								<td align="right">来访时间</td>
								<td align="center"><input type="text" id="dorm_vis_date" name="dorm_vis_date" required="true" >
								</td>
							</tr>
							<tr>
								<td align="right">来访楼号</td>
								<td align="center"><input type="text" id="dorm_roo_pno" name="dorm_roo_pno" placeholder="    --请输入1~10个数字--"
									required="true" digits="true" minlength="1" maxlength="10">
								</td>
							</tr>
							<tr>
								<td align="right">备注</td>
								<td align="center"><input type="text" id="dorm_vis_remarks" name="dorm_vis_remarks" placeholder="    --请输入0~200个字符--" maxlength="200">
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
		elem : "#dorm_vis_date",
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
		document.getElementById("dorm_vis_name").value = "";
		document.getElementById("dorm_vis_date").value = "";
		document.getElementById("dorm_roo_pno").value = "";
		document.getElementById("dorm_vis_remarks").value = "";
	}
</script>
</html>