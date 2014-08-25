<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="Access-Control-Allow-Origin" content="*"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta name="description" content="" />
		<meta name="author" content="" />
		
		<title>plan.com</title>
		
		<link href="<%=request.getContextPath() %>/resource/css/gantt/style.css" type="text/css" rel="stylesheet"/>
        <link href="<%=request.getContextPath() %>/resource/css/style.css" type="text/css" rel="stylesheet"/>
        <link href="<%=request.getContextPath() %>/resource/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<link href="<%=request.getContextPath() %>/resource/css/gantt/prettify.css" rel="stylesheet" type="text/css"/>
		
		<style type="text/css">
			body {
			  	padding-top: 70px;
			}
			
			.navbar {
				margin-bottom: 20px;
			}
			
			h1 {
				margin: 40px 0 20px 0;
			}
			h2 {
				font-size: 1.5em;
				padding-bottom: 3px;
				border-bottom: 1px solid #DDD;
				margin-top: 10px;
				margin-bottom: 25px;
			}
			table th:first-child {
				width: 150px;
			}
	      	/* Bootstrap 3.x re-reset */
	      	.fn-gantt *,
	     	.fn-gantt *:after,
	      	.fn-gantt *:before {
				-webkit-box-sizing: content-box;
				-moz-box-sizing: content-box;
				box-sizing: content-box;
			}
  		</style>
	</head>

	<body>
		<jsp:include page="/WEB-INF/view/base/top.jsp" flush="true"/>
		<div class="container">
			<h2>
		    	计划甘特图
		    </h2>
			<div class="gantt"></div>
		</div>
		<jsp:include page="/WEB-INF/view/base/footer.jsp" />
		
		<!-- javascript -->
		<script src="<%=request.getContextPath() %>/resource/js/jquery-1.11.1.min.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/jquery.fn.gantt.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/prettify.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/projectPlan.js"></script>
	</body>
</html>