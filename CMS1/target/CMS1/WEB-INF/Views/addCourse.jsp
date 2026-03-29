<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add Course</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="container">
    <h1>Add a New Course</h1>

    <form action="${pageContext.request.contextPath}/save" method="post">
        <label for="name">Course Name:</label>
        <input type="text" id="name" name="name" placeholder="Enter course name" required>

        <label for="instructor">Instructor:</label>
        <input type="text" id="instructor" name="instructor" placeholder="Enter duration" required>

        <button type="submit">Save Course</button>
    </form>//
<form action="${pageContext.request.contextPath}/saveCourse" method="post">
    Name: <input type="text" name="name"><br><br>
    Instructor: <input type="text" name="instructor"><br><br>
    <input type="submit" value="Save">
</form>//
    <p><a href="${pageContext.request.contextPath}/">Back to Course List</a></p>
</div>
</body>
</html>