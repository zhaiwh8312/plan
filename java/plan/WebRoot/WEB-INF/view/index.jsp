<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>plan.com</title>
		<meta charset="utf-8"/>
		<meta http-equiv="Access-Control-Allow-Origin" content="*"/>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge;chrome=1"/>
        <link href="<%=request.getContextPath() %>/resource/css/gantt/style.css" type="text/css" rel="stylesheet"/>
        <link href="<%=request.getContextPath() %>/resource/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<link href="<%=request.getContextPath() %>/resource/css/gantt/prettify.css" rel="stylesheet" type="text/css">
		
		<style type="text/css">
			body {
				font-family: Helvetica, Arial, sans-serif;
				font-size: 13px;
				padding: 0 0 50px 0;
			}
			.contain {
				margin: 0 auto;
			}
			h1 {
				margin: 40px 0 20px 0;
			}
			h2 {
				font-size: 1.5em;
				padding-bottom: 3px;
				border-bottom: 1px solid #DDD;
				margin-top: 50px;
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
		
		<script type="text/javascript">
		</script>
	</head>

	<body>
		<div class="contain">
	    	<h2>
	    		计划甘特图
	    	</h2>
			<div class="gantt"></div>
		</div>
		
		<script src="<%=request.getContextPath() %>/resource/js/jquery-1.11.1.min.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/jquery.fn.gantt.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/prettify.js"></script>
		<script src="<%=request.getContextPath() %>/resource/js/gantt/projectPlan.js"></script>
		<script>
			//document.write(new Date("2014/09/15 23:59:59").getTime());
		</script>
	</body>
</html>
