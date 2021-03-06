<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>HOWSER Coffee Machine</title>
    <link rel="stylesheet" type="text/css" href="/lib/bootstrap/css/bootstrap.min.css">
</head>
<body>

<button id="makeRoom">커피주문인원 모집 home</button>

<br/>


<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
    모달 테스트
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close"
                    data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">모달 바디 내용</div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save</button>
            </div>
        </div>
    </div>
</div>

<script src="/lib/jquery/jquery-1.11.3.min.js"></script>
<script src="/lib/bootstrap/js/bootstrap.min.js"></script>

<script src="/js/main.js"></script>
</body>
</html>
