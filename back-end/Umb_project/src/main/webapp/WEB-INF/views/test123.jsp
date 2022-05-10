<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>결제하기</title>
  <Authorization: Basic base64({SECRET_KEY:test_sk_Kma60RZblrqY02Dpg1zrwzYWBn14})>
  <script src="https://js.tosspayments.com/v1"></script>
</head>
<body>
<button onclick="location.href='/myapp/pay?id=abc'">카드등록</button> <!--url 뒤 쿼리스트링으로 id 전송-->
</body>
</html>