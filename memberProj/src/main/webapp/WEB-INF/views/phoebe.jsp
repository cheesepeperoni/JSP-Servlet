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
.secBox td{
	width:150px;
	height:50px;
	
	}
	
</style>
</head>
<body>
	<div align="center">
		<div class="box">
			<table>
				<tr>
					<td><label>아이디: <input type="text" name="id" id="id"></label> </td>
					<td><label>생년 월일 <br><input type="date" name="birth" id="birth"></label></td>
				</tr>

				<tr>
					<td><label>이름 : <input type="text" name="name" id="name"></label></td>
				</tr>

				<tr>
					<td><label>번호 : <input type="text" name="phone" id="phone"></label></td>
				</tr>

				<tr>
					<td><label>주소 : <input type="text" name="address" id="address"></label></td>
				</tr>
			</table>
		</div>
	<br>
		<div>
			<button type="submit">등록</button>
			<button type="reset">취소</button>
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

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>

		</table>


	</div>
</html>