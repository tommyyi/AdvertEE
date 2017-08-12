<%-- 

	FileName:success.jsp
	desc: JSP+Servlet+JDBC实现登陆逻辑.
	Author:darkmi
	Date:2015/01/21
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆成功提示页面</title>
</head>
<body>
登陆成功.<br/>
您提交的信息为：<br/>
用户名：<%= request.getParameter("uname") %><br/>
密码：<%= request.getParameter("upwd") %><br/>
<a href="<%=request.getContextPath() %>/14/login.jsp">返回登陆页面</a>
</body>
</html>