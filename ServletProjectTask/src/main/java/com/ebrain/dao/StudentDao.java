package com.ebrain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ebrain.dto.Student;

import com.ebrain.jdbcConnectivity.jdbcConnectivity;



public class StudentDao {
public static void saveStudent(Student student) throws ClassNotFoundException, SQLException {
		
		
		Connection connection = jdbcConnectivity.getConnection(); 
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_sk_student(student_id,student_name,student_phone,student_email,student_address,student_department,student_cgpa) VALUES(?,?,?,?,?,?,?) ");
	    preparedStatement.setInt(1, student.getId());
	    preparedStatement.setString(2,student.getName());
	    preparedStatement.setString(3,student.getPhone());
	    preparedStatement.setString(4,student.getEmail());
	    preparedStatement.setString(5,student.getAddress());
	    preparedStatement.setString(6,student.getDepartment());
	    preparedStatement.setDouble(7,student.getCgpa());

	    preparedStatement.executeUpdate();
	    
}
}