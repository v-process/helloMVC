<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 실패</h2>
<%-- JSP Expression Language --%>
	<ul>
		id:<b> ${userId} </b>에 대한 정보가 존재하지 않습니다.<br> 
		아이디와 비밀번호를 확인해주세요.
		
	</ul>
	 
	<a href ="/helloMVC/index.jsp">메인 페이지로 이동</a></body>
</html>