<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<body>
		<form:form action="validateLogin" modelAttribute="loginForm" method="POST">
			User Name:  <form:input  name="username" path="username"/>
			<form:errors path="username"></form:errors>
			Password:   <form:password name="password" path="password"/>
			<form:errors path="password"></form:errors>
						<input type="submit" /> 
		</form:form>
	</body>
</html>