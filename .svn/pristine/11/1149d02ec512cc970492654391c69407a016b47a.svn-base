<%@ include file = "include/header.jsp" %>
<div id="page-wrapper">
	<div id="page" class="container">
		<div class="title">
			<h2>This is my second page</h2>
		</div>
		<div>
		<!-- Add your form tag here -->
		
		<form:form method="post" modelAttribute="student" action="studentInsert">
<h2>Enter details to save</h2><br></br>
<table align="center">
<tr><td>ID:</td><td>
<form:input type="number" path="id" placeholder="Entered Automatically, No need to enter"/></td></tr>
<tr><td>Name:</td> 
<td><form:input type="text" path="name"/></td></tr>

</table>
<input align="center" type="submit">
<form:hidden  path="id"/><br></br><br></br><br></br>
</form:form>




<h2>List of students</h2><br></br>

<table align="center">
<tr>
	<th>ID</th>
	<th>name</th>
	
</tr>
<c:forEach var="student" items="${studentList}">
<tr>
<td><c:out value="${student.id}"></c:out></td>
<td><c:out value="${student.name}"></c:out></td>

<td><form:form modelAttribute="student" action="studentDelete">
<form:hidden value="${student.id}" path="id"/>
<input type="submit" value="Delete">
</form:form></td>
<td><form:form modelAttribute="student" action="studentFind">
<form:hidden value="${student.id}" path="id"/>
<input  type="submit" value="Update">
</form:form></td>


</c:forEach>
</table>
		
		
		
		
		
		
		<!-- Add your form tag here --> 
		</div>
		</div>
</div>


<%@ include file = "include/footer.jsp" %>
