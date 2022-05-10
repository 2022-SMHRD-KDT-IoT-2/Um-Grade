<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> <html xmlns:th="http://www.thymeleaf.org">
<head> 
<meta charset="UTF-8" /> 
<title>토스 페이먼츠 결제 연동 예제</title>
<script src="https://js.tosspayments.com/v1"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<script type="text/javascript" th:inline="javascript">
$(document).ready(()=>{
	card()
}) 

const urlParams = new URLSearchParams(window.location.search);
const id = urlParams.get('id');

function card(){
            var clientKey = "test_ck_5GePWvyJnrKdYG9nRwO8gLzN97Eo";
            var tossPayments = TossPayments(clientKey);
            tossPayments.requestBillingAuth("카드", {
                customerKey: id,
                successUrl: window.location.origin +"/myapp/success",
                failUrl: window.location.origin +"/myapp/fail"
            });
        };
</script>
</body>
</html>