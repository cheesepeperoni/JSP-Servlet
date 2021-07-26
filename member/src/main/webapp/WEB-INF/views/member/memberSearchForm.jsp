<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>회원 조회</h1>
		</div>

		<div>
			<form id="frm" name="frm" action="memberSearch.do" method="post">
				<table border="1" rules="all">
					<tr>
						<th width="250" height="50">조회할 아이디 입력</th>
						<td width="200">
							<center><input type="text" id="id" name="id"></center>
						</td>
						<td width="100" height="50">
							<center><input type="submit" value="검 색"></center>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>