package com.ebrain.controller; //2//
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import com.ebrain.dao.StudentDao;
import com.ebrain.dto.Student;

/**
 * Servlet implementation class studentCreationConnectionController
 */
@WebServlet("/student-form")
public class studentCreationConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentCreationConnectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
List<Student> students= null;
		
		try {
		 students= StudentDao.getAllStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		request.setAttribute("studentList",students);
		request.getRequestDispatcher("studentlist.jsp").include(request, response);

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String StudentId= request.getParameter("studentId");
		String StudentName= request.getParameter("studentName");
		String StudentPhone=request.getParameter("studentPhone");
		String StudentEmail=request.getParameter("studentEmail");
		String StudentAddress= request.getParameter("studentAddress");
		String StudentDepartment=request.getParameter("studentDepartment");
		String StudentCgpa=request.getParameter("studentCgpa");
		
	Student student = new Student(Integer.parseInt(StudentId), StudentName ,StudentPhone , StudentEmail , StudentAddress, StudentDepartment , Double.parseDouble(StudentCgpa));     
		
		System.out.println(Integer.parseInt(StudentId) + StudentName + StudentPhone + StudentEmail + StudentAddress + StudentDepartment + StudentCgpa );
		
		try {
			StudentDao.saveStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.fillInStackTrace();
		}
		doGet(request, response);
		
	}

}
