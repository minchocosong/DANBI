<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>

<center>
<div></div>
<img src="resources/content/images/danbi_logo.png" width="300" height="150"> 
<br/><br/><br/><br/><br/><br/><br/><br/>
<input type="button" value="Log In" style="width:205px;height:50px" onclick="location.href='./login'"/>
<input type="button" value="Go to Main (without login)" style="width:205px;height:50px" onclick="location.href='./main'"/>
<input type="button" value="Join (User)" style="width:100px;height:50px" onclick="location.href='./account/user'"/>
<input type="button" value="Join (Group)" style="width:100px;height:50px" onclick="location.href='./account/group'"/><br/>
</center>
<br/><br/><br/>
<hr>
<li><a href="./window">메인 - 차트 테스트</a></li>
<li><a href="./login">로그인 </a></li>
<li><a href="./download/pageRanks">엑셀 출력 </a></li>
<li><a href="./download/file"> 다운로드 테스트 </a></li>
<li><a href="./javacv/test"> JavaCV 테스트 </a></li>
<li><a href="./charts/piechart"> JFreeChart 테스트 </a></li>
<li><a href="./data/readExcel"> Excel Data 호출 테스트 </a></li>
<li><a href="./data/readExcelAndCreateChart"> Excel Data 호출 후 차트 그리기 테스트 </a></li>
<li><a href="./data"> Using kendo chart -  Excel Data 호출 후 차트 그리기 테스트 </a></li>

</body>
</html>