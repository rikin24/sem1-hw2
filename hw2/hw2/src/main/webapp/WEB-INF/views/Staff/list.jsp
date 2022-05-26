<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>List of Staff</title>
</head>
<body>
	<c:forEach items="${Staff}" var="staff">
	<p>Staff ID: ${staff.staffID}, Room ID: ${staff.roomNo}
	</c:forEach>
</body>
</html>