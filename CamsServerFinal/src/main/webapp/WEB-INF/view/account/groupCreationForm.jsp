<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset id="Signup_group">
		<legend> SignUp | Group </legend>
		<ol>
			<li>
				<label for="name">기관/단체명 </label>
				<input type="text" name="gname" autofocus id=""gname"" value="${command.gname}">
				<input type="button" name="check" value="중복확인">
			</li>
			<li>	
				<label for="category">그룹 분류 </label>
				<select name="category" autofocus value="${command.category }">
					<option value="none">------[분류]-------</option>
				</select>					
			</li>
			<li>
				<label for="introduction">   소개   </label>
				<input type="text" name="introduction" autofocus id="introduction" value="${command.introduction }">
			</li>
			<li>
				<label for="image"> 로고 </label>
				<input type="text" name="image" autofocus id="image" value="${command.image }">
				<input type="button" name="file" value="File">
		
			</li>
			<li>
				<input type="submit" value="join"><input type="button" value="cancel" onclick="location.href='../index.jsp'" >
			</li>
		</ol>
	</fieldset>
</body>
</html>