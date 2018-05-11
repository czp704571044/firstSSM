<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登录</title>
	<script src="${pageContext.request.contextPath}/reference/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/reference/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Login.css">
   </head>
 
<body>
	  <div class="container">
      <h3 class="Login-welcome"></h3>
	   <form action ="${pageContext.request.contextPath }/user/login.do" method="post" class="form-horizontal">
        <div class="form-group">
        <label class="col-lg-3 control-label">帐号：</label>
        <div class="col-lg-9">
        <input type="text" name="username" class="form-control" placeholder="请输入用户名">
        </div>	
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">密码：</label>
           <div class="col-lg-9">
           <input type="password" name="password" class="form-control" placeholder="请输入密码">
           </div>
        </div>
        <div id="code"></div>
        <div class="form-group">
        <div class="col-lg-offset-3 col-lg-9">
          <input type="text" name="code" id="codeInput" placeholder="请输入验证码">
        </div>
        </div>
        <div class="form-group">
          <div class="col-lg-offset-3 col-lg-9">
        <input type="submit" class="btn-primary" value="登录">
        <a href="${pageContext.request.contextPath}/user/registerPage.do">注册</a>
        </div>
        <a href="${pageContext.request.contextPath }/user/findPasswordPage.do">忘记密码了？</a>
     </form>
    </div>
</body>
</html>