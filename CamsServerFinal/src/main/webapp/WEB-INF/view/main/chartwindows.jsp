<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<script type='text/javascript' src="resources/js/jquery.min.js"></script>

<script type='text/javascript' src="resources/js/kendo.web.min.js"></script>
<script type="text/javascript" src="resources/js/stickies.js"></script>
<script type="text/javascript" src="resources/js/kendo.dataviz.min.js"></script>
<script type="text/javascript" src="resources/js/kendo.dataviz.chart.min.js"></script>


<link rel="stylesheet" href="resources/css/basicstyle.css" type="text/css">
<link href="resources/css/kendo.common.min.css" rel="stylesheet" type='text/css' media='screen' />
<link href="resources/css/kendo.default.min.css" rel="stylesheet" type='text/css' media='screen' />
<link href="resources/css/kendo.dataviz.min.css" rel="stylesheet" type='text/css' media='screen' />

<link type="text/css" rel="stylesheet" href="resources/css/stickies.css">

</head>
<body>
	<%@ include file="./header.jsp"%>
	<div id=container>
		<div id="window1" class="k-content" style="min-height: 420px">
			<!-- Window HTML -->
			<div id="chart1"></div>
			<script>
                $(document).ready(function() {
                    var window = $("#chart1");
                    window.kendoWindow({
                        width: "1200px",
                        height: "420px",
                        title: "월별 상담유형 추이",
                        actions: ["Refresh", "Maximize", "Close"],
                        content: "resources/content/innerHtml/lineChart.html"
                    });
                });
            </script>
		</div>


		<div id="window2" class="k-content" style="min-height: 300px">
			<!-- Window HTML -->
			<div id="chart2"></div>
			<script>
                $(document).ready(function() {
                    var window = $("#chart2");

                    window.kendoWindow({
                        width: "600px",
                        height: "300px",
                        title: "연령대별 상담유형 추이",
                        actions: ["Refresh", "Maximize", "Close"],
                        content: "resources/content/innerHtml/pieChart.html"
                    });
                });
            </script>
		</div>

		<div id="window3" class="k-content" style="min-height: 300px">
			<!-- Window HTML -->
			<div id="chart3"></div>
			<script>
                $(document).ready(function() {
                    var window = $("#chart3");

                    window.kendoWindow({
                        width: "600px",
                        height: "300px",
                        title: "어쩌고저쩌고 추이",
                        actions: ["Refresh", "Maximize", "Close"],
                        content: "resources/content/innerHtml/multiChart.html"
                    });
                });
            </script>
		</div>
	</div>



</body>
</html>