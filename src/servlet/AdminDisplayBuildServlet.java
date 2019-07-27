package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Build;
import service.SysAdmService;
import serviceimpl.SysAdmServiceImpl;

@WebServlet("/AdminDisplayBuildServlet")
public class AdminDisplayBuildServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminDisplayBuildServlet() {}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		SysAdmService sysAdmService=new SysAdmServiceImpl();
		
		List<Build> list=new ArrayList<Build>();
		list=sysAdmService.displayBuildService();
		
		request.setAttribute("ff", list);
		request.getRequestDispatcher("admin/displayBuild.jsp").forward(request, response);
	}

}
