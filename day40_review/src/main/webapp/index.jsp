<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="MyServlet" method="get">
		<input type="text" name ="userAge" placeholder="나이입력">
		
		<br>
		선택안함 <input type="radio" name="userGender" value="N">
		<br>
		남자 <input type="radio" name="userGender" value="M">
		<br>
		여자 <input type="radio" name="userGender" value="F">
		<br>
		<h3>좋아하는 색 고르기</h3>
		빨강<input type="checkbox" name="color" value="red">
		파랑<input type="checkbox" name="color" value="blue">
		초록<input type="checkbox" name="color" value="green">
		<button>전송</button>
	</form>
</body>
</html>