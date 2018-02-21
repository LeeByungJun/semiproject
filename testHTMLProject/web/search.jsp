<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String keyword = request.getParameter("keyword");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>search.jsp</title>
</head>	
<body>
	<h1>전송받은 검색 단어 : <%= keyword %></h1>
</body>
</html>