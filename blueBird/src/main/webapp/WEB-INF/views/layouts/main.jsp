<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<style>

table, tr ,td{
			 border:2px;
			 border-style:solid;
			 background-color:lavender;}

</style>
</head>
<body>
	<table border="1" rules="all">
		<tr height="50">
			<td colspan="2"><tiles:insertAttribute name="header" /></td>
		</tr>

		<tr height="50">
			<td width="100"><tiles:insertAttribute name="menu" /></td>
			<td width="200"><tiles:insertAttribute name="body" /></td>
		</tr>

		<tr height="50">
			<td colspan="2"><tiles:insertAttribute name="footer" /></td>
		</tr>
	</table>
</body>
</html>