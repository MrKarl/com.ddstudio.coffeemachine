<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
	<title>HOWSER Coffee Machine</title>
	<link rel="stylesheet" type="text/css" href="/lib/bootstrap/css/bootstrap.min.css">
</head>
<body>

<form action="/order" method="POST">
	<input type="hidden" name="roomId" id="roomId" value="${roomId}"/>
	
	<p>
	나 <input type="text" name="userName" placeholder="이름(실명)"/> 은/는 
	<select name="drinkNo" id="menu">		
	</select> 를 마시고 싶습니다.
	</p>
	
	
	<p>
		<label for="waiting30">30분</label>
		<input id="waiting30" type="radio" value="30" name="waitingTime"/>
		&nbsp;
		<label for="waiting60">1시간</label>
		<input id="waiting60" type="radio" value="60" name="waitingTime"/>
		까지 기다릴 수 있으며 이 시간이 지나면 자동으로 주문을 취소합니다.
	</p>
	
	
	<p>
		현금 보유 여부는 
		<label for="canPayRich">넉넉히 있습니다.</label>
		<input id="canPayRich" type="radio" value="1" name="canPay"/>
		&nbsp;
		<label for="canPayOnlyMine">제꺼만 있습니다.</label>
		<input id="canPayOnlyMine" type="radio" value="0" name="canPay"/>
		&nbsp;
		<label for="canPayPoor">전혀 없습니다.</label>
		<input id="canPayPoor" type="radio" value="-1" name="canPay"/>
		&nbsp;
	</p>
	
	<br/>
	
	<input type="submit" value="대기명단에 올리기"/>
</form>


<script src="/lib/jquery/jquery-1.11.3.min.js"></script>
<script src="/lib/bootstrap/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>

</body>
</html>
