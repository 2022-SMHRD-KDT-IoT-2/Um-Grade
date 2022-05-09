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
		<h2>스프링 웹 엠브이씨 게시판 (대여목록)</h2>
		<div class="panel-body" id="list"></div>
	</div>
</body>
<script src="resources/js/fn.js"></script>
<script>
$(document).ready(()=>{
	rentList()
})

function htmlView(data){
	var result = "<table class='table table-bordered table-hover'>"
	result += "<tr><th>일련번호</th><th>대여자</th><th>우산번호</th><th>대여일자</th><th>반납일자</th></tr>"

	   $.each(data, (index, vo)=>{ // 오브젝트안에 있는 데이터 접근.
		   result += "<tr>"
			      result += "<td>"+vo.rent_seq+"</td>"
			      result += "<td>"+vo.rent_id+"</td>"
			      result += "<td>"+vo.umb_seq+"</td>"
			      result += "<td>"+vo.rent_s_date+"</td>"
			      result += "<td>"+vo.rent_e_date+"</td>"			     
			      /* result += "<td>"+String(selectRt(vo.rent_seq))+"</td>" */
			      result += "</tr>"
	   })
	   result += "</table>"
	   $("#list").html(result)
}
</script>
</html>
