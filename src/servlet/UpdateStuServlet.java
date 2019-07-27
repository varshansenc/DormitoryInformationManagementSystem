package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StuService;
import serviceimpl.StuServiceImpl;

/**
 * Servlet implementation class UpdateStuServlet
 */
@WebServlet("/UpdateStuServlet")
public class UpdateStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStuServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
    	String stuno=request.getParameter("stuno");
		String stufieldname=request.getParameter("stufieldname");
		String stufieldvalue=request.getParameter("stufieldvalue");
		System.out.println(stuno+":"+stufieldname+":"+stufieldvalue);
		String string3=null;
		int i=0;
		StuService stuService=new StuServiceImpl();
		
		if ("Ñ§Éú±àºÅ".equals(stufieldname)) {
			request.getRequestDispatcher("student/updateStudent.jsp?warning=Student ID is not allowed to be modified").forward(request, response);
		}else if("ÕËºÅ".equals(stufieldname)) {
			request.getRequestDispatcher("student/updateStudent.jsp?warning=Please contact the system administrator to change the account.").forward(request, response);
		}else if("ÃÜÂë".equals(stufieldname)) {
			request.getRequestDispatcher("student/updateStudent.jsp?warning=Please contact your system administrator to change your password.").forward(request, response);
		}else if("ËÞÉáÂ¥±àºÅ".equals(stufieldname)) {
			string3="buildno";
			i=stuService.updateStuService(stuno,string3,stufieldvalue);
			if (i==0) {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update succeed!").forward(request, response);
			}
		}else if("ËÞÉáºÅ".equals(stufieldname)) {
			string3="dormno";
			i=stuService.updateStuService(stuno,string3,stufieldvalue);
			if (i==0) {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update succeed!").forward(request, response);
			}
		}else if("ÐÕÃû".equals(stufieldname)) {
			string3="stuname";
			i=stuService.updateStuService(stuno,string3,stufieldvalue);
			if (i==0) {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update succeed!").forward(request, response);
			}
		}else if("µç»°ºÅÂë".equals(stufieldname)) {
			string3="stutel";
			i=stuService.updateStuService(stuno,string3,stufieldvalue);
			if (i==0) {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update faild!").forward(request, response);
			}else {
				request.getRequestDispatcher("student/updateStudent.jsp?warning=Update succeed!").forward(request, response);
			}
		}else if ("ÐÔ±ð".equals(stufieldname)) {
			request.getRequestDispatcher("student/updateStudent.jsp?warning=Gender cannot be changed!").forward(request, response);
		}else {
			request.getRequestDispatcher("student/updateStudent.jsp?warning=Possible input error!").forward(request, response);
		}
	}
}
