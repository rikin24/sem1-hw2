<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Movies</title>
</head>
<body>
	<c:forEach items="${Movies}" var="movies">
	<p>Movie ID: ${movies.movieID}, Title: ${movies.title}, Viewing Time: ${movies.time}, Room ID: ${movies.roomNo}
	</c:forEach>
</body>
</html>