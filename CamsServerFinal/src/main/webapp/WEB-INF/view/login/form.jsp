<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
</head>
<body>

<form:form commandName="loginCommand">
<form:errors element="div"/>
	ID: <form:input path="userId"/>
	<form:errors path="userId" />
	<br/>
	PASSWORD: <form:password path="password" showPassword="false"/>
	<form:errors path="password" />
	<br/>
	<input type="submit" />
</form:form>

</body>
</html>