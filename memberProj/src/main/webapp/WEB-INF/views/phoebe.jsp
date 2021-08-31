<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.box {
	border: 1px solid lightgray;
	border-radius: 30px;
	width: 600px;
	height: 200px;
}

.secBox td {
	width: 150px;
	height: 50px;
}
</style>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function SelectList() {
		$.ajax({
			type : "POST",
			dataType : 'html',
			url : "selectList.do",

			success : function(data) {
				console.log(data);
				$('.secBox').append(data);

			},
			error : function() {
				return false;
			}
		});
	}
</script>
</head>
<body>
	<form name="selectList" method="post" action=".do">
		<div align="center">
			<div class="box">
				<table>
					<tr>
						<td><label>아이디: <input type="text" name="id" id="id"></label>
						</td>
						<td><label>생년 월일 <br> <input type="date"
								name="birth" id="birth"></label></td>
					</tr>

					<tr>
						<td><label>이 름 :&nbsp;&nbsp;<input type="text" name="name"
								id="name"></label></td>
					</tr>

					<tr>
						<td><label>번 호 :&nbsp;&nbsp;<input type="text" name="phone"
								id="phone"></label></td>
					</tr>

					<tr>
						<td><label>주 소 :&nbsp;&nbsp;<input type="text" name="address"
								id="address"></label></td>
					</tr>
				</table>
			</div>
			<br>
			<div>
				<button type="button" onclick="SelectList()">조회</button>
				<button type="submit">등록</button>
				<button type="reset">삭제</button>
			</div>

			<br>
			<table class="secBox" border="1" rules="all">
				<tr align="center">
					<td>아이디</td>
					<td>이름</td>
					<td>연락처</td>
					<td>생년월일</td>
					<td>주소</td>
				</tr>
			</table>
		</div>
	</form>
</html>