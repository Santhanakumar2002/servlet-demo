<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="com.ebrain.entity.Vendor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Information System</title>
</head>
<body>
<h3>Vendor Details</h3>
  
  <div>
  <button> 
  <a href="vendor-form" >
   creat new vendor 
   </a>
   </button>
  </div>
 <br/>
  
  <div> 
     <table border="2"> 
         <tr> 
         <th>Vendor Id</th>
         <th>Vendor Name</th>
         <th>Vendor Phone</th>
         <th>Vendor Email</th>
         <th>Vendor address</th>
         </tr>
         
        <%List<Vendor> vendors=(List<Vendor>)request.getAttribute("vendorList"); 
        if(null !=vendors && vendors.size()>0 ){

            for(Vendor vendor: vendors){
            %>
          
    		<tr>
    		<td><%=vendor.getVendorId() %></td>
    		<td><%=vendor.getVendorName()%></td>
    		<td><%=vendor.getVendorEmail()%></td>
    		<td><%=vendor.getPhone()%></td>
    		<td><%=vendor.getAddress()%></td>
    		</tr>
 
<% }
}else{
%> 
	<tr><td colspan="5">  No Record Found </td></tr>
            
       <% } %>
     </table>
</div>
</body>
</html>