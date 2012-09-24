<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<script src="resources/content/data/console.js"></script>
<script src="resources/content/data/people.js"></script>


	<div id="example" class="k-content">
	
	
		<div id="grid"></div>

		<div id="details"></div>

		<script>
                var wnd,
                    detailsTemplate;
                
                var data = [{
                	"no" : "1",
                	"title" : "9월 공지입니다.",
                	"writer" : "minchoco",
                	"date" : "09/21/2012",
                	"content" : "안녕하세요"
                },{
                	"no" : "2",
                	"title" : "8월 공지입니다. ",
                	"writer" : "minchoco",
                	"date" : "08/22/2012",
                	"content" : "hi 2"
                },{
                	"no" : "3",
                	"title" : "7월 공지입니다. ",
                	"writer" : "minchoco",
                	"date" : "07/22/2012",
                	"content" : "hi 2"
                }
                ]

                $(document).ready(function () {
                    var grid = $("#grid").kendoGrid({
                        dataSource: data,
                        pageable: true,
                        height: 260,
                        columns: [
                            { field: "no", title: "no" },
                            { field: "title", title: "title" },
                            { field: "writer", title: "writer" },
                            { field: "date", title: "date" },
                            { command: { text: "View Details", click: showDetails }, title: " ", width: "140px" }]
                    }).data("kendoGrid");

                    wnd = $("#details")
                        .kendoWindow({
                            title: "Details",
                            modal: true,
                            visible: false,
                            resizable: false,
                            width: 300
                        }).data("kendoWindow");

                    detailsTemplate = kendo.template($("#template").html());
                });

                function showDetails(e) {
                    e.preventDefault();

                    var dataItem = this.dataItem($(e.currentTarget).closest("tr"));
                    wnd.content(detailsTemplate(dataItem));
                    wnd.center().open();
                }
            </script>

		<script type="text/x-kendo-template" id="template">
                <div id="details-container">
                    <h2>#= writer # #= date #</h2>
                    <em>#= title #</em>
                    <dl>
                        <dt>Content: #= content #</dt>
                        <dt> Date: #= kendo.toString(date, "MM/dd/yyyy") #</dt>
                    </dl>
                </div>
            </script>

		<style type="text/css">
#example {
	font: 11px Verdana, Arial, sans-serif;
}
#details-container {
	padding: 10px;
}

#details-container h2 {
	margin: 0;
}

#details-container em {
	color: #8c8c8c;
}
#details-container
 
dt
,
{
margin
:
0;

                    
display
:
 
inline
;

                
}
</style>
	</div>

