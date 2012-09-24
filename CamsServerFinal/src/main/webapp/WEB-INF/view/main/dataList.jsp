<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
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

<body>

	<%@ include file="./header.jsp"%>

	<div id="container" class="k-content">
		<h3>검색조건</h3>
		<div class="configuration k-widget k-header" style="width: 1200px">
			<span class="configHead">API Functions</span>
			<ul class="options">
				<div>
					<input type="text" value="search..." id="search" class="k-textbox" />
				</div>
			<span class="configHead">API Functions</span>

				<div> 
					<div>출력변수</div> 
					<input type="checkbox" name="search" value="no" checked="checked">상담유형
					<input type="checkbox" name="search" value="relationship" checked="checked">피해자와의 관계 
					<input type="checkbox" name="search" value="cAge" checked="checked">피해자 나이
					<input type="checkbox" name="search" value="cType" checked="checked">피해자 유형
					<input type="checkbox" name="search" value="date" checked="checked">상담날짜  
					<input type="checkbox" name="search" value="root" checked="checked">상담경로 
					<input type="checkbox" name="search" value="cGender" checked="checked">피해자 성별 
					<input type="checkbox" name="search" value="cJob" checked="checked">피해자 직업 
					<input type="checkbox" name="search" value="cAddress" checked="checked">피해자 거주지 
					<input type="checkbox" name="search" value="cAcademic" checked="checked">피해자 학력 
					<input type="checkbox" name="search" value="cMarriage" checked="checked">피해자 결혼  
					<input type="checkbox" name="search" value="cMarriageYear" checked="checked">피해자 결혼년수 
					<input type="checkbox" name="search" value="cChildren" checked="checked">피해자 자녀 
					<input type="checkbox" name="search" value="cFamily" checked="checked">피해자 가족  
					<input type="checkbox" name="search" value="cObstacle" checked="checked">피해자 장애여부 
				</div>
				<button class="selectRow k-button">search</button>
			</ul>
		</div>
		<br />
		<div id="excel" style="float:right;">
			<input type="button" value="엑셀출력" onclick="location.href='/CamsServerFinal/download/pageRanks'" />
		</div>
		<br />
		
		<div id="grid"></div>

		<script>
                var data = new kendo.data.DataSource({
                	transport: {
                		read : {
                			url : function() {
                				return "resources/content/dataviz/dashboards/test2.json";
                			}, 
                			dataType : "json"
                		}
                	}                	
                });

                    $("#grid").kendoGrid({
                        dataSource: data,
                        filterable: true,
                        scrollable: false,
                        toolbar: ["create"],
                        columns: [
							{ field:"no",title:"No" },   
                            { field:"type",title:"상담유형" },
                            { field: "relationship",title: "피해자와의관계" },
                            { field: "cAge", title:"피해자나이"},
                            { field:"cType",title:"피해자유형" },   
                            { field:"date",title:"상담날짜" },
                            { field: "root",title: "상담경로" },
                            { field: "cGender", title:"피해자성별"},
                            { field:"cJob",title:"피해자직업" },   
                            { field:"cAddress",title:"피해자거주지" },
                            { field: "cAcademic",title: "피해자학력" },
                            { field: "cMarriage", title:"피해자결혼"},
                            { field:"cMarriageYear",title:"피해자결혼년수" },   
                            { field:"cChildren",title:"피해자자녀" },
                            { field: "cFamily",title: "피해자가족" },
                            { field: "cObstacle", title:"피해자장애"}],
                    });
               
            </script>
<style type="text/css">
#grid {
	font: 11px Verdana, Arial, sans-serif;
}
</style>
	</div>
	
	
</body>
</html>