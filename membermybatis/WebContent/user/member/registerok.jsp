<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/template/header.jsp" %>

<c:if test="${userInfo != null}">
<strong>${userInfo.name}</strong>님 회원가입을 환영합니다.<br>
로그인 후 모든 서비스를 이용할 수 있습니다.<br>
가입하신 정보는 다음과 같습니다.
이메일 : ${userInfo.emailid}@${userInfo.emaildomain}<br>
<!-- 객체를 담아오는것이므로 한글이 깨지지 않는다. -->
아이디 : ${userInfo.id}<br>
전화번호 : ${userInfo.tel1}-${userInfo.tel2}-${userInfo.tel3}<br>
주소 :${userInfo.zipcode} ${userInfo.address} ${userInfo.addressDetail}<br>
<a href="${root}/user/login.jsp">로그인</a>
<br>
</c:if>
<c:if test="${userInfo == null }">
	<c:redirect url="/user"></c:redirect>
</c:if>
<%@ include file="/template/footer.jsp" %>