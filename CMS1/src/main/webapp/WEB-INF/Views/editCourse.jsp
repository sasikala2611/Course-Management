<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateCourse" method="post">

<input type="hidden" name="id" value="${course.id}"/>

Name: <input type="text" name="name" value="${course.name}"><br><br>
Instructor: <input type="text" name="instructor" value="${course.instructor}"><br><br>


<input type="submit" value="Update">
</form>

</body>
</html>