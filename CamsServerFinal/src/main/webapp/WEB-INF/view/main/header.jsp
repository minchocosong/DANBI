<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
	<script type="resources/content/data/people.js"></script>
	<header id="page_header">
	<div style="float: right;">
		<a href="#">minchoco</a><input type="button" value="logout" onclick="location.href='/CamsServerFinal/index'">
	</div>

	<div>
		<h1>
			<img src="resources/content/images/sample_image.gif" border="1"
				width="70" height="50"> &nbsp;&nbsp;&nbsp; <a href="main">The
				title of organization</a> &nbsp;&nbsp;&nbsp; <input type="text" size="5">
			<input type="button" value="find">
		</h1>
	</div>
	<div style="float: right;">
		<button id="newNoteButton" onClick="newNote()" style="height: 40px">New Note</button>
		<script> 
document.getElementById("newNoteButton").disabled = !db;
</script>


	</div>
	<div id="Menu" class="k-content">

		<div class="demo-section">
			<div id="menu-images" style="width: 1200px"></div>
		</div>
		<script>
				$("#menu-images").kendoMenu({
					dataSource : [ {
						text : "상담 관리",
						imageUrl : "resources/content/menu/baseball.png",url: "/CamsServerFinal/list",
						items : [ {
							text : "상담일지 검색",
							imageUrl : "resources/content/menu/star.png",url: "/CamsServerFinal/list",
						}, {
							text : "상담일지 추가",
							imageUrl : "resources/content/menu/photo.png"
						},{
							text : "상담일지 메모",
							imageUrl : "resources/content/menu/photo.png",url: "/CamsServerFinal/record",
						} ]
					}, {
						text : "내담자 관리",
						imageUrl : "resources/content/menu/golf.png",
						items : [ {
							text : "내담자 검색",
							imageUrl : "resources/content/menu/star.png"
						}, {
							text : "내담자 추가/관리",
							imageUrl : "resources/content/menu/photo.png"
						}, {
							text : "가해자 검색",
							imageUrl : "resources/content/menu/video.png"
						}, {
							text : "가해자 추가/관리",
							imageUrl : "resources/content/menu/speaker.png"
						} ]
					}, {
						text : "분석",
						imageUrl : "resources/content/menu/swimming.png", url: "/CamsServerFinal/window",
					},  {
						text : "통계",
						imageUrl : "resources/content/menu/swimming.png", url: "/CamsServerFinal/window",
					}, {
						text : "Admin",
						imageUrl : "resources/content/menu/snowboarding.png",url: "/CamsServerFinal/admin",
						items : [ {
							text : "사용자 관리",
							imageUrl : "resources/content/menu/photo.png"
						}, {
							text : "상담일지 설정",
							imageUrl : "resources/content/menu/video.png",
							url : "enrollPaper.html"
						}, {
							text : "환경설정",
							imageUrl : "resources/content/menu/video.png"
						} ]
					} ]
				});
			</script>
	</div>
	</header>

	<hr>
</body>
</html>