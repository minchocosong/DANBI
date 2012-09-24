<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계정 생성 [그룹]</title>
</head>
<body>
계정 생성됨 [그룹]
<ul>
 <li>기관/단체명: ${command.gname}</li>
 <li>그룹 분류: ${command.category}</li>
 <li>소개: ${command.introduction}</li>
 <li>로고: ${command.image}</li>
</ul>

<a href="../login/login.do">로그인</a>
<a href="../index.jsp">맨처음으로</a>

</body>
</html>