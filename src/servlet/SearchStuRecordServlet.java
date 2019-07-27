package servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StuService;
import serviceimpl.StuServiceImpl;

/**
 * Servlet implementation class SearchStuRecordServlet
 */
@WebServlet("/SearchStuRecordServlet")
public class SearchStuRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SearchStuRecordServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String stuno=request.getParameter("stuno");
		System.out.println(stuno);
		StuService stuService=new StuServiceImpl();
		ResultSet resultSet=stuService.searchStuRecord(stuno);
		System.out.println(resultSet);
		request.setAttribute("ff", resultSet);
		request.getRequestDispatcher("student/stuSearchRecord.jsp").forward(request, response);
	}

}
