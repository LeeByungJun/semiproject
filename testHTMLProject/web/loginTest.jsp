<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String userId = request.getParameter("userid");
  String userPwd = request.getParameter("userpwd");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css">
<title>loginTest.jsp</title>
</head>
<body>
	<h1>유저의 아이디 : <%= userId %><BR> 유저의 비밀번호 : <%= userPwd %></h1>
</body>
</html>