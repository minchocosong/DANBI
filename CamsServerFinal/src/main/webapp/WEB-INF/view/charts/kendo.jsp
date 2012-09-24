<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<title></title>
<script type='text/javascript' src="resources/js/jquery-1.6.4.min.js"></script>
<script type='text/javascript' src="resources/js/kendo.all.min.js"></script>
<link href="resources/css/kendo.common.css" rel="stylesheet"
	type='text/css' media='screen' />
<link href="resources/css/kendo.default.css" rel="stylesheet"
	type='text/css' media='screen' />
</head>
<body>
	 
  		 <div id="window2" class="k-content" style="min-height: 300px">
            <!-- Window HTML -->
            <div id="chart2"></div>
            <script>
                $(document).ready(function() {
                    var window = $("#chart2");

                    window.kendoWindow({
                        width: "600px",
                        height: "420px",
                        title: "월별 상담유형 추이",
                        actions: ["Refresh", "Maximize", "Close"],
                        content: "resources/content/innerHtml/pieChart.html"
                    });
                });
            </script>
        </div>
           
</body>
</html>

