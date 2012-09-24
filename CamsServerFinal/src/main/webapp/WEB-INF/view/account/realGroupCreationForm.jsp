<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<c:url value="/group/create" var="addUrl"/>


<html>
<head>
	<link rel='stylesheet' type='text/css' media='screen' href='<c:url value="/resources/css/style.css"/>'/>
	<script type='text/javascript' src='<c:url value="/resources/js/jquery-1.6.4.min.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/custom.js"/>'></script>

	<title>User Records</title>
	
	<script type='text/javascript'>
	$(function() {
		// init
		urlHolder.add = '${addUrl}';
	
		$('#newForm').submit(function() {
			event.preventDefault();
			submitNewRecord();
		});
	

		$('#closeNewForm').click(function() { 
			toggleForms('hide'); 
			toggleCrudButtons('show');
		});
		
	});
	</script>
</head>

<body>
	<h1 id='banner'>Counselment Analysis Management System</h1>
	<hr/>
	<div id='newForm'>
		<form>
  			<fieldset>
				<legend>Create New Record / group </legend>
				<label for='newGroupId'>User ID</label><input type='text' id='newGroupId'/><br/>
				<label for='newGroupname'>Username</label><input type='text' id='newGroupname'/><br/>
				<label for='newIntroduction'>Introduction</label><input type='text' id='newIntroduction'/><br/>
				<label for='newImage'>Image</label><input type='text' id='newImage'/><br/>
				
				<label for='newGroupCategory'>Group</label>
					<select id='newGroupCategory'>
						<option value='1'></option>
						<option value='2' selected='selected'></option>
					</select>
				
  			</fieldset>
			<input type='button' value='Close' id='closeNewForm' />
			<input type='submit' value='Submit'/>
		</form>
	</div>
	
	
</body>
</html>