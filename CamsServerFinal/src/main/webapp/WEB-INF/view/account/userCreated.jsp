<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계정 생성 [개인]</title>
</head>
<body>
계정 생성됨 [개인]
<ul>
 <li>아이디: ${command.id}</li>
 <li>이름: ${command.name}</li>
 <li>이메일: ${command.email}</li>
 <li>그룹분류: ${command.category}</li>
 <li>그룹명: ${command.gname}</li>
 <li>직책: ${command.position}</li>
 <li>소개 : ${command.introduction}</li>
 <li>로고: ${command.image}</li>
</ul>

<a href="../login/login.do">로그인</a>
<a href="../index.jsp">맨처음으로</a>

</body>
</html>