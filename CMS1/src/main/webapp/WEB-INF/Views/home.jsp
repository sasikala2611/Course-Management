<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Course List</h2>

<a href="addCourse">Add Course</a>

<table border="1">
<tr>
  <th>ID</th>
  <th>Name</th>
  <th>Instructor</th>
</tr>

<c:forEach var="c" items="${courses}">
<tr>
  <td>${c.id}</td>
  <td>${c.name}</td>
  <td>${c.instructor}</td>
  <td>
<a href="${pageContext.request.contextPath}/editCourse?id=${c.id}">Update</a> |
<a href="${pageContext.request.contextPath}/deleteCourse?id=${c.id}">Delete</a>
</td>
</tr>
</c:forEach>

</table>