<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<jsp:include page="Header.jsp"></jsp:include>
</head>

<body id="Body-login">
	<div id="Container-login-cover">
		<div id="Container-login">
			<div id="Container-login-left">
				<div class="Container-login-left-item">
					<img src='<c:url value = "/resources/image/Login-01.jpg" />'
						alt="Image-login-01" class="Image-login">
				</div>
				<div class="Container-login-left-item">
					<img src='<c:url value = "/resources/image/Login-02.jpg" />'
						alt="Image-login-02" class="Image-login">
				</div>
			</div>

			<div id="Container-login-betwen"></div>

			<div id="Container-login-right">
				<div id="div-01">
					<div>
						<img src='<c:url value = "/resources/image/Login-01.jpg" />'
						alt="Image-login-right" class="Image-login-right">
					</div>
				</div>

				<form method="post">
					<div id="div-02">
						<div class="div-02-01">
							<div>
								<label id="lblUserName" for="userName">Contain: a-z A-Z
									0-9</label>
							</div>
							<div>
								<input type="text" placeholder="User name" id="userName"
									onchange="checkUserName()" name="userName">
							</div>
						</div>
						<div class="div-02-01">
							<div>
								<label id="lblPassword" for="password">Contain: a-z A-Z
									0-9</label>
							</div>

							<div>
								<input type="password" placeholder="Password" id="password"
									onchange="checkPassword()" name="password"
									class="form-group">
							</div>
						</div>
						<div class="div-02-02">
							<div>
								<button type="submit"
								class="btn btn-primary">Login</button>
							</div>
							<div>
								<a href="#">Forgot</a>
								<a> or </a>
								<a href="#">Register</a>
							</div>
						</div>
					</div>
				</form>

			</div>
		</div>
	</div>

	<script type="text/javascript" src="resources/JavaScript/Login.js"></script>
	<script type="text/javascript" src="resources/JavaScript/Home.js"></script>
</body>

</html>