<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Login Page</title>
</head>

<body>

	<h3>Custom Login Page</h3>
	
		<form:form action="${pageContext.request.contextPath}/authenticateUser"
					method="POST">
					
			<c:if test="${param.error != null}">
			
				<i>Invalid username or password</i>
			
			</c:if>
					
			<p>
				User name: <input type="text" name="username" />
				
			</p>
			
			<p>
				Password: <input type="password" name="password" />
				
			</p>
			
			<input type="submit" value="Login" />
					
		</form:form>

</body>

</html>