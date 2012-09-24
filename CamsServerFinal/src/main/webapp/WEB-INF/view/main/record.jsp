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

 <div id="example" class="k-content">
				<textarea id="editor" rows="10" cols="30" style="width:1000px;height:500px">
                    &lt;p&gt;&lt;img src=&quot;resources/content/images/sample_image.gif&quot; style=&quot;display:block;margin-left:auto;margin-right:auto;width:200px;height:100px;&quot; /&gt;&lt;/p&gt;
                   
                    &lt;strong&gt;반드시 포함해야하는 항목:&lt;/strong&gt;
                    &lt;ul&gt;
                        &lt;li&gt;상담의뢰인 &lt;/li&gt;
                    &lt;/ul&gt;
                    &lt;ul&gt;
                        &lt;li&gt;당사자(피해자) 나이 &lt;/li&gt;
                    &lt;/ul&gt;
                    &lt;ul&gt;
                        &lt;li&gt;피해자와의 관계 &lt;/li&gt;
                    &lt;/ul&gt;
                    &lt;ul&gt;
                        &lt;li&gt;상담 유형 &lt;/li&gt;
                    &lt;/ul&gt;
                   
                   
                    &lt;/p&gt;
                </textarea>
            <script>
                $(document).ready(function() {
                    // create Editor from textarea HTML element with default set of tools
                    $("#editor").kendoEditor();
                });
            </script>
        </div> 
        
</body>
</html>