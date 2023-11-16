<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="java.util.List"%>
<%@page import="com.ebrain.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Information Details</title>
</head>
<body>
<h2>Student Details list</h2>
<div>
  <button><a href="student-form">creat new student Details </a></button>
  </div>
 <br/>
  <div> 
     <table border="2"> 
         <tr> 
         <th>Student Id</th>
         <th>Student Name</th>
         <th>Student Phone</th>
         <th>Student Email</th>
         <th>Student Address</th>
         <th>Student Department</th>
         <th>Student Cgpa</th>
         </tr>
         
           <%List<Student> students=(List<Student>)request.getAttribute("studentList"); 
        if(null !=students && students.size()>0 ){

            for(Student student: students){
            %>
          
    		<tr>
    		<td><%=student.getId()%></td>
    		<td><%=student.getName()%></td>
    		<td><%=student.getPhone()%></td>
    		<td><%=student.getEmail()%></td>
    		<td><%=student.getAddress()%></td>
    		<td><%=student.getDepartment()%></td>
    		<td><%=student.getCgpa()%></td>
    		</tr>
    		<% }
}else{
%> 
	<tr><td colspan="5">  No Student Record Found </td></tr>
            
       <% } %>
     </table>
     </br>

</body>
</html>