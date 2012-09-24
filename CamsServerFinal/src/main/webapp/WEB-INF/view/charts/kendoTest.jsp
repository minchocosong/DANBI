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
	<div id="example" class="k-content">
	
		<div class="chart-wrapper">
			<div id="chart"></div>
		</div>
		<script>
		 var stocksDataSource = new kendo.data.DataSource({
                    transport: {
                        read: {
                            url: function() {
                                return "resources/content/dataviz/dashboards/simpletest.json";
                            },
                            dataType: "json"
                        }
                    },

                    group: {
                        field: "type"
                    },

                    sort: {
                        field: "date",
                        dir: "asc"
                    },
                });
                function createChart() {
                    $("#chart").kendoChart({
                        theme: $(document).data("kendoSkin") || "default",
                        title: { text: "Test Prices" },
                        dataSource: stocksDataSource,
                        series: [{
                            type: "line",
                            field: "value",
                            name: "value",
                            groupNameTemplate: "#= group.value # "
                        }],
                        legend: {
                            position: "bottom"
                        },
                        valueAxis: {
                            labels: {
                                format: "{0}",
                                skip: 2,
                                step: 2
                            }
                        },
                        categoryAxis: {
                            field: "date",
                            labels: {
                                template : "#=value# Month"
                            }
                        },
                        tooltip: {
                            visible: true,
                            format: "{0}"
                        },
                        chartArea:{
                        	width : 1200,
                        	height :400
                        }
                    });
                }

                $(document).ready(function() {
                    setTimeout(function() {
                        // Initialize the chart with a delay to make sure
                        // the initial animation is visible
                        createChart();

                        $("#example").bind("kendo:skinChange", function(e) {
                            createChart();
                        });
                    }, 400);
                });
                
              
                
            </script>
             
	</div>

</body>
</html>

