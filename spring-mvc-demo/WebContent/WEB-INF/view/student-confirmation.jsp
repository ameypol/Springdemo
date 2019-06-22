<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<title>Student Confirmation</title>
</head>
<body>
The Student is confirmed : ${student.firstName} ${student.lastName}
<br>
Selected county : ${student.country}
<br>
Favourite Language : ${student.favouriteLanguage}
<br>
<ul>
<c:forEach var="temp" items="${student.operatingSystem}">
<li>${temp}
</li>
</c:forEach>
</ul>

</body>
</html>