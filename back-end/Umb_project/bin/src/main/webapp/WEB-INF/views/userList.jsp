<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="kr.smhrd.domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>스프링 웹 엠브이씨 게시판</h2>
		<div class="panel panel-default">
			<div class="panel-heading">보드</div>
			<div class="panel-body">
				<table class="table table-bordered table-striped">
					<tr>
						<th>아이디</th>
						<th>닉네임</th>
						<th>비밀번호</th>
						<th>주소</th>
						<th>가입일자</th>
					</tr>
					<c:forEach var="vo" items="${list}">
			         <tr>
			            <td>${vo.user_id}</td>
			            <td>${vo.user_nick}</a></td>
			            <td>${vo.user_pw}</td>
			            <td>${vo.user_addr}</td>
			            <td>${vo.user_joindate}</td>
			         </tr>
			         </c:forEach>


				</table>
			</div>
		</div>
	</div>
	
</body>
</html>
