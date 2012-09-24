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
				<div class="pane-content">

					<form id="search" method="post">
						<div id="category" class="k-content">
							<div id="search-box" class="k-header">
								<div id="options">
									<h3>
										대분류<input id="categories" /> 소분류<input id="products"
											disabled="disabled" />
									</h3>
									<h3>
										날짜<input id="start" value="01/01/2012" /> ~ <input id="end"
											value="01/01/2012" />
										<button class="k-button" id="get">Search</button>
									</h3>
								</div>
							</div>

							<style scoped>
#example h3 {
	font-weight: normal;
	clear: both;
}

#search-box {
	border-radius: 10px 10px 10px 10px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	width: 800px;
	margin: 30px auto;
	padding: 10px 10px 10 10px;
	background-position: 0 -255px;
}

#options {
	padding: 10px;
}

#options h3 {
	font-size: 1em;
	font-weight: bold;
}

#get {
	margin-top: 25px;
	width: 100px;
	float: right;
}

.k-readonly {
	color: gray;
}

#example .k-datepicker {
	vertical-align: middle;
}

#example .code-sample {
	width: 60%;
	float: left;
	margin-bottom: 20px;
}

#example .output {
	width: 24%;
	margin-left: 4%;
	float: left;
}
</style>

							<script>
								$(document)
										.ready(
												function() {
													$("#categories")
															.kendoComboBox(
																	{
																		placeholder : "Select category...",
																		dataTextField : "CategoryName",
																		dataValueField : "CategoryID",
																		dataSource : {
																			type : "odata",
																			serverFiltering : true,
																			transport : {
																				read : "http://demos.kendoui.com/service/Northwind.svc/Categories"
																			}
																		}
																	});

													var products = $(
															"#products")
															.kendoComboBox(
																	{
																		autoBind : false,
																		cascadeFrom : "categories",
																		placeholder : "Select product...",
																		dataTextField : "ProductName",
																		dataValueField : "ProductID",
																		dataSource : {
																			type : "odata",
																			serverFiltering : true,
																			transport : {
																				read : "http://demos.kendoui.com/service/Northwind.svc/Products"
																			}
																		}
																	})
															.data(
																	"kendoComboBox");

													function startChange() {
														var startDate = start
																.value();

														if (startDate) {
															startDate = new Date(
																	startDate);
															startDate
																	.setDate(startDate
																			.getDate() + 1);
															end.min(startDate);
														}
													}

													function endChange() {
														var endDate = end
																.value();

														if (endDate) {
															endDate = new Date(
																	endDate);
															endDate
																	.setDate(endDate
																			.getDate() - 1);
															start.max(endDate);
														}
													}

													var start = $("#start")
															.kendoDatePicker(
																	{
																		change : startChange
																	})
															.data(
																	"kendoDatePicker");

													var end = $("#end")
															.kendoDatePicker(
																	{
																		change : endChange
																	})
															.data(
																	"kendoDatePicker");

													start.max(end.value());
													end.min(start.value());

												});
							</script>

						</div>
					</form>
				</div>
			</div>
			<div id="middle-pane">
				<div id="horizontal" style="height: 100%; width: 100%;">
					<div id="left-pane">
						<div class="pane-content">
							<section id="sidebar">

								<div id="sidebar" class="k-content">
									<div class="demo-section">
										<hr>
										<input type="button" value="New Folder">
										<input name="files" id="files" type="file" value="Upload"/>
										<hr>
										<ul id="treeview">
											<li data-expanded="true"><span class="k-sprite folder"></span>
												My Web Site
												<ul>
													<li data-expanded="true"><span class="k-sprite folder"></span>images
														<ul>
															<li><span class="k-sprite image"></span>logo.png</li>
															<li><span class="k-sprite image"></span>body-back.png</li>
															<li><span class="k-sprite image"></span>my-photo.jpg</li>
														</ul></li>
													<li data-expanded="true"><span class="k-sprite folder"></span>resources
														<ul>
															<li data-expanded="true"><span
																class="k-sprite folder"></span>pdf
																<ul>
																	<li><span class="k-sprite pdf"></span>brochure.pdf</li>
																	<li><span class="k-sprite pdf"></span>prices.pdf</li>
																</ul></li>
															<li><span class="k-sprite folder"></span>zip</li>
														</ul></li>
													<li><span class="k-sprite html"></span>about.html</li>
													<li><span class="k-sprite html"></span>contacts.html</li>
													<li><span class="k-sprite html"></span>index.html</li>
													<li><span class="k-sprite html"></span>portfolio.html</li>
												</ul></li>
										</ul>
									</div>

									<script>
										$(document).ready(function() {
											$("#treeview").kendoTreeView();
										});
										$(document).ready(function() {
						                    $("#files").kendoUpload();
						                });
									</script>

									<style scoped>
.demo-section {
	width: 200px;
}

#treeview .k-sprite {
	background-image:
		url("resources/content/treeView/coloricons-sprite.png");
}

.rootfolder {
	background-position: 0 0;
}

.folder {
	background-position: 0 -16px;
}

.pdf {
	background-position: 0 -32px;
}

.html {
	background-position: 0 -48px;
}

.image {
	background-position: 0 -64px;
}
</style>
								</div>
							</section>
						</div>
					</div>
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

#left-pane {
	background-color: rgba(60, 70, 80, 0.05);
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