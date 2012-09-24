<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<spring:hasBindErrors name="command" />
<form:errors path="command" />
<form method="post">

<fieldset id="Signup_group">
		<legend> SignUp | Indivisual </legend>
		<ol>
			<li>
				<label for="id"> 아이디  </label>
				<input type="text" name="id" autofocus id="user_id" value="${command.id}">
				<input type="button" name="check" value="중복확인">
			</li>
			<li>
				<label for="name"> 이름  </label>
				<input type="text" name="name" autofocus id="name" value="${command.name}" >
			</li>
			<li>
				<label for="passwd"> 비밀번호  </labe름l>
				<input type="text" name="passwd" autofocus id="passwd" value="${command.passwd}" >
			</li>
			<li>
				<label for="passwd.verify"> 비밀번호 확인  </label>
				<input type="text" name="passwd.verify" autofocus id="passwd.verify"  >
			</li>
			<li>
				<label for="email"> 이메일 </label>
				<input type="text" name="email" autofocus id="email" value="${command.email}" >
			</li>
			<li>	
				<label for="group"> 그룹 분류 </label>
				<select name="category" autofocus value="${command.category}" >
					<option value="none">------[분류]-------</option>
				</select>	
				<select name="gname" autofocus value="${command.gname}" >
					<option value="none">------[그룹명]-------</option>
				</select>		
							
			</li>
			<li>
				<label for="position">   직책   </label>
				<input type="text" name="position" autofocus id="position" value="${command.position}" >
			</li>
			<li>
				<label for="introduction">   소개   </label>
				<input type="text" name="introduction" autofocus id="introduction" value="${command.introduction}" >
			</li>
			<li>
				<label for="image"> 로고 </label>
				<input type="text" name="image" autofocus id="image" value="${command.image}" >
				<input type="button" name="file" value="File">
		
			</li>
			<li>
				<input type="submit" value="join"><input type="button" value="cancel" onclick="location.href='../index.jsp'">
			</li>
		</ol>
	</fieldset>
	
</form>
</body>
</html>