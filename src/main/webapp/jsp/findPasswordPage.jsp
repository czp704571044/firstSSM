<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/reference/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>validate</title>
</head>
 <div class="container">
 <h3>请输入您的用户名以找回密码</h3>
  <form action ="${pageContext.request.contextPath }/user/validate.do" method="post" class="form-horizontal">
        <div class="form-group">
        <label class="col-lg-3 control-label">帐号：</label>
        <div class="col-lg-9">
        <input type="text" name="username" class="form-control" placeholder="请输入您的用户名">
        <input type="submit" value="提交">
        </div>	
        </div>
        </form>
 </div>

</body>
</html>