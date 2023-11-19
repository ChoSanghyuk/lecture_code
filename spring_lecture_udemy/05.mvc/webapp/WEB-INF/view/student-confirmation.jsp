<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>	<!-- loop lib  -->
<!DOCTYPE html>

<html>


<head>
	<title>Student Confirmation</title>
</head>


<body>
						<!--  calls getter of the fields -->
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:				<!-- loop through the array -->
<ul>			
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li> ${temp} </li>
	</c:forEach>
</ul>

</body>


</html>