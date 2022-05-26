<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Rooms</title>
</head>
<body>
	<c:forEach items="${Rooms}" var="rooms">
	<p>Room ID: ${rooms.roomID}, Movies: ${rooms.movieList}
	</c:forEach>
</body>
</html>