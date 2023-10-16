s<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor-form</title>
</head>
<body>
<h3> Vendor creation</h3>
 <form action="vendor-Submit" method="POST">
    <div>
			<label>Vendor Id</label>
			<input type="text" id="vendorId" name="vendorId" >
		</div>
		
		<br/>
		
		 <div>
			<label>Vendor Name</label>
			<input type="text" id="vendorName" name="vendorName" >
		</div>
		<br/>
		
		 <div>
			<label>Vendor Phone</label>
			<input type="text" id="vendorPhone" name="vendorPhone" >
		</div>
		<br/>
		
		 <div>
			<label>Vendor Email</label>
			<input type="text" id="vendorEmail" name="vendorEmail" >
		</div>
		<br/>
		
		 <div>
			<label>Vendor Address</label>
			<input type="text" id="vendorAddress" name="vendorAddress" >
		</div>
		<br/>
		
		
		<div>
		<input type="submit" style= "background-color:green; color:white;"value="create" >
 		</div>
 </form>



</body>
</html>