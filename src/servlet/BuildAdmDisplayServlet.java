package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Stu;
import service.BuildAdmService;
import serviceimpl.BuildAdmServiceImpl;

/**
 * Servlet implementation class BuildAdmDisplayServlet
 */
@WebServlet("/BuildAdmDisplayServlet")
public class BuildAdmDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildAdmDisplayServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		BuildAdmService buildAdmService=new BuildAdmServiceImpl();
		List<Stu> list=buildAdmService.displayStus();
		request.setAttribute("ff", list);
		request.getRequestDispatcher("dormManage/displayStu.jsp").forward(request, response);
	}

}
