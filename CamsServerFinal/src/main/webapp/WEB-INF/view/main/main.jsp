<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type='text/javascript' src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/kendo.dataviz.min.js"></script>
<script type="text/javascript" src="resources/js/kendo.dataviz.chart.min.js"></script>
<script type='text/javascript' src="resources/js/kendo.web.min.js"></script>
<script type="text/javascript" src="resources/js/stickies.js"></script>



<link rel="stylesheet" href="resources/css/basicstyle.css" type="text/css">
<link href="resources/css/kendo.common.min.css" rel="stylesheet" type='text/css' media='screen' />
<link href="resources/css/kendo.default.min.css" rel="stylesheet" type='text/css' media='screen' />
<link href="resources/css/kendo.dataviz.min.css" rel="stylesheet" type='text/css' media='screen' />

<link type="text/css" rel="stylesheet" href="resources/css/stickies.css">

</head>
<body>

	<%@ include file="./header.jsp"%>

	<div id="body" class="k-content">
		<div id="vertical">
			<div id="top-pane">
				<%@ include file="./notice.jsp"%>
			</div>
			<div id="middle-pane">
				<div id="horizontal" style="height: 100%; width: 100%;">
				
					<div id="center-pane">
						<div class="pane-content">
							<section id="data">main
							</section>

						</div>
					</div>
				</div>

			</div>

			<div id="bottom-pane">
				<div class="pane-content">
					<h3>Outer splitter / bottom pane</h3>
					<p>
						family sites <select>sites
						</select>
					</p>
				</div>
			</div>
		</div>


		<script>
			$(document).ready(function() {
				$("#vertical").kendoSplitter({
					orientation : "vertical",
					panes : [ {
						collapsible : false
					}, {
						collapsible : false,
						size : "1200px"
					}, {
						collapsible : false,
						resizable : false,
						size : "200px"
					} ]
				});

				$("#horizontal").kendoSplitter({
					panes : [ {
						collapsible : true,
						size : "220px"
					}, {
						collapsible : false
					}, {
						collapsible : true,
						size : "220px"
					} ]
				});
			});
		</script>

		<style scoped>
#vertical {
	height: 1400px;
	width: 1200px;
	margin: 0 auto;
}

#middle-pane {
	background-color: rgba(60, 70, 80, 0.10);
}


#center-pane {
	background-color: rgba(60, 70, 80, 0.05);
}

.pane-content {
	padding: 0 10px;
}
</style>
	</div>



</body>
</html>