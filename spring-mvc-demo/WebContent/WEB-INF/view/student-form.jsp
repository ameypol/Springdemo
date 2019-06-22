<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student registration form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName" />
<br>
Last name: <form:input path="lastName" />
<br>
<form:select path="country">
<form:options items="${student.countryOptions}"/>

<%-- <form:option value="Denmark" label="denmark"/>
<form:option value="France" label="france"/>
<form:option value="India" label="india"/>
 --%>
 
 </form:select>
<br>
Java<form:radiobutton path="favouriteLanguage" value="Java"/>
Python<form:radiobutton path="favouriteLanguage" value="Python"/>
C#<form:radiobutton path="favouriteLanguage" value="C#"/>
Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>
<br>

Windows<form:checkbox path="operatingSystem" value="Windows"/>
Linux<form:checkbox path="operatingSystem" value="Linux"/>
Mac OS<form:checkbox path="operatingSystem" value="Mac OS"/>
<br>
<input type="submit" value="Submit"/>
</form:form>

</body>
</html>