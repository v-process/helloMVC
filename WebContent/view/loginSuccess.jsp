<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 성공</h2>
<%-- JSP Expression Language --%>
	<ul>
		<li>id: ${customer.id}</li>
		<li>name: ${customer.name}</li>
		<li>email: ${customer.email}</li>
	</ul>
	
	<a href ="/helloMVC/index.jsp">메인 페이지로 이동</a>
</body>
</html>