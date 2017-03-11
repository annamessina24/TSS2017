<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sito Dinamico</title>

	<style>
	
		.container{padding:0 auto;margin:0 auto;}
		.row{display:block;width:90%;border:1px solid #CCC;}
		#testata, #menu, #footer{clear:both;border:1px solid #C00;}
		#content{float:left;width:65%;height:auto;border:1px solid #FC3;}
		#sidebar{float:right;width:30%;border:1px solid green;}
		#menu li{list-style-type:none;display:inline;}
	
	</style>
	
</head>
<body>

	<div class="container">

		<div class="row" id="testata">
			<jsp:include page="Header.jsp"></jsp:include>
		</div>
		
		<div class="row">
			<%@ include file="Menu.jsp" %>
		</div>
		
		<div class="row">
			<div id="content">
				<%@ include file="Content.jsp" %>
			</div>
			<div id="sidebar">
				<%@ include file="Sidebar.jsp" %>
			</div>
		</div>
		
		<div class="row" id="footer">
			<jsp:include page="Footer.jsp"></jsp:include>
		</div>
		
	
	</div>



</body>
</html>