<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	method를 get으로 작성하면 폼 데이터를 get방식으로 서버에 전송하고
	method를 post로 작성하면 폼 데이터를 post방식으로 서버에 전송한다
	-->
	<form action="Hello" method="get">
	<!-- action에 /Hello로 바꾸면 정상처리 되지 않는이유?
		오류 페이지의 주소를 확인하면 루트 경로가 사라져있다
		경로는 최상위 경로인 루트에서 시작해야한다
		루트경로가 없어져버렸으니 Hello라는 경로에 있는 서블릿을 찾지 못하는 것
		최상위부터 작성해야한다
		/day39/Hello
		./Hello
		Hello
	 -->
		<input type="text" name="userName" placeholder="이름을 입력하세요">
		<button>전송</button>
	<!-- button태그는 기본적으로 타입이 submit이다
	submit 버튼은 현재 form태그의 action에 작성된 경로로 요청(req)을 보낸다
	이 때 req에는 현재 폼에 속해있는 모든 폼 데이터를 가지고 있다 -->
	</form>
</body>
</html>