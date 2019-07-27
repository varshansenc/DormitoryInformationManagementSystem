package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.BuildAdm;
import serviceimpl.BuildAdmServiceImpl;

/**
 * Servlet implementation class BuildSearchServlet
 */
@WebServlet("/BuildSearchServlet")
public class BuildSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BuildSearchServlet() {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String buildAdmNo=request.getParameter("buildadmno");
		System.out.println(buildAdmNo);
		BuildAdm buildAdm=searchBuildAdm(buildAdmNo);
		request.setAttribute("ff", buildAdm);
		request.getRequestDispatcher("dormManage/dormSearch.jsp").forward(request, response);
	}

	private BuildAdm searchBuildAdm(String buildAdmNo) {
		return (new BuildAdmServiceImpl()).searchBuildAdmService(buildAdmNo); 
	}

}
