<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<body>
<form action ="${pageContext.request.contextPath }/user/findPassword.do" method="post" class="form-horizontal" >
        <div class="form-group">
        <label class="col-lg-3 control-label">密码：</label>
        <div class="col-lg-9">
        <input type="text" name="username" class="form-control" placeholder="请输入您要修改的密码">
        </div>	
        </div>
        <div class="form-group">
        <label class="col-lg-3 control-label">密码：</label>
        <div class="col-lg-9">
        <input type="text" name="username" class="form-control" placeholder="请输入您要修改的重复密码">
        </div>	
        </div>
        <div>
        <input type="submit" value="提交">
 </div>
 </form>
</body>
</html>