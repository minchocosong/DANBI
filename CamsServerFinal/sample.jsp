<!DOCTYPE html>
<html>
<head>
    <title></title>
    <script src="jquery-1.7.1.js"></script>
    <script src="source/kendo.all.js"></script>
    <link href="styles/kendo.common.css" rel="stylesheet" />
    <link href="styles/kendo.default.css" rel="stylesheet" />
</head>
<body>
    
        <div id="example" class="k-content">
            <div class="configuration k-widget k-header" style="width:170px;">
                <span class="configHead">Base date unit</span>
                <ul class="options">
                    <li>
                        <input id="baseUnitAuto" name="baseUnit"
                                type="radio" value="" autocomplete="off" />
                        <label for="baseUnitAuto">Automatic (default)</label>
                    </li>
                    <li>
                        <input id="baseUnitYears" name="baseUnit"
                                type="radio" value="years" autocomplete="off" />
                        <label for="baseUnitYears">Years</label>
                    </li>
                    <li>
                        <input id="baseUnitMonths" name="baseUnit"
                                type="radio" value="months" checked="checked" autocomplete="off" />
                        <label for="baseUnitMonths">Months</label>
                    </li>
                    <li>
                        <input id="baseUnitDays" name="baseUnit"
                                type="radio" value="days" autocomplete="off" />
                        <label for="baseUnitDays">Days</label>
                    </li>
                </ul>
                <span class="configHead">Aggregate function</span>
                <ul class="options">
                    <li>
                        <input id="aggregateMax" name="aggregate"
                                type="radio" value="max" autocomplete="off" />
                        <label for="aggregateMax">Max (default)</label>
                    </li>
                    <li>
                        <input id="aggregateMin" name="aggregate"
                                type="radio" value="min" autocomplete="off" />
                        <label for="aggregateMin">Min</label>
                    </li>
                    <li>
                        <input id="aggregateSum" name="aggregate"
                                type="radio" value="sum" checked="checked" autocomplete="off" />
                        <label for="aggregateSum">Sum</label>
                    </li>
                    <li>
                        <input id="aggregateAvg" name="aggregate"
                                type="radio" value="avg" autocomplete="off" />
                        <label for="aggregateAvg">Avg</label>
                    </li>
                    <li>
                        <input id="aggregateCount" name="aggregate"
                                type="radio" value="count" autocomplete="off" />
                        <label for="aggregateCount">Count</label>
                    </li>
                </ul>
                <p>Custom aggregate functions are supported.</p>
            </div>
            <div class="chart-wrapper">
                <div id="chart"></div>
            </div>
            <script>
                function createChart() {
                    $("#chart").kendoChart({
                        theme: $(document).data("kendoSkin") || "default",
                        title: {
                            text: "Units sold"
                        },
                        series: [{
                            type: "line",
                            data: [20, 40, 45, 30, 50],
                            aggregate: "sum" 
                        }],
                        categoryAxis: {
                            baseUnit: "months",
                            categories: [
                                new Date("2011/12/30"),
                                new Date("2011/12/31"),
                                new Date("2012/01/01"),
                                new Date("2012/01/02"),
                                new Date("2012/01/03")
                            ]
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

                    $(".configuration").bind("change", refresh);
                });

                function refresh() {
                    var chart = $("#chart").data("kendoChart"),
                        series = chart.options.series,
                        categoryAxis = chart.options.categoryAxis,
                        baseUnitInputs = $("input:radio[name=baseUnit]"),
                        aggregateInputs = $("input:radio[name=aggregate]");

                    for (var i = 0, length = series.length; i < length; i++) {
                        series[i].aggregate = aggregateInputs.filter(":checked").val();
                    };

                    categoryAxis.baseUnit = baseUnitInputs.filter(":checked").val();

                    chart.refresh();
                }
            </script>
            <style scoped>
                .chart-wrapper {
                	margin: 0 0 0 20px;
                	width: 466px;
                	height: 434px;
                	background: url("../../content/shared/styles/chart-wrapper-small.png") transparent no-repeat 0 0;
                }
                
                .chart-wrapper .k-chart {
                    height: 280px;
                    padding: 37px;
                    width: 390px;
                }
            </style>
        </div>


</body>
</html>