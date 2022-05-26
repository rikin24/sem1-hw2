<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Customers</title>
</head>
<body>
	<c:forEach items="${Customers}" var="customers">
	<p>Ticket ID: ${customers.ticketID}, Name: ${customers.name}, Room ID: ${customers.roomNo}
	</c:forEach>
</body>
</html>