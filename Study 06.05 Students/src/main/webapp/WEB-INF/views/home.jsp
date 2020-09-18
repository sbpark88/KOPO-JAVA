<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>성적관리</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/home.css">
</head>
<body>
<h1>
	성적 테이블!!
</h1>
	<a href="/Students/manageScore">성적 관리</a><br /><br />
	<table>
		<thead>
			<tr>
				<th>idx</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th><th></th><th></th>
			</tr>
		</thead>
		<tbody>
			${userInfo }
		</tbody>
	</table>

</body>
</html>
