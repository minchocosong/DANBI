<%@ page contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<% request.setCharacterEncoding("euc-kr"); %>

<c:url value="/account/userCreate" var="addUrl"/>

<html>
<head>
	<link rel='stylesheet' type='text/css' media='screen' href='<c:url value="/resources/css/style.css"/>'/>
	<script type='text/javascript' src='<c:url value="/resources/js/jquery-1.6.4.min.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/mycustom.js"/>'></script>

	<title>User Records</title>
	
	<script type='text/javascript'>
	
	function submitNewRecord() {
		$.post(urlHolder.add, {
			
				userId : $('#newUserId').val(),
				userName: $('#newUserName').val(),
				passwd: $('#newPassword').val(),
				email: $('#newEmail').val(),
				introduction: $('#newIntroduction').val(),
				image: $('#newImage').val(),
				group: $('#newGroup').val(),
				role: $('#newRole').val()
			}, 
			function(response) {
				if (response != null) {
					event.preventDefault();
					alert('Success! Record has been added.');
				} else {
					alert('Failure! An error has occurred!');
				}
			}
		);	
	}
	</script>
	
</head>

<body>
	<h1 id='banner'>Counselment Analysis Management System</h1>
	<hr/>
	
	<div id='newForm'>
		<form action="./userCreate" method="post">
  			<fieldset>
				<legend>Create New Record / indivisual </legend>
				<label for='newUserId'>UserID</label><input type='text' id='newUserId'/><br/>
				<label for='newUserName'>Username</label><input type='text' id='newUserName'/><br/>
				<label for='newPassword'>Password</label><input type='password' id='newPassword'/><br/>
				<label for='newEmail'>Email</label><input type='text' id='newEmail'/><br/>
				<label for='newIntroduction'>Introduction</label><input type='text' id='newIntroduction'/><br/>
				<label for='newImage'>Image</label><input type='text' id='newImage'/><br/>
				
				<label for='newGroup'>Group</label>
					<select id='newGroup'>
						<option value='1' selected='selected'>Seoul</option>
						<option value='2' >Chuncheon</option>
					</select>
				<label for='newRole'>Role</label>
					<select id='newRole'>
						<option value='1'>Admin</option>
						<option value='2' selected='selected'>Regular</option>
					</select>
  			</fieldset>
			<input type='button' value='Close' id='closeNewForm' />
			<input type='submit' onclick='javascript:submitNewRecord()'/>
		</form>
	</div>
	
	
</body>
</html>