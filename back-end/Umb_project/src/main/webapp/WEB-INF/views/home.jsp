<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>닉네임</th>
				<th>이메일</th>
				<th>전화번호</th>
				<th>가입일자</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${memberList}" var="member">
				<tr>
					<td>${member.user_id}</td>
					<td>${member.user_pw}</td>
					<td>${member.user_nick}</td>
					<td>${member.user_email}</td>
					<td>${member.user_phone}</td>
					<td>${member.user_joindate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
