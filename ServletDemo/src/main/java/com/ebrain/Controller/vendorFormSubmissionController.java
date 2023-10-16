package com.ebrain.Controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.sql.SQLException;
import com.ebrain.dao.VendorDAO;
import com.ebrain.entity.Vendor;

/**
 * Servlet implementation class vendorFormSubmissionController
 */
@WebServlet("/vendor-Submit")
public class vendorFormSubmissionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vendorFormSubmissionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Vendor> vendors= null;
		
		try {
		 vendors= VendorDAO.getAllVendors();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		request.setAttribute("vendorList", vendors);
		request.getRequestDispatcher("vendor-list.jsp").include(request, response);
		 
		// response.sendRedirect("index.jsp");// if in vendor.jsp once my responce is activated come to index.jsp file
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String VendorId= request.getParameter("vendorId");
		String VendorName= request.getParameter("vendorName");
		String VendorPhone= request.getParameter("vendorPhone");
		String VendorEmail= request.getParameter("vendorEmail"); 
		String VendorAddress= request.getParameter("vendorAddress");
		
Vendor vendor= new Vendor(VendorId, VendorName, VendorPhone, VendorEmail, VendorAddress);

	
				try {
					VendorDAO.saveVendor(vendor);

				} catch (Exception e) 
				{
					// TODO Auto-generated catch block
					e.fillInStackTrace();
				} 
		
		doGet(request, response);
	
	}

}
