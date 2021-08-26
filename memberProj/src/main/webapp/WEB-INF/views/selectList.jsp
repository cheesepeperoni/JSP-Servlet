<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="member" items="${list}">
	<tr align="center">
		<td>${member.id }</td>
		<td>${member.name }</td>
		<td>${member.phone }</td>
		<td>${member.birth }</td>
		<td>${member.address }</td>
	</tr>
</c:forEach>
