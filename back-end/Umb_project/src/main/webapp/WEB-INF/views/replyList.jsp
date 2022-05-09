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
						<th>일련번호</th>
						<th>원글번호</th>
						<th>작성내용</th>
						<th>작성일자</th>
						<th>작성자</th>
					</tr>
					<c:forEach var="vo" items="${list}">
			         <tr>
			            <td>${vo.reply_seq}</td>
			            <td>${vo.qna_seq}</a></td>
			            <td>${vo.reply_content}</td>
			            <td>${vo.reply_date}</td>
			            <td>${vo.reply_id}</td>
			         </tr>
			         </c:forEach>


				</table>
			</div>
		</div>
	</div>
	
</body>
</html>
