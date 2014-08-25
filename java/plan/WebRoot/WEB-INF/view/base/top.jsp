<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<style type="text/css">
			.form-signin {
			  max-width: 330px;
			  padding: 15px;
			  margin: 0 auto;
			}
			.form-signin .form-control {
			  height: auto;
			  -webkit-box-sizing: border-box;
			     -moz-box-sizing: border-box;
			          box-sizing: border-box;
			  padding: 10px;
			  font-size: 16px;
			}
		</style>
		<script type="text/javascript">
			var timer;
		
			function refreshTopClass(id) {
				$("#topMenu li").each(function(index, item) {
					$(this).removeClass("active");
				});
				
				$(id).addClass("active");
			}
			
			function goHome() {
				window.location.href='<%=request.getContextPath() %>';
			}
			
			function showLoginModal() {
				$("#sign_form")[0].reset();
				$("#error_msg").hide();
				$("#loginMode").modal();
				$("#email").focus();
			}
			
			function showAboutModal() {
				$("#aboutMode").modal();
			}
			
			// 从服务器获取时间
			function syncServerTime() {
				$.ajax({
					url : "<%=request.getContextPath() %>/api/time",
					data : {},
					async : true,
					type : "get",
					success : function(data) {
						showTime(data);
					},
					error : function(err) {
						timer.clearInterval();
					},
					exception : function() {
						timer.clearInterval();
					}
				});
			}
			
			function showTime(nowTime) {
				var time = new Date(Number(nowTime));
				
				var Year = time.getFullYear();//ie火狐下都可以
				var Month = time.getMonth()+1;
				var Day = time.getDate();
				var Hour = time.getHours();
				var Minute = time.getMinutes();
				var Second = time.getSeconds();
				
				if (Month < 10) {
					Month = "0" + Month;
				}
				if (Day < 10) {
					Day = "0" + Day;
				}
				if (Hour < 10) {
					Hour = "0" + Hour;
				}
				if (Minute < 10) {
					Minute = "0" + Minute;
				}
				if (Second < 10) {
					Second = "0" + Second;
				}
				
				$("#timezone").text(Year + "-" + Month + "-" +  Day + " " + Hour + ":" + Minute + ":" + Second);
			}
			
			function timeTikTok() {
				var time = $("#timezone").text();
				
				var date = new Date(Date.parse(time.replace(/-/g, "/")));
				
				var date1 =	date.getTime() + 1000;
				
				showTime(date1);
			}
			
			$(document).ready(function() {
				timer = setInterval("syncServerTime()", 30000);
				
				setInterval("timeTikTok()", 1000);
			});
		</script>
		
		<!-- 导航条 -->
		<div class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Plan</a>
				</div>
				<div class="navbar-collapse collapse">
					<ul id="topMenu" class="nav navbar-nav">
						<li id="li_home" class="active"><a href="javascript:void(0);" onclick="goHome()">首页<!-- Home --></a></li>
						<li id="li_about"><a href="javascript:void(0);" onclick="showAboutModal()">关于<!-- About --></a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<c:if test="${sessionScope.user != null }">
						<li id="user_span" class="dropdown">
							<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">
								${sessionScope.user.user_name }
								<span class="caret"></span>
							</a>
							<input type="hidden" name="loginUserId" value="${sessionScope.user.user_id }" />
							<ul class="dropdown-menu" role="menu">
								<li><a href="#">个人信息<!-- profile --></a></li>
								<li class="divider"></li>
								<li><a href="javascript:void(0);" onclick="signout()">退出<!-- Sign out --></a></li>
							</ul>
						</li>
						</c:if>
						<c:if test="${sessionScope.user == null }">
						<li id="user_span"><a href="javascript:void(0);" onclick="showLoginModal()">登录<!-- Sign In --></a></li>
						</c:if>
						<li><a id="timezone" style="width:200px"></a></li>
					</ul>
					<script type="text/javascript">
						syncServerTime();
					</script>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
		<!-- 导航条 -->
		<!-- 登录框 -->
		<div class="modal fade" id="loginMode" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  	<div class="modal-dialog">
			    <div class="modal-content">
			      	<div class="modal-header">
			        	<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
			        	<h4 class="modal-title">登录<!-- Sign In --></h4>
			      	</div>
			      	<div class="modal-body">
			      		<form id="sign_form" class="form-signin" role="form">
			      			<div id="error_msg" class="alert alert-danger" role="alert" style="display:none"></div>
				      		<div class="input-group">
				      			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				      			<input type="email" id="email" class="form-control" placeholder="公司邮箱地址" required="" autofocus="">
				      		</div>
	        				<div class="input-group">
				      			<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
				      			<input type="password" id="password" class="form-control" placeholder="密码" required="">
				      		</div>
			      		</form>
			      	</div>
			      	<div class="modal-footer">
			        	<button type="button" class="btn btn-default" data-dismiss="modal">关闭<!-- Close --></button>
			        	<button type="button" class="btn btn-primary" onclick="signin()">登录<!-- Sign In --></button>
			      	</div>
			      	<input type="hidden" id="afterLoginScript" name="afterLoginScript" value=""/>
			    </div><!-- /.modal-content -->
		  	</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
		<!-- 登录框 -->
		
		<!-- 关于框 -->
		<jsp:include page="/WEB-INF/view/base/about.jsp"></jsp:include>