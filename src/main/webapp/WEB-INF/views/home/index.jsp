<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>我的首页  微博-随时随地发现新鲜事</title>
	</head>
	<body>
		<div><img alt="头像" src="../../images/${sessionScope.info.image }"> </div>
		<div><h3>${sessionScope.info.nickname }</h3> </div>
		<div>
			关注<a href="#">${sessionScope.info.follow }</a>|
			粉丝<a href="#">${sessionScope.info.fans }</a>|
			微博<a href="#">${sessionScope.info.weibo }</a>
		
		</div>
		
		<div>
			<c:forEach items="${pi.list }" var="w">
			<div>
				<h3>${w.userInfo.nickname }</h3><p><fmt:formatDate value="${w.time }" pattern="yyyy-MM-dd hh:mm:ss"/></p>
				<p>${w.weiboContent }</p>
			</div>
		
			</c:forEach>
		</div>
	
	</body>
</html>