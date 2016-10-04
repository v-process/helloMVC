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
	<h1>회원가입 페이지</h1>

	<div class="ex">
		<table>
		<b>Enter Infomation Here</b>
				<form action="/testMVC3/doRegister" method="POST">
					<tr>
						<td>아이디</td>
						<td><input type = "text" name = "registerId"></td>
					</tr>
					<tr>
						<td>비밀번호</td>
						<td><input type ="password" name = "registerPw"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type = "text" name = "registerName"></td>
					</tr>
					<tr>
						<td>성별</td>
						<td>
							<input type = "radio" name ="gender" id = "registerGenderM" value = "m" checked /> 
							<label for = "registerGenderM">남자</label>
							
							<input type = "radio" name ="gender" id = "registerGenderF" value = "f"/> 
							<label for = "registerGenderF">여자</label>
						</td>
					</tr>
					<tr>
						<td>이메일</td>
						<td><input type = "text" name = "registerEmail"></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="register"></td>
					</tr>
				</form>
			</table>
	</div>

<a href = "loginform.jsp" >로그인 페이지로 이동 </a>

</body>
</html>