<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardlist</title>
</head>
<body>
<h2>공지사항</h2>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>작성일자</th>
			<td>조회수</td>
		</tr>
		<c:forEach var="row" items="${list}">
			<tr>
				<td>${row.bno}</td>
				<td>${row.title}</td>
				<td>${row.writer}</td>
			  <td>
        
                <fmt:formatDate value="${row.regdate}" pattern="yyyy-MM-dd HH:mm:ss" />
            </td>
            <td>${row.viewcnt}</td>
		</tr>
		
		
		</c:forEach>
	

	</table>

</html>