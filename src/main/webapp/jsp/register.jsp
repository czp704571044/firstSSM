<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>注册</title>
	<script src="${pageContext.request.contextPath}/reference/jquery.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/reference/bootstrap.css">
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Register.css">
</head>
<body>
<div>

		<div class="container">
			<h3 class="Register-welcome">欢迎来到注册页面</h3>
	<form class="form-horizontal" action="${pageContext.request.contextPath }/user/register.do" method="post">
		<div class="form-group">
			<label class="col-lg-4 control-label">用户名：</label>
            <div class="col-lg-8">
            <input type="text" name="username"  class="form-control" placeholder="请输入要注册的用户名">     
        </div>
		</div>
		<div class="form-group">		
			<label class="col-lg-4 control-label">密码：</label>
            <div class="col-lg-8">
            <input type="text" name="password"  class="form-control" placeholder="请输入要注册的密码">
            </div>
		</div>
		<div class="form-group">	
			<label class="col-lg-4 control-label">重复密码：</label>
            <div class="col-lg-8">
            <input type="text" name="password1"  class="form-control" placeholder="请输入要注册的重复密码">
            </div>
		</div>
            <div class="form-group">		
			<label class="col-lg-4 control-label">真实姓名：</label>       
            <div class="col-lg-8">
            <input type="text" name="truename"  class="form-control" placeholder="请输入要注册的真实姓名">
            </div>
		</div>
		<div class="col-lg-4 col-lg-offset-4">
 		<input type="submit" class="btn-primary btn-lg" value="注册">

		</div>
	</form>
</div>

</div>	
</body>
</html>