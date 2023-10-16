package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.entity.Vendor;
import com.ebrain.entity.jdbcConnectivity;

public class VendorDAO {

	public static void saveVendor(Vendor vendor) throws ClassNotFoundException, SQLException {
		
		
		Connection connection = jdbcConnectivity.getConnection(); 
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_sk_vendor(vendor_id,vendor_name,vendor_email,phone,address) VALUES(?,?,?,?,?) ");
	    preparedStatement.setString(1,vendor.getVendorId());
	    preparedStatement.setString(2,vendor.getVendorName());
	    preparedStatement.setString(3,vendor.getVendorEmail());
	    preparedStatement.setString(4,vendor.getPhone());
	    preparedStatement.setString(5,vendor.getAddress());

	    preparedStatement.executeUpdate();
	    
	    	}
	public static List<Vendor> getAllVendors() throws ClassNotFoundException, SQLException {
		Connection connection = jdbcConnectivity.getConnection();
		String query ="SELECT vendor_id,vendor_name,vendor_email,phone,address from tb_sk_vendor";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);

	    ResultSet resultSet = preparedStatement.executeQuery();
	    
	    List<Vendor> vendors = new ArrayList<Vendor>();
	    
	    while (resultSet.next()) {
	    	
			String vendor_id = resultSet.getString(1);
			String vendor_name = resultSet.getString(2);
			String vendor_email = resultSet.getString(3);
			String phone = resultSet.getString(4);
			String address = resultSet.getString(5);
			Vendor vendor = new Vendor(vendor_id,vendor_name,vendor_email,phone,address);
			vendors.add(vendor);
			
		}
		return vendors;
	}
	
}
