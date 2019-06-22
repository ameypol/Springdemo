<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

<title>Customer Registration Form</title>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">

First Name:<form:input path="firstName"/>
<br>
Last Name* : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br>
passes<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>
<br>
postCode:<form:input path="postCode"/>
<form:errors path="postCode" cssClass="error"/>
<br>
courseCode:<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>
<br>
<input type="submit" value="Submit">
</form:form>
</body>
</html>