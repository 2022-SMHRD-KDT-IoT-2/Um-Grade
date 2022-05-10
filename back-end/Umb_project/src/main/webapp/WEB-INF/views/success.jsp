<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
카드 등록에 성공했습니다. 잠시후 다시 돌아갑니다.
</body>
<script>
var c_interval = 1000;
window.setTimeout("SelfClose()", c_interval);
function SelfClose() {
    window.open('about:blank', '_self').close();
}
</script>
</html>