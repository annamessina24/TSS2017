<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<title>My Shop</title>

<style>
	
		.container{padding:0 auto;margin:0 auto;}
		.row{display:block;width:90%;border:0px solid #CCC;}
		#testata, #menu, #footer{clear:both;border:0px solid #C00;}
		#content{float:left;width:65%;height:auto;border:0px solid #FC3;}
		#sidebar{float:right;width:30%;border:0px solid green;}
		#menu li{list-style-type:none; display:inline;}
	
	</style>


</head>
<body>

	<div class="container">

		<div class="row col-md-12" id="testata">
			<jsp:include page="Header.jsp"></jsp:include>
		</div>
		
		<div class="row col-md-12" id="menu">
			<%@ include file="Menu.jsp" %>
		</div>
		
		<div class="row col-md-12">
			<div id="content" class="col-md-9">
				<%@ include file="Content.jsp" %>
			</div>
			<div id="sidebar" class="col-md-3">
				<%@ include file="Sidebar.jsp" %>
			</div>
		</div>
		
		<div class="row col-md-12" id="footer">
			<jsp:include page="Footer.jsp"></jsp:include>
		</div>
		
	
	</div>
	
<script src="https://code.jquery.com/jquery-1.12.4.js" integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU=" crossorigin="anonymous"></script>
	
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<script src="js/mioScript2.js"></script>
</body>
</html>