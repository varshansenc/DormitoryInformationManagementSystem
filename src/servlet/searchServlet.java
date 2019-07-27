package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Stu;
import service.StuService;
import serviceimpl.StuServiceImpl;

/**
 * Servlet implementation class searchServlet
 */
@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Stu stu=new Stu();
		stu=searchStu(request,response);
		System.out.println(stu);
		String stuno=request.getParameter("stuno");
		System.out.println(stuno);
		request.setAttribute("ff", stu);
		request.getRequestDispatcher("student/mainStuSearch.jsp").forward(request, response);
	}

	private Stu searchStu(HttpServletRequest request, HttpServletResponse response) {
		//获取参数
		String stuno=request.getParameter("stuno");
		System.out.println(stuno);
		//创建service层对象
		StuService stuService=new StuServiceImpl();
		
		return stuService.searchStuService(stuno);
	}

}
