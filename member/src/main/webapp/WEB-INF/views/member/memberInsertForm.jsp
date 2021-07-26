<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<div align="center">
		<div><h1>회 원 가 입</h1></div>
		
		
		<div>
			<form id="frm" name="frm" action="memberInsert.do" method="post">
				<div>
					<table border="1" rules="all">
						<tr>
							<th width="170" height="50">아 이 디</th>
							<td width="400" height="50">
								<center><input type="text" id="id" name="id" placeholder="아이디를 입력하세요" required="required"></center>
							</td>
						</tr>
						<tr>
							<th width="150" height="50">패 스 워 드</th>
							<td width="200" height="50">
								<center><input type="password" id="password" name="password" placeholder="패스워드를 입력하세요" required="required"></center>
							</td>
						</tr>
						<tr>
							<th width="150" height="50">패 스 워 드</th>
							<td width="200" height="50">
								<center><input type="password" id="password" name="password" placeholder="패스워드 확인" required="required"></center>
							</td>	
						</tr>
						<tr>
							<th width="150" height="50">이 름</th>
							<td width="200" height="50">
								<center><input type="text" id="name" name="name" placeholder="이름를 입력하세요" required="required"></center>
							</td>						
						</tr>
						<tr>
							<th width="150" height="50">나이</th>
							<td width="200" height="50">
								<center><input type="text" id="age" name="age" placeholder="나이를 입력하세요" required="required"></center>
							</td>						
						</tr>
						<tr>
							<th width="150" height="50">취 미</th>
							<td width="200" height="50">
								<label><input type="checkbox" id="hobbys" name="hobbys" value="여행">여행</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="독서">독서</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="음악">음악</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="등산">등산</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="운동">운동</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="영화">영화</label>				
							</td>						
						</tr>
					</table>
				</div><br>
				<div>
					<input type="submit" value="가  입">
					<input type="reset" value="취   소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>