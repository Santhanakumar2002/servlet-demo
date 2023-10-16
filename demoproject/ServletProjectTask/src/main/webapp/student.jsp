<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Web Interface</title>
</head>
<body>

<h3> Student Information</h3>
 <form action="student-form" method="POST">
    <div>
			<label>Student Id</label>
			<input type="text" id="studentId" name="studentId" >
		</div>
		
		<br/>
		
		 <div>
			<label>Student Name</label>
			<input type="text" id="studentName" name="studentName" >
		</div>
		<br/>
		
		 <div>
			<label>Student Phone</label>
			<input type="text" id="studentPhone" name="studentPhone" >
		</div>
		<br/>
		
		 <div>
			<label>Student Email</label>
			<input type="text" id="studentEmail" name="studentEmail" >
		</div>
		<br/>
		
		 <div>
			<label>Student Address</label>
			<input type="text" id="studentAddress" name="studentAddress" >
		</div>
		<br/>
		
		 <div>
			<label>Student Department</label>
			<input type="text" id="studentDepartment" name="studentDepartment" >
		</div>
		<br/>
		<div>
			<label>Student Cgpa</label>
			<input type="text" id="studentCgpa" name="studentCgpa" >
		</div>
		<br/>
		
		<div>
		<input type="submit" style= "background-color:green; color:white;"value="create" >
 		</div>
 </form>

</body>
</html>