<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<style>
div.ex {
	text-align: center;
	width: 35%;
	padding: 10px;
	border: 5px solid grey;
	margin: 20px;
}
</style>
<body>
	<h1>로그인 페이지</h1>
	<div class="ex">
		<form action="/helloMVC/doLogin" method="POST">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="userPw"></td>
				</tr>
				<tr> 
					<td></td>
					<td><input type="submit" value="로그인"></td>

				</tr>
			</table>
		</form>
	</div>
</body>
</html>