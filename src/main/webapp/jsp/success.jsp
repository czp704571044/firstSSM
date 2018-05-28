<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <link rel="shortcut icon" href="#" />
  <link href="favicon.ico" rel="shortcut icon">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#color{
color:red;
}
</style>
</head>
<body>

<p id="color">${user.username} </p>
   <p>${msg} </p>
 <a href="${pageContext.request.contextPath }/user/index.do">主页</a>
</body>
</html>