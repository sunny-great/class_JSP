<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h1><%=request.getParameter("userName") %></h1>
	<h1><%=request.getParameter("userAge") + "살 입니다" %></h1>
	<jsp:include page="footer.jsp" />
</body>
</html>