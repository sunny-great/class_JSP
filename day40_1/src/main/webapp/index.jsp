<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get방식과 Post방식</title>
</head>
<body>
<!-- 	
	<h2>GET 방식 예제</h2>
	<form action="hello" method="get">
		<label for="userName">이름 입력 : </label>
		<input type="text" id="userName" name="userName" 
		placeholder="이름 입력" required />
		<br>
		<label for="userAge">나이 입력 : </label>
		<input type="text" id="userAge" name="userAge" 
		placeholder="나이 입력" required />		
		<br>
		<button type="submit">전송</button>
	</form>
-->
	<h2>POST 방식 예제</h2>
	<form action="hello" method="post">
		<label for="userName">이름 입력 : </label>
		<input type="text" id="userName" name="userName" 
		placeholder="이름 입력" required />
		<br>
		<label for="userAge">나이 입력 : </label>
		<input type="text" id="userAge" name="userAge" 
		placeholder="나이 입력" required />		
		<br>
		<button type="submit">전송</button>	
	</form>

</body>
</html>